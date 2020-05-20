package com.example.sw5ecompanion.models.equipment.explosive;

public class MineFrag extends Explosive {

    public MineFrag() {

        super();
        this.setName("Mine, Fragmentation");
        this.setCost(500);
        this.setWeight(2);
        this.setDescription("When you use your action to set it, this mine sets an imperceptible " +
                "laser line extending up to 15 feet.  When the laser is tripped, the mine " +
                "explodes, and each creature within 15 feet of it must make a DC 13 Dexterity " +
                "saving throw.  On a failed save, a creature takes 3d6 kinetic damage, or half" +
                " as much on a successful one.");
    }
}
