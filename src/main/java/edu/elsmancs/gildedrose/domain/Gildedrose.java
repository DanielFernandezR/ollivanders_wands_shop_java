package edu.elsmancs.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class Gildedrose {

	private List<Updateable> inventory = new ArrayList<Updateable>();

	public List<Updateable> inventory() {
		return this.inventory;
	}

	public void addItem(Updateable item) {
		inventory().add(item);
	}

	public void updateQuality() {
		for (Updateable item : inventory()) {
			item.updateQuality();
		}
	}

	/**
	 * Código facilitado por el tutor
	 */
	@Override
	public String toString() {
		StringBuilder representation = new StringBuilder();
		for (Updateable item : inventory()) {
			representation.append(item.toString());
			representation.append('\n');
		}
		return representation.toString();
	}
}
