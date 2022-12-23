package com.example.Store.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inventory")
public class CSVModel {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "code")
    private String code;

    @Column(name = "barCode")
    private String barCode;


    @Column(name = "serie")
    private String serie;

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private  String category;

    @Column(name = "price")
    private double price;

    @Column(name = "taxes")
    private double taxes;

    @Column(name = "fabrication")
    private String fabrication;

    @Column(name = "expirationDate")
    private String expirationDate;

    @Column(name = "color")
    private String color;

    @Column(name = "material")
    private String material;

    @Column(name = "quantity")
    private int quantity;



}