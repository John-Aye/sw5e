package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Shutdown extends Power
{
    public Shutdown () {
        super();
        this.setLvl(5);
        this.setName("Shutdown");
        this.setType("5th-level tech power");
        this.setDescription("You emit an electromagnetic pulse, shutting down all electronic devices, with the exception of your tech focus, that are not held by or under the direct control of a creature. If it is, the creature must succeed on an Intelligence saving throw to stop the device from being shut down. While the power is active, no electronic device in range can be started or restarted.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}