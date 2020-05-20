package com.example.sw5ecompanion.models.equipment.utilities;

public class FieldRations extends Utilities {

    private String mDescription;

    public FieldRations() {

        super();
        this.setName("Field Rations (1 day)");
        this.setCost(5);
        this.setWeight(1);
        mDescription = "Ration packs consist of dry foods suitable for extended travel, and are " +
                "used when other food is scarce.  Each pack is divided into portions and can " +
                "provide enough for one person per day.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
