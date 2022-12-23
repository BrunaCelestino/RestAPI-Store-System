package com.example.Store.api;
import com.example.Store.domain.service.ProductService;
import com.example.Store.domain.model.Product;
import com.example.Store.domain.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity get(){

        return ResponseEntity.ok(service.getProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id){
        Optional<ProductDTO> product = service.getProductById(id);

        return product
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

    @GetMapping("/category/{category}")
    public ResponseEntity getByCategory(@PathVariable("category") String category){
        List<ProductDTO> product = service.getProductByCategory(category);

        return product.isEmpty() ? ResponseEntity.noContent().build() :
                ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity post(@RequestBody Product product){
        try{

            ProductDTO newProduct = service.insert(product);
            URI location = getUri(newProduct.getId());
            return ResponseEntity.created(location).build();

        }catch (Exception ex) {
            return ResponseEntity.badRequest().build();

        }

    }

    private URI getUri(Long id) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(id).toUri();
    }

    @PutMapping("/{id}")
    public ResponseEntity put(@PathVariable("id") Long id, @RequestBody Product product){
        ProductDTO updatedProduct = service.update(product, id);
        return  updatedProduct != null ? ResponseEntity.ok(updatedProduct) :
                ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id){
        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok().build() :
                ResponseEntity.notFound().build();
    }

}
