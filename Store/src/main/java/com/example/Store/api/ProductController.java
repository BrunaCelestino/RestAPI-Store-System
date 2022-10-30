package com.example.Store.api;
import com.example.Store.domain.Product;
import com.example.Store.domain.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService service = new ProductService();

    @GetMapping
    public List<Product> get(){

        return service.getProducts();
    }


}
