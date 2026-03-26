package com.javaweatherproject.javaweatherapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping ("/")
    public String index() {
        return "This is my Weather App";
    }
}
