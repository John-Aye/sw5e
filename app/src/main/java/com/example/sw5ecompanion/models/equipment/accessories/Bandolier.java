package com.example.sw5ecompanion.models.equipment.accessories;

public class Bandolier extends Accessories {

    public Bandolier() {

        super();
        this.setName("Bandolier");
        this.setCost(100);
        this.setWeight(2);
        this.setDescription("A bandolier is worn across the chest.  It has 12 slots that can " +
                "each hold a single item the weighs less than 2 lb, such as a vibrodagger, a " +
                "fragmentation grenade, or a power cell");
    }
}
