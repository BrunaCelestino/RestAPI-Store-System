package com.example.Store.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository rep;

    public Iterable <Product> getProducts(){
        return rep.findAll();
    }

    public List<Product> getProductsFake() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "121212", "123524323", "10/2022", "Teclado", "Teclado elétrico", "Tecnologia", 250.00,5.5, "30/10/2022", "n/a", "preto", "plástico", 12));


        return products;
    }


    public String save(Product product) {
        Product prod = rep.save(product);
        return "Produto cadastrado com sucesso";
    }
}
