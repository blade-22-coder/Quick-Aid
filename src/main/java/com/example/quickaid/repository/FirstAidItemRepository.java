package com.example.quickaid.repository;

import com.example.quickaid.model.FirstAidItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FirstAidItemRepository extends JpaRepository<FirstAidItem, Long> {
}
