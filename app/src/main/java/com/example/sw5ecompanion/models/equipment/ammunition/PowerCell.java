package com.example.sw5ecompanion.models.equipment.ammunition;

public class PowerCell extends Ammunition {

    public PowerCell() {

        super();
        this.setName("Power Cell");
        this.setCost(10);
        this.setWeight(1);
        this.setDescription("Power cells fuel blaster weapons that deal energy or ion damage.  " +
                "Additionally, power cells are used to energize certain tools.");
    }
}
