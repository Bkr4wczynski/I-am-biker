package com.bikerapp.web_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage() {
        return "index";
    }
}
