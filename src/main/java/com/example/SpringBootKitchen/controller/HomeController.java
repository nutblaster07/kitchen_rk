package com.example.SpringBootKitchen.controller;


import com.example.SpringBootKitchen.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", productService.getAll());
        return "products";
    }
}
