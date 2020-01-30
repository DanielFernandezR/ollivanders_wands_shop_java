package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;


public class ConjuredTest {
	
	@Test
	public void crearConjured() {
		Conjured conjureditem = new Conjured("Conjured Mana Cake", 10, 20);
		assertEquals("Conjured Mana Cake", conjureditem.getName());
        assertEquals(10, conjureditem.getSell_in(), 0);
        assertEquals(20, conjureditem.getQuality(), 0);
	}
	
	@Test
    public void toStringTest() {
		Conjured conjureditem = new Conjured("Conjured Mana Cake", 10, 20);
        System.out.println(conjureditem.toString());
    }
	
	@Test
    public void updateQualityConjured() {

		Conjured conjureditem = new Conjured("Conjured Mana Cake", 10, 20);
        conjureditem.updateQuality();
        assertEquals(9, conjureditem.getSell_in(), 0);
        assertEquals(18, conjureditem.getQuality(), 0);
    }

    @Test
    public void updateQualityConjuredSellInCERO() {

    	Conjured conjureditem = new Conjured("Conjured Mana Cake", 0, 20);
        conjureditem.updateQuality();
        assertEquals(-1, conjureditem.getSell_in(), 0);
        assertEquals(16, conjureditem.getQuality(), 0);    
    }

    @Test
    public void updateQualityConjuredSellInBajoCERO() {

    	Conjured conjureditem = new Conjured("Conjured Mana Cake", -2, 6);
        conjureditem.updateQuality();
        assertEquals(-3, conjureditem.getSell_in(), 0);
        assertEquals(2, conjureditem.getQuality(), 0);
    }
}
