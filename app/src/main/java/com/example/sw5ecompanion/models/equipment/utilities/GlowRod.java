package com.example.sw5ecompanion.models.equipment.utilities;

public class GlowRod extends Utilities {

    private String mDescription;

    public GlowRod() {

        super();
        this.setName("Glow Rod");
        this.setCost(10);
        this.setWeight(2);
        mDescription = "Glowrods create a beam of light illuminating the area around you in a " +
                "bright light for a 20-foot radius and dim light for an additional 20 feet.  The " +
                "glowrod lasts for 10 hours and can be recharged by connecting a power source or " +
                "by replacing the power cell.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
