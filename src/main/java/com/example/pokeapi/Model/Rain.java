package com.example.pokeapi.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
    @JsonProperty("3h")
    private double threeH;

    public double getThreeH() { return threeH; }
    public void setThreeH(double threeH) { this.threeH = threeH; }
}