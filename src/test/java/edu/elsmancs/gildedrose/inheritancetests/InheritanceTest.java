package edu.elsmancs.gildedrose.inheritancetests;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.NormalItem;
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
    
    public void updateQualityAgedBrie() {

        AgedBrie itemAB = new AgedBrie("Aged Brie", 8, 21);
        itemAB.updateQuality();
        assertEquals(7, itemAB.getSell_in(), 0);
        assertEquals(22, itemAB.getQuality(), 0);
    }
}