package com.Abhishek.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Abhishek.Models.Country;
import com.Abhishek.Repos.CountryRepo;

@Service
public class CountryService {
    @Autowired
    private CountryRepo repo;


    public List<Country> getAllData(){
        return repo.findAll();
    }

    public Optional<Country> getDataByID(String code){
        return repo.findById(code);
    }

    public Country getDataByName(String name){
        return repo.findByname(name);
    }

    public List<Country> getDataByContinent(String continent){
        return repo.findBycontinent(continent);
    }

    public Country addCountry(Country country){
        return repo.save(country);
    }
}
