package com.example.sw5ecompanion.models.equipment.utilities;

public class Chronometer extends Utilities {

    private String mDescription;

    public Chronometer() {

        super();
        this.setName("Chronometer");
        this.setCost(100);
        this.setWeight(1);
        mDescription = "A chronometer is a device that measures and keeps linear time";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
