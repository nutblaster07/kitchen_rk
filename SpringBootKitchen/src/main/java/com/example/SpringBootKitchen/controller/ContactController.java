package com.example.SpringBootKitchen.controller;



import com.example.SpringBootKitchen.entity.Customer;
import com.example.SpringBootKitchen.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    private QuoteService quoteService;

    // ✅ OPEN CONTACT / GET QUOTE PAGE
    @GetMapping("/contact")
    public String contactPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "contact";   // this will open contact.html
    }

    // ✅ SUBMIT CONTACT FORM
    @PostMapping("/contact-submit")
    public String submitContact(
            @ModelAttribute Customer customer
    ) {
        // Since this is a "direct quote request without product selection"
        quoteService.saveQuote(customer, List.of("Direct Contact Quote"));

        return "redirect:/?success";
    }
}

