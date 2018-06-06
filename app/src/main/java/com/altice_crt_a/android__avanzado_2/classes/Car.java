package com.altice_crt_a.android__avanzado_2.classes;

/**
 * Created by jaime on 5/19/2018.
 */

public class Car {
    private String brand;
    private String country;

    public Car(String brand, String country) {
        this.brand = brand;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
