package com.alok.cart;

import com.alok.storage.Item;

import java.util.ArrayList;
import java.util.List;


public class Cart implements CartOperation {
    public List<Item> getItemList() {
        return itemList;
    }
    private List<Item> itemList;
    public Cart(){
        itemList = new ArrayList<>();
    }
    public void addItem(Item item) {
        itemList.add(item);
    }
    @Override
    public void removeItem(Item item) {
        itemList.remove(item);
    }
}
