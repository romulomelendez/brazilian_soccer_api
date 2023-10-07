package com.example.project.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.api.model.Club;
import com.example.project.api.repository.ClubRepository;

@RestController
public class ClubController {

    @Autowired
    private ClubRepository repo;
    
    @GetMapping("/clubs")
    public Iterable<Club> getAllClubs() {
        return repo.findAll();
    }

    @GetMapping("/clubs/{clubName}")
    public Club getClub(@PathVariable String clubName) {
        return repo.findByName(clubName);
    }

    @PostMapping("/create/club")
    public Club createClub(@RequestBody Club clubData) {
        return repo.save(clubData);
    }

    @PutMapping("/clubs/update")
    public Club updateClub(@RequestBody Club newClubData) {
        return repo.save(newClubData);
    }
}
