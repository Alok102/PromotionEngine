package com.alok.storage;

import java.util.Objects;

public class Item {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.price, price) != 0) return false;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    private String id;
    private double price;

    public Item(String id, double price) {
        this.id = id;
        this.price = price;
    }
    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
