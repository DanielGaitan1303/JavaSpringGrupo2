package com.example.pokeapi.Model;

public class Ability {

    /*
    Clase encargada de representar
    los nombres a las habilidades
     */

    private String name;

    public Ability() {}

    public Ability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
