package com.example.Store.domain.service;
import java.io.IOException;
import java.util.List;
import com.example.Store.domain.helper.CSVHelper;
import com.example.Store.domain.model.CSVModel;
import com.example.Store.domain.model.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {

    @Autowired
     InventoryRepository repository;

    public void save(MultipartFile file) {
        try {
            Iterable<CSVModel> inventory = CSVHelper.csvToProducts(file.getInputStream());
            repository.saveAll(inventory);

        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<CSVModel> getAllProducts() {
        return repository.findAll();
    }
}
