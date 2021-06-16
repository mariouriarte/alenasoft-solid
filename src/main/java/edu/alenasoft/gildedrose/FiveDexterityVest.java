package edu.alenasoft.gildedrose;

// item normal
public class FiveDexterityVest implements Qualitable {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0 ) {
            item.setQuality(item.getQuality() - 1);

            if( item.getSellIn() < 1  && item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
}
