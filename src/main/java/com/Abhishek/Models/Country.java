package com.Abhishek.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
    
    @Id
    private String Code;
    private String name;
    private String continent;
    private String region;
    private Double surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Double lifeExpectancy;
    private Double GNP;
    private Double GNPOld=22.1;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String Code2;

    public Country() {
    }

    public Country(String Code, String Name, String continent, String region, double surfaceArea, int indepYear, int Population, double LifeExpectancy, double GNP, double GNPOld, String LocalName, String GovernmentForm, String HeadOfState, int Capital, String Code2) {
        this.Code = Code;
        this.name = Name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = Population;
        this.lifeExpectancy = LifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        this.localName = LocalName;
        this.governmentForm = GovernmentForm;
        this.headOfState = HeadOfState;
        this.capital = Capital;
        this.Code2 = Code2;
    }


    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getSurfaceArea() {
        return this.surfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return this.indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return this.population;
    }

    public void setPopulation(Integer Population) {
        this.population = Population;
    }

    public Double getLifeExpectancy() {
        return this.lifeExpectancy;
    }

    public void setLifeExpectancy(Double LifeExpectancy) {
        this.lifeExpectancy = LifeExpectancy;
    }

    public Double getGNP() {
        return this.GNP;
    }

    public void setGNP(Double GNP) {
        this.GNP = GNP;
    }

    public Double getGNPOld() {
        return this.GNPOld;
    }

    public void setGNPOld(Double GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return this.localName;
    }

    public void setLocalName(String LocalName) {
        this.localName = LocalName;
    }

    public String getGovernmentForm() {
        return this.governmentForm;
    }

    public void setGovernmentForm(String GovernmentForm) {
        this.governmentForm = GovernmentForm;
    }

    public String getHeadOfState() {
        return this.headOfState;
    }

    public void setHeadOfState(String HeadOfState) {
        this.headOfState = HeadOfState;
    }

    public Integer getCapital() {
        return this.capital;
    }

    public void setCapital(Integer Capital) {
        this.capital = Capital;
    }

    public String getCode2() {
        return this.Code2;
    }

    public void setCode2(String Code2) {
        this.Code2 = Code2;
    }
    
}
