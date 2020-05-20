package com.example.sw5ecompanion.models.equipment.utilities;

public class Ram extends Utilities {

    private String mDescription;

    public Ram() {

        super();
        this.setName("Ram, Portable");
        this.setCost(40);
        this.setWeight(35);
        mDescription = "You can use a portable ram to break down doors.  When doing so, you gain " +
                "a +4 bonus on the Strength check.  One other character can help you use the ram, " +
                "giving you advantage on this check.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
