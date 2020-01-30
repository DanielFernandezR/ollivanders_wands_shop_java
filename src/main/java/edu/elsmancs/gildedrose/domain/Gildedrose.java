package edu.elsmancs.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class Gildedrose {
	
	private List<NormalItem> items = new ArrayList<NormalItem>();
	
	public void addItem(NormalItem item) {
		items.add(item);
	}
	
	public List<NormalItem> inventory() {
		return this.items;
	}
	
	public void updateQuality() {
		for (NormalItem item : items) {
			item.updateQuality();
		}
	}
}
