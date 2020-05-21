package com.example.sw5ecompanion.models.equipment.mounts;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Mounts extends Equipment {

    private int mSpeed;
    private int mCarry;

    public Mounts() {

        super();
        this.setType("Mount");
        this.setQuantity(1);
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setSpeed(int speed) {
        mSpeed = speed;
    }

    public int getCarry() {
        return mCarry;
    }

    public void setCarry(int carry) {
        mCarry = carry;
    }
}
