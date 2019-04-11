package com.example.phase2;

public class country {
    private String countryCode;
    private  String countryName;


    public String getCountry_code() {
        return countryCode;
    }

    public void setCountry_code(String country_code) {
        this.countryCode = country_code;
    }

    public String getCountry_name() {
        return countryName;
    }

    public void setCountry_name(String country_name) {
        this.countryName = country_name;
    }


    @Override
    public String toString() {
        return  countryCode;

    }
}
