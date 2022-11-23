package com.example.store.service;

import com.example.store.model.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private Basket basket;

    public void add(String sessionId, int... ids) {
        for (int id : ids) {
            basket.addToBasket(id,sessionId);
        }
    }

    public List<Integer> get(String sessionId) {
        return basket.getBasket(sessionId);
    }
}
