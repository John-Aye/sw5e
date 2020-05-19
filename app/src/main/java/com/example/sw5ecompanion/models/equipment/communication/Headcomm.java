package com.example.sw5ecompanion.models.equipment.communication;

public class Headcomm extends Communication {

    public Headcomm() {

        super();
        this.setName("Headcomm");
        this.setCost(200);
        this.setWeight(1);
        this.setDescription("A headcomm can be installed in a helmet or worn independently.  It " +
                "functions as a hands-free commlink");
    }
}
