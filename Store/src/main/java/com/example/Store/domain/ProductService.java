package com.example.Store.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "121212", "123524323", "10/2022", "Teclado", "Teclado elétrico", "Tecnologia", 250.00,5.5, "30/10/2022", "n/a", "preto", "plástico", 12));


        return products;
    }
}
