package com.example.Store.domain.dto;

import com.example.Store.domain.model.Product;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class ProductDTO {
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
    int quantity;

    public static ProductDTO create(Product product) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(product, ProductDTO.class);
    }


}
