package com.example.Store.api;
import com.example.Store.domain.Product;
import com.example.Store.domain.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public Iterable<Product> get(){

        return service.getProducts();
    }

    @PostMapping
    public void post(@RequestBody Product product){
        service.save(product);
    }

}
