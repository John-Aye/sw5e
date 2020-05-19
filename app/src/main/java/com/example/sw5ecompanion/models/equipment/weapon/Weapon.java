package com.example.sw5ecompanion.models.equipment.weapon;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Weapon extends Equipment {

    private String mDamage;
    private String[] mProperties;
    private boolean mIsEquipped;

    public Weapon() {

        super();
        this.setQuantity(1);
        mIsEquipped = false;
    }

    public String getDamage() {
        return mDamage;
    }

    public void setDamage(String damage) {
        mDamage = damage;
    }

    public String[] getProperties() {
        return mProperties;
    }

    public void setProperties(String... properties) {
        mProperties = properties;
    }

    public boolean isEquipped() {
        return mIsEquipped;
    }

    public void setEquipped(boolean equipped) {
        mIsEquipped = equipped;
    }
}
