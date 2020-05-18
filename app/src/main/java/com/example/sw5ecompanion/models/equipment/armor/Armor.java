package com.example.sw5ecompanion.models.equipment.armor;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Armor extends Equipment {

    private int mArmor;
    private int mStrength;
    private boolean mIsEquipped;
    private boolean mStealthPenalty;

    public Armor() {

        super();
        this.setQuantity(1);
        mIsEquipped = false;
    }

    public int getArmor() {
        return mArmor;
    }

    public void setArmor(int armor) {
        mArmor = armor;
    }

    public int getStrength() {
        return mStrength;
    }

    public void setStrength(int strength) {
        mStrength = strength;
    }

    public boolean isEquipped() {
        return mIsEquipped;
    }

    public void setEquipped(boolean equipped) {
        mIsEquipped = equipped;
    }

    public boolean isStealthPenalty() {
        return mStealthPenalty;
    }

    public void setStealthPenalty(boolean stealthPenalty) {
        mStealthPenalty = stealthPenalty;
    }
}
