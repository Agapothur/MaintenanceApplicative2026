package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void doBrie(int i){
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
        }

        items[i].sellIn = items[i].sellIn - 1;

        if (items[i].sellIn < 0) {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
            }
        }
    }

    public void doPass(int i){
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;

            if (items[i].sellIn < 11) {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }

            if (items[i].sellIn < 6) {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }

        }

        items[i].sellIn = items[i].sellIn - 1;


        if (items[i].sellIn < 0) {
            items[i].quality = items[i].quality - items[i].quality;
        }
    }

    public void doSulfuras(int i){
        if (items[i].sellIn < 0) {
            items[i].quality = items[i].quality - items[i].quality;
        }
    }

    public void doOther(int i){
        if (items[i].quality > 0) {
            items[i].quality = items[i].quality - 1;
        }

        items[i].sellIn = items[i].sellIn - 1;

        if (items[i].sellIn < 0) {
            if (items[i].quality > 0) {
                    items[i].quality = items[i].quality - 1;

            }
        }
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "Aged Brie" -> doBrie(i);
                case "Sulfuras, Hand of Ragnaros" -> doSulfuras(i);
                case "Backstage passes to a TAFKAL80ETC concert" -> doPass(i);
                case null, default -> doOther(i);
            }
        }
    }
}
