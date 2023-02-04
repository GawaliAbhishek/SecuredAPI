package com.Abhishek.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Abhishek.Models.Country;
import com.Abhishek.Services.CountryService;

@RestController

@RequestMapping("/country")

public class CountryController {
    @Autowired
    private CountryService service;

    @GetMapping("/")
    public List<Country> getAllCountry(){
        return service.getAllData();
    }

    @GetMapping("/byId/{code}")
    public Optional<Country> getCountryById(@PathVariable String code){
        return service.getDataByID(code);
    }

    @GetMapping("/byname/{name}")
    public Country getContryByName(@PathVariable String name){
        return service.getDataByName(name);
    }

    @GetMapping("/bycontinent/{continent}")
    public List<Country> getContryByContinent(@PathVariable String continent){
        return service.getDataByContinent(continent);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/admin/addcountry")
    public Country addCountryInDb(@RequestBody Country country){
        return service.addCountry(country);
    }
}
