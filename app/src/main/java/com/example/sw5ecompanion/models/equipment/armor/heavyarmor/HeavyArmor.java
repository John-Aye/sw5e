package com.example.sw5ecompanion.models.equipment.armor.heavyarmor;

import com.example.sw5ecompanion.models.equipment.armor.Armor;

public class HeavyArmor extends Armor {

    private String mDescription;

    public HeavyArmor() {

        super();
        this.setType("Heavy Armor");
        this.setStealthPenalty(true);
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
