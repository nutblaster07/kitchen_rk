package com.example.SpringBootKitchen.controller;

import com.example.SpringBootKitchen.entity.Product;
import com.example.SpringBootKitchen.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;   // ✅ MUST BE THIS IMPORT
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller   // ✅ THIS IS 100% REQUIRED
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String adminHome() {
        return "redirect:/admin/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", productService.getAll());
        return "admin/product_list";
    }

    @GetMapping("/products/add")
    public String addForm(Model model) {
        model.addAttribute("product", new Product());
        return "admin/add_product";
    }

    @PostMapping("/products/add")
    public String save(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/admin/products";
    }
    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return "redirect:/admin/products";
    }

}
