package com.example.recyclerview_2;

public class planet_model  {
    String planet_name;
    String planet_description;
    int image;

    public planet_model(String planet_name, String planet_description, int image) {
        this.planet_name = planet_name;
        this.planet_description = planet_description;
        this.image = image;
    }

    public String getPlanet_name() {
        return planet_name;
    }

    public String getPlanet_description() {
        return planet_description;
    }

    public int getImage() {
        return image;
    }
}
