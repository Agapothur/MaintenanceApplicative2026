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
    void testNone1(){
        Item[] items = new Item[] { new Item("None", 0, 99) };
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
    void testNone3(){
        Item[] items = new Item[] { new Item("None", 1, 0) };
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
    void testAgedBrie1(){
        Item[] items = new Item[] { new Item("Aged Brie", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
    }

    @Test
    void testAgedBrie2(){
        Item[] items = new Item[] { new Item("Aged Brie", 5, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
    }

    @Test
    void testAgedBrie3(){
        Item[] items = new Item[] { new Item("Aged Brie", 5, 55) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
    }

    @Test
    void testAgedBrie4(){
        Item[] items = new Item[] { new Item("Aged Brie", -5, 55) };
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
    void testBackstagePasses1(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
    }

    @Test
    void testBackstagePasses2(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
    }

    @Test
    void testBackstagePasses3(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
    }

    @Test
    void testBackstagePasses4(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 60) };
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

    @Test
    void testSulfuras1(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
    }

    @Test
    void testSulfuras2(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
    }

    @Test
    void testSulfuras3(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 55) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
    }

    @Test
    void testSulfuras4(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -5, 55) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
    }

    @Test
    void testSulfuras5(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -5, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
    }

}
