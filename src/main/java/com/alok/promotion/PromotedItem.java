package com.alok.promotion;

import com.alok.storage.Item;

public class PromotedItem {
    public PromotedItem(Item item, int count) {
        this.item = item;
        this.count = count;
    }
    public Item getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }
    private Item item;
    private int count;
}
