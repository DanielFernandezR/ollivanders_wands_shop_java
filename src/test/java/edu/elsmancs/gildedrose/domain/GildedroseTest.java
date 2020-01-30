package edu.elsmancs.gildedrose.domain;

import java.util.List;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GildedroseTest {
	
	private Gildedrose shop = null;
	private NormalItem normal = null;
	private AgedBrie queso = null;
	private Sulfuras mortadela = null;
	private Backstage patatas = null;
	
	@Before
	public void setupInventario() {
		shop = new Gildedrose();
		normal = new NormalItem("+5 Dexterity Vest", 10, 20);
		queso = new AgedBrie("Aged Brie", 2, 0);
		mortadela = new Sulfuras("Sulfuras", 8, 80);
		patatas = new Backstage("BackStagePass", 3, 20);
	}
	
	@Test
	public void addItemTest() {
		shop.addItem(normal);
		shop.addItem(queso);
		shop.addItem(mortadela);
		shop.addItem(patatas);
		assertEquals(4, shop.inventory().size(), 0);
		List<NormalItem> objetos = List.of(normal, queso, mortadela, patatas);
		assertArrayEquals(objetos.toArray(), shop.inventory().toArray());
	}
	
	@Test
	public void updateQualityTest() {
		shop.addItem(normal);
		shop.addItem(queso);
		shop.addItem(mortadela);
		shop.addItem(patatas);
		shop.updateQuality();
		assertEquals(19, shop.inventory().get(0).getQuality(), 0);
		assertEquals(9, shop.inventory().get(0).getSell_in(), 0);
		assertEquals(1, shop.inventory().get(1).getQuality(), 0);
		assertEquals(1, shop.inventory().get(1).getSell_in(), 0);
		assertEquals(80, shop.inventory().get(2).getQuality(), 0);
		assertEquals(8, shop.inventory().get(2).getSell_in(), 0);
		assertEquals(23, shop.inventory().get(3).getQuality(), 0);
		assertEquals(2, shop.inventory().get(3).getSell_in(), 0);
	}
}
