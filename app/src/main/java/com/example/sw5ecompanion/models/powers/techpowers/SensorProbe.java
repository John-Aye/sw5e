package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class SensorProbe extends Power
{
    public SensorProbe () {
        super();
        this.setLvl(4);
        this.setName("Sensor Probe");
        this.setType("4th-level tech power");
        this.setDescription("You create a small, temporary, invisible probe that hovers in the air for the duration. You mentally receive visual information from the probe. It has darkvision out to 30 feet. The eye can look in every direction. As an action, you can move the probe up to 30 feet in any direction. There's no limit on how far away from you it can be. A solid barrier blocks the probe's movement, but it can pass through an opening at least 1 inch in diameter.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}