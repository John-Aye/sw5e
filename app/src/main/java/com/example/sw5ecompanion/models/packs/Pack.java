package com.example.sw5ecompanion.models.packs;

import com.example.sw5ecompanion.models.equipment.Equipment;

import java.util.ArrayList;

public class Pack {

    private String mDescription;
    private int cost;
    private ArrayList<Equipment> mEquipment;

    public Pack() {

    }

    public String getDescription() {
        return mDescription;
    }

    public Pack setDescription(String description) {
        mDescription = description;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public Pack setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public ArrayList<Equipment> getEquipment() {
        return mEquipment;
    }

    public Pack setEquipment(ArrayList<Equipment> equipment) {
        mEquipment = equipment;
        return this;
    }
}
