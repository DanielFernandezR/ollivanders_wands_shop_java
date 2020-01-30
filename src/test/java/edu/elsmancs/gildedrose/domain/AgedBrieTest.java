package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.AgedBrie;

public class AgedBrieTest {
	
	@Test
    public void crearAgedBrie() {

        AgedBrie itemAB = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", itemAB.getName());
        assertEquals(2, itemAB.getSell_in(), 0);
        assertEquals(0, itemAB.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        AgedBrie itemAB = new AgedBrie("Aged Brie", 2, 0);
        System.out.println(itemAB.toString());
    }
	
	@Test
    public void updateQualityAgedBrie() {

        AgedBrie itemAB = new AgedBrie("Aged Brie", 8, 21);
        itemAB.updateQuality();
        assertEquals(7, itemAB.getSell_in(), 0);
        assertEquals(22, itemAB.getQuality(), 0);
    }
	
	@Test
    public void updateQualityAgedBrieSell_in_Cero() {

        AgedBrie itemAB = new AgedBrie("Aged Brie", 0, 23);
        itemAB.updateQuality();
        assertEquals(-1, itemAB.getSell_in(), 0);
        assertEquals(25, itemAB.getQuality(), 0);
    }
	
	@Test
    public void updateQualityAgedBrieBajoCero() {

        AgedBrie itemAB = new AgedBrie("Aged Brie", -4, 23);
        itemAB.updateQuality();
        assertEquals(-5, itemAB.getSell_in(), 0);
        assertEquals(25, itemAB.getQuality(), 0);
    }
}
