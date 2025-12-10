package com.example.SpringBootKitchen.repository;

import com.example.SpringBootKitchen.entity.QuoteRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRequestRepository extends JpaRepository<QuoteRequest, Long> {}
