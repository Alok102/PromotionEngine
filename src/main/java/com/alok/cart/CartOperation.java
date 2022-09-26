package com.alok.cart;

import com.alok.storage.Item;

public interface CartOperation {
    public void addItem(Item item);
    public void removeItem(Item item);
}
