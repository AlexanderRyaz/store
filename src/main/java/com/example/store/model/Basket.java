package com.example.store.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Basket {
    private Map<String, List<Integer>> basket = new HashMap<>();

    public void addToBasket(int id, String sessionId) {
        List<Integer> integers = basket.get(sessionId);
        if (integers == null) {
            List<Integer> ids = new ArrayList<>();
            ids.add(id);
        } else {
            integers.add(id);
        }

    }

    public List<Integer> getBasket(String sessionId) {
        return basket.get(sessionId);
    }
}
