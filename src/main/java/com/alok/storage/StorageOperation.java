package com.alok.storage;

import java.util.List;

public interface StorageOperation {
    public void addItem(Item item);
    public void addItemToCart(Item item);
    public void checkout();
    public double getCartTotal();
    public List<Item> getItems();
    public void deleteItemFromCart(String sku);

}
