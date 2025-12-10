package com.example.SpringBootKitchen.service;

import com.example.SpringBootKitchen.entity.Customer;
import com.example.SpringBootKitchen.entity.QuoteRequest;
import com.example.SpringBootKitchen.repository.CustomerRepository;
import com.example.SpringBootKitchen.repository.QuoteRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuoteService {

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private QuoteRequestRepository quoteRepo;

    public void saveQuote(Customer customer, List<String> products) {
        Customer savedCustomer = customerRepo.save(customer);

        for (String p : products) {
            QuoteRequest qr = new QuoteRequest();
            qr.setProductName(p);
            qr.setStatus("NEW");
            qr.setCustomer(savedCustomer);
            quoteRepo.save(qr);
        }
    }
}
