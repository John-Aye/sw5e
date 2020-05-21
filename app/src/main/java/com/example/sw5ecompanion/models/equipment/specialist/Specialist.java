package com.example.sw5ecompanion.models.equipment.specialist;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Specialist extends Equipment  {

    private String mDescription;

    public Specialist() {

        super();
        this.setType("Specialists Tools");
        this.setQuantity(1);
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
