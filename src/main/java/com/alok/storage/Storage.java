package com.alok.storage;

import com.alok.cart.Cart;

import java.util.ArrayList;
import java.util.List;

public class Storage implements StorageOperation {
    private Cart cart;
    private List<Item> itemsList;
    public Storage(){
        cart = new Cart();
        itemsList = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        itemsList.add(item);
    }

    @Override
    public void addItemToCart(Item item) {
        cart.addItem(item);
    }

    @Override
    public void checkout() {

    }

    @Override
    public double getCartTotal() {
        return 0;
    }

    @Override
    public List<Item> getItems() {
        return itemsList;
    }

    @Override
    public void deleteItemFromCart(String sku) {

    }
}
