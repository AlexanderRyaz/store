package com.example.store.service;

import com.example.store.model.Basket;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@SessionScope
@Service
public class StoreService {
    private final Basket basket = new Basket();

    public void add(int... ids) {
        for (int id : ids) {
            basket.addToBasket(id);
        }
    }

    public List<Integer> get() {
        return basket.getBasket();
    }
}
