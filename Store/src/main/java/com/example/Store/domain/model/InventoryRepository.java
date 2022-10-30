package com.example.Store.domain.model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<CSVModel, Long> {
}

