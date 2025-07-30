package com.example.quickaid.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class FirstAidItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String itemName;
    private int quantity;
    private LocalDate expiryDate;
    private String location;

    public FirstAidItem() {}

    public FirstAidItem(long id, String itemName, int quantity, LocalDate expiryDate, String location) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.location = location;
    }


}
