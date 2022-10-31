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

    public Product(String code, String barCode, String serie, String name, String description, String category, double price, double taxes, String fabrication, String expirationDate, String color, String material, int quantity) {
        this.code = code;
        this.barCode = barCode;
        this.serie = serie;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.taxes = taxes;
        this.fabrication = fabrication;
        this.expirationDate = expirationDate;
        this.color = color;
        this.material = material;
        this.quantity = quantity;
    }
}
