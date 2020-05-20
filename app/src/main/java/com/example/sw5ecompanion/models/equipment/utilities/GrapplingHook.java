package com.example.sw5ecompanion.models.equipment.utilities;

public class GrapplingHook extends Utilities {

    private String mDescription;

    public GrapplingHook() {

        super();
        this.setName("Grappling Hook");
        this.setCost(50);
        this.setWeight(4);
        mDescription = "A grappling hood allows a user to climb or ascend large objects.  It can " +
                "be mounted to a blaster, belt, or elsewhere.  It has a 50-foot length.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
