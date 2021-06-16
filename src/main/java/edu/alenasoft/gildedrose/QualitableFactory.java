package edu.alenasoft.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class QualitableFactory {
    static Map<String, Qualitable> qualitableMap;

    public QualitableFactory() {
        qualitableMap = new HashMap<>();
        qualitableMap.put("+5 Dexterity Vest", new FiveDexterityVest());
        qualitableMap.put("Aged Brie", new AgeBrie());
        qualitableMap.put("Elixir of the Mongoose", new ElixirMongoose());
        qualitableMap.put("Sulfuras, Hand of Ragnaros", new SulfurasHandRagnaros());
        qualitableMap.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePasses());
        qualitableMap.put("Conjured Mana Cake", new ConjuredManaCake());
    }


    public Qualitable findQualitableInstance(Item item) {

        Qualitable qualitableItem = qualitableMap.get(item.getName());
        return qualitableItem;
    }

}
