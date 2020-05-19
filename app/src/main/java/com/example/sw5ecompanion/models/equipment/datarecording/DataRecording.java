package com.example.sw5ecompanion.models.equipment.datarecording;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class DataRecording extends Equipment {

    private String mDescription;

    public DataRecording() {

        super();
        this.setType("Data Recording and Storage");
        this.setQuantity(1);
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
