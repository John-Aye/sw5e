package com.example.sw5ecompanion.models.equipment.datarecording;

public class Holocron extends DataRecording {

    public Holocron() {

        super();
        this.setName("Holocron");
        this.setCost(1000);
        this.setWeight(2);
        this.setDescription("Holocrons are information-storage devices used by force wielders that " +
                "contain ancient lessons or valuable information in holographic form.  They appear " +
                "as palm-sized, glowing polyhedrons of crystalline material and hardware, and can " +
                "only be activated and used through the power of the Force.");
    }
}
