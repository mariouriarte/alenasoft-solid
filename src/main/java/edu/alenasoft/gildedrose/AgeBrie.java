package edu.alenasoft.gildedrose;

public class AgeBrie implements Qualitable {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() <50 ) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
