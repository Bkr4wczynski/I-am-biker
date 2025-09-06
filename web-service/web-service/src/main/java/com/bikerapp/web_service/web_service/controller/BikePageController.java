package com.bikerapp.web_service.web_service.controller;

import com.bikerapp.web_service.web_service.model.Bike;
import com.bikerapp.web_service.web_service.model.Engine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class BikePageController {
    @GetMapping("/my-bike")
    public String displayMyBikePage(Model model) {
        Bike sampleBike = new Bike();
        sampleBike.setModel("Kawasaki z650");
        sampleBike.setMileage(30000);
        sampleBike.setRegistry_date(LocalDate.of(2020, 4, 12));
        sampleBike.setEngine(new Engine(650, 68, "4-Stroke"));
        model.addAttribute("bike", sampleBike);
        return "myBike";
    }
}
