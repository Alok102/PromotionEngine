package com.alok.cart;

import com.alok.storage.Item;

public class CartItems {
    private Item item;
    public CartItems(Item item, boolean isPromotionAllowed) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}
