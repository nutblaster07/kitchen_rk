package com.example.SpringBootKitchen.controller;

import com.example.SpringBootKitchen.entity.Customer;
import com.example.SpringBootKitchen.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @PostMapping("/request-quote")
    public String submitQuote(
            @ModelAttribute Customer customer,
            @RequestParam List<String> productNames
    ) {
        quoteService.saveQuote(customer, productNames);
        return "redirect:/";
    }
}
