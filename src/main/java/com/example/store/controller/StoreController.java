package com.example.store.controller;

import com.example.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
@RequestMapping("/order")
public class StoreController {
    @Autowired
    private StoreService storeService;
@PostMapping("add")
public void add(@RequestParam("ids") int[] ids){
    storeService.add(ids);
}
@GetMapping("get")
    public List<Integer>get(HttpServletRequest request){
    return storeService.get();
}
}
