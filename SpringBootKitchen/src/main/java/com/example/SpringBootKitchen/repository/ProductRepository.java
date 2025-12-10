package com.example.SpringBootKitchen.repository;

import com.example.SpringBootKitchen.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}