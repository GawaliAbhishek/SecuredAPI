package com.Abhishek.Repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Abhishek.Models.City;

public interface CityRepo  extends JpaRepository<City,Integer>{

    public City findById(int id);
    public City findByName(String name);
    public List<City> findByDistrict(String district);
    public List<City> findByPopulation(String population);

    
    
}
