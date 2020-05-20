package com.example.sw5ecompanion.models.equipment.explosive;

public class BreachingCharge extends Explosive {

    public BreachingCharge() {

        super();
        this.setName("Breaching Charge");
        this.setCost(750);
        this.setWeight(4);
        this.setDescription("A device used to blow holes in larger constructs, a breaching charge " +
                "creates a devastating explosion.  Installing a breach takes 1 minute.  The charge " +
                "can be set with a 6 second timer, or detonated remotely using a remote detonator." +
                "\nOnce detonated, the breaching charge destroys an unenhanced section of wall up " +
                "10 feet wide, 10 feet tall, and 5 feet deep.  Additionally, each creature within " +
                "20 feet of the charge must make a DC 13 Dexterity saving throw.  A creature takes " +
                "3d6 fire damage on a failed save, or half as much on a successful one.  A " +
                "construct makes this save with disadvantage.  If the breaching charge is installed " +
                "on the construct, it automatically fails the saving throw.");
    }
}
