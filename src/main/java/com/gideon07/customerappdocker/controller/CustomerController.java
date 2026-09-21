package com.gideon07.customerappdocker.controller;

import com.gideon07.customerappdocker.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @GetMapping
    public List<Customer> getAllCustomer() {
        return Arrays.asList(
                new Customer(1, "John Doe", "Lekki", "Male"),
                new Customer(2, "Reynard Wilson", "Ajah", "Male"),
                new Customer(3, "Pearl Wilson", "Ikeja", "Female"),
                new Customer(4, "Perculia Jackson", "Ikoi", "Female")
        );
    }
}