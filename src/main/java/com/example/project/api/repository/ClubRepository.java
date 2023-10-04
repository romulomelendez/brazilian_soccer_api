package com.example.project.api.repository;

import com.example.project.api.model.Club;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ClubRepository extends CrudRepository<Club, Integer> {

}