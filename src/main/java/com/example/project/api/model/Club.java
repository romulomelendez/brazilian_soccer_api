package com.example.project.api.model;

public class Club {

    private String name;
	private String foundedIn;
	private String countryState;

    // Getters
    public String getName() {
        return this.name;
    }

    public String getFoundedIn() {
        return this.foundedIn;
    }

    public String getCountryState() {
        return this.countryState;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setFoundedIn(String foundedIn) {
        this.foundedIn = foundedIn;
    }

    public void setCountryState(String countryState) {
        this.countryState = countryState;
    }

}
