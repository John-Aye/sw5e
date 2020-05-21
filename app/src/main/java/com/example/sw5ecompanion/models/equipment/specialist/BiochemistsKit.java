package com.example.sw5ecompanion.models.equipment.specialist;

public class BiochemistsKit extends Specialist {

    public BiochemistsKit() {

        super();
        this.setName("Biochemist's Kit");
        this.setCost(500);
        this.setWeight(8);
        this.setDescription("This kit includes all of the necessary components to create and house " +
                "standard adrenals, medpacs, and stimpacs.  Proficiency with this kit lets you " +
                "add your proficiency bonus to any ability checks you make to identify adrenals, " +
                "medpacs, and stimpacs.  Also, proficiency with this kit is required to create " +
                "adrenals, medpacs, nad stimpacs");
    }
}
