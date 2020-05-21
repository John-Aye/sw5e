package com.example.sw5ecompanion.models.equipment.specialist;

public class DisguiseKit extends Specialist {

    public DisguiseKit() {

        super();
        this.setName("Disguise Kit");
        this.setCost(250);
        this.setWeight(3);
        this.setDescription("This pouch of cosmetics, hair dye, and small props lets you create " +
                "disguises that change you physical appearance, in addition to a tool that lets " +
                "them holographically mimic clothing.  Proficiency with this kit lets you add " +
                "your proficiency bonus to any ability checks you make to create a visual disguise.");
    }
}
