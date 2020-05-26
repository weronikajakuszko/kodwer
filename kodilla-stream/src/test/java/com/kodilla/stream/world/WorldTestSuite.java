package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country country1 = new Country("Poland", new BigDecimal("34000000"));
        Country country2 = new Country("Germany", new BigDecimal("56000000"));
        Country country3 = new Country("Thailand", new BigDecimal("74000000"));
        Country country4 = new Country("Vietnam", new BigDecimal("29000000"));
        Country country5 = new Country("Brasil", new BigDecimal("64000000"));
        Country country6 = new Country("Canada", new BigDecimal("90000000"));
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("North America");
        Continent continent4 = new Continent("South America");
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent3.addCountry(country6);
        continent4.addCountry(country5);
        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalPeopleQuantity = new BigDecimal("347000000");
        Assert.assertEquals(expectedTotalPeopleQuantity, totalPeopleQuantity);
        System.out.println(totalPeopleQuantity);
    }
}
