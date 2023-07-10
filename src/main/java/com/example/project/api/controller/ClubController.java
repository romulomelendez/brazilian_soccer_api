package com.example.project.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.api.model.Club;

@RestController
public class ClubController {
    
    @GetMapping("/clubs")
    public String getAllClubs() {
        return "Hello World!";
    }

    @GetMapping("/clubs/{clubName}")
    public String getClub(@PathVariable String clubName) {
        return clubName;
    }
}
