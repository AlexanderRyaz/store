package com.example.store.model;

import java.util.ArrayList;
import java.util.List;
public class Basket {
    private List<Integer> basket = new ArrayList<>();

    public void addToBasket(int id) {

        basket.add(id);
    }


    public List<Integer> getBasket() {
        return basket;
    }
}
