package com.example.sw5ecompanion.models.equipment.specialist;

public class ChefsKit extends Specialist {

    public ChefsKit() {

        super();
        this.setName("Chef's Kit");
        this.setCost(70);
        this.setWeight(8);
        this.setDescription("This kit includes all of the necessary implements to prepare and " +
                "serve food up to six people.  Proficiency with this kit lets you add your " +
                "proficiency bonus to any ability checks you make to identify food.  Also, " +
                "proficiency with this kit is required to create field rations.");
    }
}
