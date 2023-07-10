package com.example.project.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubController {
    
    @GetMapping("/")
    public String getClubName() {
        return "Hello World!";
    }
}
