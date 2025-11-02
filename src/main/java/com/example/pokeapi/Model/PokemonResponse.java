package com.example.pokeapi.Model;

import java.util.List;

public class PokemonResponse {

    /*
    Clase personalizada que obtiene y recoge algunos
    datos de cada pokemon
     */

    private String name;
    private double weight;
    private List<String> abilities;

    public PokemonResponse() {
    }

    public PokemonResponse(String name, double weight, List<String> abilities) {
        this.name = name;
        this.weight = weight;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
}
