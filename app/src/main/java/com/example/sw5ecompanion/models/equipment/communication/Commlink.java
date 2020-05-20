package com.example.sw5ecompanion.models.equipment.communication;

public class Commlink extends Communication {

    public Commlink() {

        super();
        this.setName("Commlink");
        this.setCost(50);
        this.setWeight(.5);
        this.setDescription("Commlinks are standard handheld communication devices, fitted with " +
                "microphones and receivers.  A standard, personal commlinks have a range of up " +
                "to 20 miles, but are reduced in dense, urban areas or areas of high level " +
                "interference.");
    }
}
