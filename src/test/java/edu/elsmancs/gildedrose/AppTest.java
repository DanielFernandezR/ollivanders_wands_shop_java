package edu.elsmancs.gildedrose;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void crearItem() {

    	Item item = new Item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals("10", item.getSell_in().toString());
        assertEquals("20", item.getQuality().toString());
    }
    
    @Test
    public void normalItem_works() {

    	NormalItem item = new NormalItem("+5 Dexterity Vest", 10, 20);
        item.update_quality();
        item.setQuality();
        
        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals("9", item.getSell_in().toString());
        assertEquals("19", item.getQuality().toString());
    }
}