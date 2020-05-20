package com.example.sw5ecompanion.models.equipment.explosive;

public class MinePlasma extends Explosive {

    public MinePlasma() {

        super();
        this.setName("Mine, Plasma");
        this.setCost(550);
        this.setWeight(2);
        this.setDescription("When you use your action to set it, this mine sets an imperceptible " +
                "laser line extending up to 15 feet.  When the laser is tripped, the mine explodes," +
                " coating the area in a 15-foot radius around it in fire that burns for 1 minute.  " +
                "When a creature enters the fire or starts its turn there it must make a DC 13 " +
                "Dexterity saving throw.  On a failed save the creature takes 2d6 fire damage, or " +
                "half as much on a successful one.  A construct makes this save with disadvantage.");
    }
}
