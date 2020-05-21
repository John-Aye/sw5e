package com.example.sw5ecompanion.models.equipment.vehicles;

import com.example.sw5ecompanion.models.equipment.Equipment;

public class Vehicles extends Equipment {

    private int mSpeed;

    public Vehicles() {

        super();
        this.setType("Vehicle");
        this.setQuantity(1);
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setSpeed(int speed) {
        mSpeed = speed;
    }
}
