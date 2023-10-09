package com.example.project.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "title")
public class Title {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;
    
    @Column(name = "winning_year", length = 5, nullable = false)
    private Integer winningYear;
    
    @Column(name = "description", length = 150, nullable = true)
    private String description;
    
    @OneToOne
    @PrimaryKeyJoinColumn
    private Club club;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWinningYear() {
        return winningYear;
    }

    public void setWinningYear(Integer winningYear) {
        this.winningYear = winningYear;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
