package edu.elsmancs.gildedrose.domain;

public class NormalItem {
	
	private final Item item;

	public NormalItem(String name, int sell_in, int quality) {
		this.item = new Item(name, sell_in, quality);
    }
	
	public String getName() {
		return item.getName();
	}

	public int getSell_in() {
		return item.getSell_in();
	}
	
	public int getQuality() {
		return item.getQuality();
	}
	
    private void computeQuality(int value) {
        if (getQuality() + value > 50) {
            item.setQuality(50);
        }
        else if (getQuality() + value >= 0) {
        	item.setQuality(getQuality() + value);
        }
        else {
        	item.setQuality(0);
        }
    }

    public void update_quality() {
    	if (getSell_in() > 0) {
            computeQuality(-1);
    	}
    	else {
    		computeQuality(-2);
    	}
    	item.set_Sellin();
    }
}