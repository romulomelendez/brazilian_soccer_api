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

    @Column(length = 30, nullable = false)
    private String name;
    
    @Column(nullable = false)
	private Integer foundedIn;

    @Column(nullable = false)
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

    public Integer getId() {
        return id;
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

    public void setCountryState(String countryState) {
        this.countryState = countryState;
    }

}
