package org.example;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private Map<Product, Integer> products;

    public Inventory() {
        this.products = new ConcurrentHashMap<>();
    }

    public void addProduct(Product product, Integer count) {
        products.put(product, count);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Integer getCount(Product product) {
        return products.getOrDefault(product, 0);
    }

    public void showProducts() {
        for(Map.Entry<Product, Integer> entry: products.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}
