package com.example.sw5ecompanion.models.equipment.specialist;

public class PoisonersKit extends Specialist {

    public PoisonersKit() {

        super();
        this.setName("Poisoner's Kit");
        this.setCost(500);
        this.setWeight(2);
        this.setDescription("A poisoner's kit includes the vials, chemicals, and other equipment " +
                "necessary for the creation of poisons.  Proficiency with this kit lets you add " +
                "your proficiency bonus to any ability checks you make to craft or use poisons.");
    }
}
