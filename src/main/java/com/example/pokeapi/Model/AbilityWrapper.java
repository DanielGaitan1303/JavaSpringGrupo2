package com.example.pokeapi.Model;

public class AbilityWrapper {

    /*
    Clase que representa las habilidades
    cada elemento es un obejto de tipo habilidad
    que tiene el nombre de esta
     */

    private Ability ability;

    public AbilityWrapper() {

    }

    public AbilityWrapper(Ability ability) {
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
