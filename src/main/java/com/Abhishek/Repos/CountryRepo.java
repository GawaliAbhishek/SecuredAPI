package com.Abhishek.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Abhishek.Models.Country;

public interface CountryRepo extends JpaRepository<Country,String> {

    public Country findByname(String name);
    public List<Country> findBycontinent(String continent);
    
}
