package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.Backstage;

public class BackstageTest {
	
	@Test
    public void crearBackstage() {

        Backstage itemBS = new Backstage("BackStagePass", 10, 20);
        assertEquals("BackStagePass", itemBS.getName());
        assertEquals(10, itemBS.getSell_in(), 0);
        assertEquals(20, itemBS.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
    	Backstage itemBS = new Backstage("BackStagePass", 12, 20);
        System.out.println(itemBS.toString());
    }
	
	@Test
    public void updateQualityBackstage() {

		Backstage itemBS = new Backstage("BackStagePass", 12, 21);
        itemBS.updateQuality();
        assertEquals(11, itemBS.getSell_in(), 0);
        assertEquals(22, itemBS.getQuality(), 0);
    }
	
	@Test
    public void updateQualityBackstageSell_in_menor_diez() {

		Backstage itemBS = new Backstage("BackStagePass", 9, 23);
        itemBS.updateQuality();
        assertEquals(8, itemBS.getSell_in(), 0);
        assertEquals(25, itemBS.getQuality(), 0);
    }
	
	@Test
    public void updateQualityBackstageSell_in_menor_cinco() {

		Backstage itemBS = new Backstage("BackStagePass", 3, 25);
        itemBS.updateQuality();
        assertEquals(2, itemBS.getSell_in(), 0);
        assertEquals(28, itemBS.getQuality(), 0);
    }
	
	@Test
    public void updateQualityBackstageSell_in_cero() {

		Backstage itemBS = new Backstage("BackStagePass", 0, 25);
        itemBS.updateQuality();
        assertEquals(-1, itemBS.getSell_in(), 0);
        assertEquals(0, itemBS.getQuality(), 0);
    }
	
	@Test
    public void updateQualityBackstageSell_in_negativo() {

		Backstage itemBS = new Backstage("BackStagePass", -1, 25);
        itemBS.updateQuality();
        assertEquals(-2, itemBS.getSell_in(), 0);
        assertEquals(0, itemBS.getQuality(), 0);
    }
}

