package com.example.sw5ecompanion.models.equipment.accessories;

public class RemoteDetonator extends Accessories {

    public RemoteDetonator() {

        super();
        this.setName("Remote Detonator");
        this.setCost(150);
        this.setWeight(1);
        this.setDescription("a small handhold device with a single button, used to activate " +
                "explosives.  Over the course of 1 minute, you can synchronize the detonator with " +
                "a single explosive device, such as a breaching charge, grenade, or mine.  As an " +
                "action, you can remotely detonate the paired explosive.");
    }
}
