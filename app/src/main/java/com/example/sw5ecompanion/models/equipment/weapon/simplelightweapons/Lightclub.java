package com.example.sw5ecompanion.models.equipment.weapon.simplelightweapons;

public class Lightclub extends SimpleLightweapons {

    public Lightclub() {

        super();
        this.setName("Lightclub");
        this.setCost(150);
        this.setWeight(5);
        this.setDamage("1d10 energy");
        this.setProperties("luminous", "two-handed");
    }
}
