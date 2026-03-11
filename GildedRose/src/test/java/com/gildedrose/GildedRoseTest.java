package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testNone(){
        Item[] items = new Item[] { new Item("None", 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("None", app.items[0].name);
    }

    @Test
    void testNone2(){
        Item[] items = new Item[] { new Item("None", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("None", app.items[0].name);
    }

    @Test
    void testAgedBrie(){
         Item[] items = new Item[] { new Item("Aged Brie", 0, 0) };
         GildedRose app = new GildedRose(items);
         app.updateQuality();
         assertEquals("Aged Brie", app.items[0].name);
    }

    @Test
    void testBackstagePasses(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
    }

    @Test
    void testSulfuras(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
    }

}
