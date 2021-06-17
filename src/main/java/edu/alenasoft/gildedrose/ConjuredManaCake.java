package edu.alenasoft.gildedrose;

// item decrementa el doble
public class ConjuredManaCake extends AbstractQualitable implements Qualitable {
    @Override
    public void updateQuality(Item item) {
        calculateQuality(item);
        calculateQuality(item);
    }

    public void calculateQuality(Item item) {
        if (item.getQuality() > 0 ) {
            item.setQuality(item.getQuality() - 1);

            if( item.getSellIn() < 1 && item.getQuality() > 0) {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }
}
