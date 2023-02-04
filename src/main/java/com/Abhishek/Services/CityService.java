package com.Abhishek.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Abhishek.Models.City;
import com.Abhishek.Repos.CityRepo;

@Service
public class CityService {
    
    @Autowired
    private CityRepo repo;

    public List<City> getAllCities(){
        return repo.findAll();
    }

    public City getCityById(int id){
        return repo.findById(id);
    }

    public City getCityByName(String name){
        return repo.findByName(name);
    }
    
    public List<City> getCityByDistrict(String district){
        return repo.findByDistrict(district);
    }

    public List<City> getCityBypopulation(String population){
        return repo.findByPopulation(population);
    }



    public City addCityinDB(City city){
        return repo.save(city);
    }

    




}
