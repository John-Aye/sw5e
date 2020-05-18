package com.example.sw5ecompanion.models.equipment.armor.lightarmor;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class LightArmor extends Armor {

    private String mDescription;

    public LightArmor() {

        super();
        this.setType("Light Armor");
        this.setStealthPenalty(false);
        this.setStrength(0);
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
