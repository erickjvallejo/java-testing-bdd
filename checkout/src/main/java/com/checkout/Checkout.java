package com.checkout;

import java.util.HashMap;
import java.util.Map;

public class Checkout {

    private int runningTotal;
    private Map<String, Integer> products;

    public Checkout() {
        this.products = new HashMap<>();
        this.runningTotal = 0;
    }

    public void definePriceProduct(String name, int price) {
        this.products.put(name, price);
    }

    public void addProductToShoppingCar(int itemCount, String itemName) {
        int price = this.products.get(itemName);
        this.runningTotal += itemCount * price;
    }

    public int getTotal() {
        return this.runningTotal;
    }


}
