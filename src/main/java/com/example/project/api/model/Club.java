package com.example.project.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;
    
    @Column(name = "founded_in", length = 5, nullable = false)
	private Integer foundedIn;

    @Column(name = "country", length = 20, nullable = false)
	private String country;

    @Column(name = "club_idol", length = 15, nullable = false)
    private String clubIdol;
    
    @Column(name = "stadium", length = 25, nullable = false)
    private String stadium; 

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getFoundedIn() {
        return this.foundedIn;
    }

    public String getCountry() {
        return this.country;
    }

    public String getClubIdol() {
        return clubIdol;
    }

    public String getStadium() {
        return stadium;
    }

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setFoundedIn(Integer foundedIn) {
        this.foundedIn = foundedIn;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setClubIdol(String clubIdol) {
        this.clubIdol = clubIdol;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

}
