package com.example.SpringBootKitchen.service;

import com.example.SpringBootKitchen.entity.Product;
import com.example.SpringBootKitchen.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    // ✅ Constructor Injection (fixes repo = null)
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public void save(Product p) {
        repo.save(p);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
