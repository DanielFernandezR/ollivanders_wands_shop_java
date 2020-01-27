package edu.elsmancs.gildedrose;

public class NormalItem extends Item {

	public NormalItem(String name, Integer sell_in, Integer quality) {
		super(name, sell_in, quality);
    }
	

    public void set_Sellin() {
        this.sell_in -= 1;
    }

    
    public void setQuality() {
        if (this.quality > 50) {
            this.quality = 50;
        }else if (this.quality >= 0) {
            this.quality = this.quality;
        }else {
            this.quality = 0;
        }
    }


    public void update_quality() {
    	if (this.sell_in > 0) {
            this.quality -= -1;
    	}else {
    		this.quality -= -1;
    	}
    	this.set_Sellin();
    }
}