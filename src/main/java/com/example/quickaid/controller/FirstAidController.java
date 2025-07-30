package com.example.quickaid.controller;


import com.example.quickaid.model.FirstAidItem;
import com.example.quickaid.service.FirstAidService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class FirstAidController {

    private final FirstAidService service;

    public FirstAidController(FirstAidService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<FirstAidItem> getAllItems() {
        return service.getAllItems();
    }
    @GetMapping("/{id}")
    public FirstAidItem getItem(@RequestBody FirstAidItem item) {
        return service.saveItem(item);
    }
    @PutMapping("/{id}")
    public FirstAidItem updateItem(@RequestBody FirstAidItem item) {
        return service.saveItem(item);
    }
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable long id) {
        service.deleteItem(new FirstAidItem());
    }
    @PostMapping("/{id}")
    public FirstAidItem createItem(@RequestBody FirstAidItem item) {
        return service.saveItem(item);
    }




}
