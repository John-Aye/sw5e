package com.example.sw5ecompanion.models.equipment.ammunition;

public class Dart extends Ammunition {

    public Dart() {

        super();
        this.setName("Dart");
        this.setCost(5);
        this.setWeight(0);
        this.setDescription("This wrist launcher ammunition deals 1d6 kinetic damage on a hit.");
        this.setUses(1);
    }
}
