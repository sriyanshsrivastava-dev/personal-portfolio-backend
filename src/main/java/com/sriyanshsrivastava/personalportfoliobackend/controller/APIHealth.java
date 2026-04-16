package com.sriyanshsrivastava.personalportfoliobackend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIHealth {

    @GetMapping("/health")
    public String apiHealth(){
        return "API is Running OK";
    }
}
