package edu.elsmancs.gildedrose.domain;

import java.util.List;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GildedroseTest {
	
	private Gildedrose shop = null;
	private NormalItem normal = null;
	private AgedBrie queso = null;
	
	@Before
	public void setupInventario() {
		shop = new Gildedrose();
		normal = new NormalItem("+5 Dexterity Vest", 10, 20);
		queso = new AgedBrie("Aged Brie", 2, 0);
	}
	
	@Test
	public void addItemTest() {
		shop.addItem(normal);
		shop.addItem(queso);
		assertEquals(2, shop.inventory().size(), 0);
		List<NormalItem> objetos = List.of(normal, queso);
		assertArrayEquals(objetos.toArray(), shop.inventory().toArray());
	}
	
	@Test
	public void updateQualityTest() {
		shop.addItem(normal);
		shop.addItem(queso);
		shop.updateQuality();
		assertEquals(19, shop.inventory().get(0).getQuality(), 0);
		assertEquals(9, shop.inventory().get(0).getSell_in(), 0);
		assertEquals(1, shop.inventory().get(1).getQuality(), 0);
		assertEquals(1, shop.inventory().get(1).getSell_in(), 0);
	}
}
