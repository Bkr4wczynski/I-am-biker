package com.bikerapp.web_service.web_service.controller;

import com.bikerapp.web_service.web_service.model.Bike;
import com.bikerapp.web_service.web_service.model.Engine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class ProfilePageController {
    @GetMapping("/my-profile")
    public String displayProfilePage(Model model) {
        Bike bike = new Bike();
        bike.setModel("Yamaha DT");
        bike.setEngine(new Engine(125, 20, "2-Stroke"));
        bike.setRegistry_date(LocalDate.of(2000, 5, 20));
        bike.setMileage(35000);
        model.addAttribute("bike", bike);
        return "myProfile";
    }

}
