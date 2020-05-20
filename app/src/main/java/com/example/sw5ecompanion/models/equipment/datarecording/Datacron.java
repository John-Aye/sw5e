package com.example.sw5ecompanion.models.equipment.datarecording;

public class Datacron extends DataRecording {

    public Datacron() {

        super();
        this.setName("Datacron");
        this.setCost(1000);
        this.setWeight(2);
        this.setDescription("A datacron is a type of holocron that can be accessed by " +
                "non-force-sensitives and are mainly used to store encrypted data.  They are " +
                "complete when an interactive projection to access the information.");
    }
}
