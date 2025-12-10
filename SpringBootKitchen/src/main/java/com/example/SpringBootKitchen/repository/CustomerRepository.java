package com.example.SpringBootKitchen.repository;


import com.example.SpringBootKitchen.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}