package com.example.sw5ecompanion.models.equipment.specialist;

public class MechanicsKit extends Specialist {

    public MechanicsKit() {

        super();
        this.setName("Mechanic's Kit");
        this.setCost(650);
        this.setWeight(25);
        this.setDescription("This kit contains all of the commonly required tools to make repairs " +
                "on constructs, such as ships, speeders, and turrets.  Proficiency with this kit " +
                "lets you add your proficiency bonus to any ability checks you make to perform " +
                "repairs or install ship upgrades.");
    }
}
