package com.example.quickaid.service;


import com.example.quickaid.model.FirstAidItem;
import com.example.quickaid.repository.FirstAidItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstAidService {

    private final FirstAidItemRepository repository;

    public FirstAidService(FirstAidItemRepository repository) {
        this.repository = repository;
    }
    public List<FirstAidItem> getAllItems() {
        return repository.findAll();
    }
    public FirstAidItem saveItem(FirstAidItem item) {
        return repository.save(item);
    }
    public void deleteItem(FirstAidItem item) {
        repository.delete(item);
    }
}
