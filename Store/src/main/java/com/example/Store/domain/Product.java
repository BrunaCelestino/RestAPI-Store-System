package com.example.Store.domain;

public class Product {
    private long id;
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
    int quantity;

    public Product(long id, String code, String barCode, String serie, String name, String description, String category, double price, double taxes, String fabrication, String expirationDate, String color, String material, int quantity) {
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
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public String getFabrication() {
        return fabrication;
    }

    public void setFabrication(String fabrication) {
        this.fabrication = fabrication;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
