package com.example.store.service;

import com.example.store.model.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class CatalogService {
    private static int counter = 6;
    private static final Map<Integer, Product> catalog = new HashMap<>();

    public CatalogService() {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("apple");
        product1.setPrice(100.500);
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("orange");
        product2.setPrice(150);
        Product product3 = new Product();
        product3.setId(3);
        product3.setName("pups");
        product3.setPrice(200.50);
        Product product4 = new Product();
        product4.setId(4);
        product4.setName("fresh");
        product4.setPrice(100.20);
        Product product5 = new Product();
        product5.setId(5);
        product5.setName("bananas");
        product5.setPrice(800);
        catalog.put(1, product1);
        catalog.put(2, product2);
        catalog.put(3, product3);
        catalog.put(4, product4);
        catalog.put(5, product5);
    }
}
