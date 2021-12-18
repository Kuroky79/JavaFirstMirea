package ru.mirea.task30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RideTest {

    @Test
    void getBrandTest() {
        Ride ride = new Ride("Merida", 2021);
        assertEquals("Merida", ride.getBrand());
    }

    @Test
    void setBrandTest() {
        Ride ride = new Ride("Merida", 2021);
        ride.setBrand("Trek");
        assertEquals("Trek", ride.getBrand());
    }

    @Test
    void getYearTest() {
        Ride ride = new Ride("Merida", 2021);
        assertEquals(2018, ride.getYear());
    }

    @Test
    void setYearTest() {
        Ride ride = new Ride("Merida", 2021);
        ride.setYear(2020);
        assertEquals(2020, ride.getYear());
    }
}