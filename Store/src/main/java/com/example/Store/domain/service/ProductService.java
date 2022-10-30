package com.example.Store.domain.service;

import com.example.Store.domain.dto.ProductDTO;
import com.example.Store.domain.model.Product;
import com.example.Store.domain.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository rep;

    public List <ProductDTO> getProducts(){
        return rep.findAll().stream().map(ProductDTO::create).collect(Collectors.toList());
    }

    public List<Product> getProductsFake() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "121212", "123524323", "10/2022", "Teclado", "Teclado elétrico", "Tecnologia", 250.00,5.5, "30/10/2022", "n/a", "preto", "plástico", 12));


        return products;
    }


    public Product save(Product product) {
        return rep.save(product);
    }

    public Optional<ProductDTO> getProductById(Long id) {
        return rep.findById(id).map(ProductDTO::create);
    }


    public List<ProductDTO> getProductByCategory(String category) {
        return rep.findByCategory(category).stream().map(ProductDTO::create).collect(Collectors.toList());
    }

    public ProductDTO insert(Product product) {
        Assert.isNull(product.getId(), "Não foi possível cadastrar um novo produto");
        return ProductDTO.create(rep.save(product));
    }

    public ProductDTO update(Product product, Long id) {
        Assert.isNull(product.getId(), "Não foi possível atualizar o produto");

        Optional<Product> optional = rep.findById(id);
        if(optional.isPresent()){
            Product db = optional.get();
            db.setName(product.getName());
            db.setPrice(product.getPrice());
            db.setQuantity(product.getQuantity());
            db.setCategory(product.getCategory());
            db.setDescription(product.getDescription());
            System.out.println("Produto ID" + db.getId());

            rep.save(db);

            return ProductDTO.create(db);
        } else {
            return null;
        }
    }

    public boolean delete(Long id) {
        Optional<ProductDTO> product = getProductById(id);
        if(product.isPresent()){
            rep.deleteById(id);
            return true;
        } else {
            return false;
        }

    }
}
