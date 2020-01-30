package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.Sulfuras;

public class SulfurasTest {
	
	@Test
    public void crearSulfuras() {

        Sulfuras itemS = new Sulfuras("Sulfuras", 10, 80);
        assertEquals("Sulfuras", itemS.getName());
        assertEquals(10, itemS.getSell_in(), 0);
        assertEquals(80, itemS.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Sulfuras itemS = new Sulfuras("Sulfuras", 10, 80);
        System.out.println(itemS.toString());
    }
	
	@Test
    public void updateQualitySulfuras() {

        Sulfuras itemS = new Sulfuras("Sulfuras", 8, 21);
        itemS.updateQuality();
        assertEquals(8, itemS.getSell_in(), 0);
        assertEquals(21, itemS.getQuality(), 0);
    }
	
	@Test
    public void updateQualitySulfurasSell_in_Cero() {

        Sulfuras itemS = new Sulfuras("Sulfuras", 0, 23);
        itemS.updateQuality();
        assertEquals(0, itemS.getSell_in(), 0);
        assertEquals(23, itemS.getQuality(), 0);
    }
	
	@Test
    public void updateQualitySulfurasBajoCero() {

        Sulfuras itemS = new Sulfuras("Sulfuras", -4, 23);
        itemS.updateQuality();
        assertEquals(-4, itemS.getSell_in(), 0);
        assertEquals(23, itemS.getQuality(), 0);
    }

}
