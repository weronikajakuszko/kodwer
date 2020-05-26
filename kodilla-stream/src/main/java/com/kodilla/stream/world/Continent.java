package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countryList = new ArrayList<Country>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public void addCountry(Country country){
        countryList.add(country);
    }
}
