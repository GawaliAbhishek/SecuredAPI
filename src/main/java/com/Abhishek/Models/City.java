package com.Abhishek.Models;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class City {
    
    @Id
    private int id;
    private String name;
    private String countrycode;
    private String district;
    private int population;

    public City() {
    }

    public City(int id, String name, String countrycode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countrycode = countrycode;
        this.district = district;
        this.population = population;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return this.countrycode;
    }

    public void setCountryCode(String countryCode) {
        this.countrycode = countryCode;
    }

   

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
