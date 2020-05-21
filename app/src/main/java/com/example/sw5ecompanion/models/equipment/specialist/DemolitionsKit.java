package com.example.sw5ecompanion.models.equipment.specialist;

public class DemolitionsKit extends Specialist {

    public DemolitionsKit() {

        super();
        this.setName("Demolitions Kit");
        this.setCost(400);
        this.setWeight(4);
        this.setDescription("This kit contains the appropriate equipment for disarming and setting" +
                " explosives.  It contains a plastic face guard and heavy duty gloves, as well as " +
                "precision cutting and gripping tools, and various common components of grenades " +
                "and mines.  Proficiency with this kit lets you add your proficiency bonus to any " +
                "ability checks you make to disarm or set an explosive");
    }
}
