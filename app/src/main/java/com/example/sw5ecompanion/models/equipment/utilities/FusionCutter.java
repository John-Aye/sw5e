package com.example.sw5ecompanion.models.equipment.utilities;

public class FusionCutter extends Utilities {

    private String mDescription;

    public FusionCutter() {

        super();
        this.setName("Fusion Cutter");
        this.setCost(25);
        this.setWeight(2);
        mDescription = "A fusion cutter is a handheld cutting tool popular among technicians.  It " +
                "can cut through almost any reinforced material, given enough time.  The internal " +
                "power cell supplies an hour's worth of continuous operation.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
