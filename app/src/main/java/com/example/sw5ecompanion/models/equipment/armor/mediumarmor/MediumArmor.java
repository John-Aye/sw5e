package com.example.sw5ecompanion.models.equipment.armor.mediumarmor;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class MediumArmor extends Armor {

    private String mDescription;

    public MediumArmor() {

        super();
        this.setType("Medium Armor");
        this.setStrength(0);
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
