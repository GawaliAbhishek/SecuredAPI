package com.Abhishek.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.Abhishek.Models.City;
import com.Abhishek.Services.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    public CityService service;

    @GetMapping("/")
    public List<City> getAllData() {
        return service.getAllCities();
    }

    @GetMapping("/{id}")
    public City getDataById(@PathVariable int id) {
        return service.getCityById(id);
    }

    @GetMapping("/byname/{name}")
    public City getDataByName(@PathVariable String name) {
        return service.getCityByName(name);
    }

    @GetMapping("/bydistrict/{district}")
    public List<City> getDataByDistrict(@PathVariable String district) {
        return service.getCityByDistrict(district);
    }
    @GetMapping("/bypopulation/{population}")
    public List<City> getDataByPopulation(@PathVariable String population) {
        return service.getCityBypopulation(population);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/admin/addcity")
    public City addCity(@RequestBody City city){
       return service.addCityinDB(city);
    }

}
