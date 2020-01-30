package edu.elsmancs.gildedrose.inheritancetests;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.Backstage;
import edu.elsmancs.gildedrose.domain.Conjured;
import edu.elsmancs.gildedrose.domain.NormalItem;
import edu.elsmancs.gildedrose.domain.Sulfuras;
import edu.elsmancs.gildedrose.domain.AgedBrie;



public class InheritanceTest {

    @Test
    public void toStringTest() {
        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        System.out.println(normal.toString());
    }

    @Test
    public void updateQualityNormalItem() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        normal.updateQuality();
        assertEquals("+5 Dexterity Vest", normal.getName());
        assertEquals(9, normal.getSell_in(), 0);
        assertEquals(19, normal.getQuality(), 0);
    }

    @Test
    public void updateQualityNormalItemSellInCERO() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 0, 20);
        normal.updateQuality();
        assertEquals(-1, normal.getSell_in(), 0);
        assertEquals(18, normal.getQuality(), 0);    
    }

    @Test
    public void updateQualityNormalItemBajoCERO() {

        NormalItem normal = new NormalItem("+5 Dexterity Vest", 10, 0);
        normal.updateQuality();
        assertEquals(9, normal.getSell_in(), 0);
        assertEquals(0, normal.getQuality(), 0);
    }
    
    @Test
    public void crearAgedBrie() {

        AgedBrie itemAB = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", itemAB.getName());
        assertEquals(2, itemAB.getSell_in(), 0);
        assertEquals(0, itemAB.getQuality(), 0);
    }
    
    @Test
    public void updateQualityAgedBrie() {

    	AgedBrie itemAB = new AgedBrie("Aged Brie", 8, 21);
        itemAB.updateQuality();
        assertEquals(7, itemAB.getSell_in(), 0);
        assertEquals(22, itemAB.getQuality(), 0);
    }
    
    @Test
    public void crearSulfuras() {

        Sulfuras itemS = new Sulfuras("Sulfuras", 10, 80);
        assertEquals("Sulfuras", itemS.getName());
        assertEquals(10, itemS.getSell_in(), 0);
        assertEquals(80, itemS.getQuality(), 0);
    }
    
    @Test
    public void updateQualitySulfuras() {

        Sulfuras itemS = new Sulfuras("Sulfuras", 8, 21);
        itemS.updateQuality();
        assertEquals(8, itemS.getSell_in(), 0);
        assertEquals(21, itemS.getQuality(), 0);
    }
    
    @Test
    public void crearBackstage() {

        Backstage itemBS = new Backstage("BackStagePass", 10, 20);
        assertEquals("BackStagePass", itemBS.getName());
        assertEquals(10, itemBS.getSell_in(), 0);
        assertEquals(20, itemBS.getQuality(), 0);
    }
    
    @Test
    public void updateQualityBackstage() {

		Backstage itemBS = new Backstage("BackStagePass", 12, 21);
        itemBS.updateQuality();
        assertEquals(11, itemBS.getSell_in(), 0);
        assertEquals(22, itemBS.getQuality(), 0);
    }
    
    @Test
	public void crearConjured() {
		Conjured conjureditem = new Conjured("Conjured Mana Cake", 10, 20);
		assertEquals("Conjured Mana Cake", conjureditem.getName());
        assertEquals(10, conjureditem.getSell_in(), 0);
        assertEquals(20, conjureditem.getQuality(), 0);
	}
    
    @Test
    public void updateQualityConjured() {

		Conjured conjureditem = new Conjured("Conjured Mana Cake", 10, 20);
        conjureditem.updateQuality();
        assertEquals(9, conjureditem.getSell_in(), 0);
        assertEquals(18, conjureditem.getQuality(), 0);
    }
}