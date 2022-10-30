package com.example.Store.domain.model;
import lombok.*;


import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String code;
    private String barCode;
    private String serie;
    private String name;
    private String description;
    private  String category;
    private double price;
    private double taxes;
    private String fabrication;
    private String expirationDate;
    private String color;
    private String material;
    private int quantity;






}
