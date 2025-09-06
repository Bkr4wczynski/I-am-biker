package com.bikerapp.web_service.web_service.controller;

import com.bikerapp.web_service.web_service.model.Bike;
import com.bikerapp.web_service.web_service.model.Engine;
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
