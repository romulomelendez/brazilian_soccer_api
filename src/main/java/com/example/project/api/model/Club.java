package com.example.project.api.model;

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
    private String name;
	private Integer foundedIn;
	private String countryState;


    // Getters
    public String getName() {
        return this.name;
    }

    public Integer getFoundedIn() {
        return this.foundedIn;
    }

    public String getCountryState() {
        return this.countryState;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setFoundedIn(Integer foundedIn) {
        this.foundedIn = foundedIn;
    }

    public void setCountryState(String countryState) {
        this.countryState = countryState;
    }

}
