package com.example.sw5ecompanion.models.equipment.medical;

public class Medpac extends Medical {

    public Medpac() {

        super();
        this.setName("Medpac");
        this.setCost(300);
        this.setWeight(.5);
        this.setDescription("A medpac is a quick-acting syringe filled with a concentrated dose " +
                "of kolto.  As an action, you can use this medpac to restore 2d4+2 hit points to " +
                "a creature within5 feet.");
        this.setUses(1);
    }
}
