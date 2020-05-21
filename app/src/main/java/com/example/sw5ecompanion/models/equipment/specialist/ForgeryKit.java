package com.example.sw5ecompanion.models.equipment.specialist;

public class ForgeryKit extends Specialist {

    public ForgeryKit() {

        super();
        this.setName("Forgery Kit");
        this.setCost(150);
        this.setWeight(5);
        this.setDescription("This small box contains a variety of papers and parchments, pens and " +
                "inks, seals and sealing wax, gold and silver leaf, and other supplies necessary " +
                "to create convincing forgeries of physical documents.  Proficiency with this kit " +
                "lets you add your proficiency bonus to any ability checks you make to create " +
                "a physical forgery of a document");
    }
}
