package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList mockCityList(){
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        CustomList list = mockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should have been 0");
        City cityToAdd = new City("Nanton", "AB");
        list.addCity(cityToAdd);

        int expectedCountAfter = 1;
        assertEquals(expectedCountAfter, list.getCount(), "Count should have been 1");
    }

    @Test
    public void hasCityTest(){
        CustomList list = mockCityList();
        City testCity = new City("Regina", "SK");
        Assertions.assertFalse(list.hasCity(testCity));
        list.addCity(testCity);
        Assertions.assertTrue(list.hasCity(testCity));
    }


    @Test
    public void deleteCityTest(){
        CustomList list = mockCityList();
        City testCity = new City("Morinville", "AB");
        list.addCity(testCity);
        Assertions.assertTrue(list.hasCity(testCity));
        list.deleteCity(testCity);
    }


    @Test
    public void countCitiesTest(){
        CustomList list = mockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.countCity(), "Count should have been 0");
        City city1 = new City("Nanton", "AB");
        City city2 = new City("Danton", "AB");
        City city3 = new City("Fanton", "AB");
        City city4 = new City("Manton", "AB");
        list.addCity(city1);
        list.addCity(city2);
        list.addCity(city3);
        list.addCity(city4);

        int expectedCountAfter = 4;
        assertEquals(expectedCountAfter, list.countCity(), "Count should have been 4");
    }
}
