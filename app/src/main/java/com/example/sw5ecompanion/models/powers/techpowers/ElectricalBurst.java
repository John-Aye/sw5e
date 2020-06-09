package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class ElectricalBurst extends Power
{
    public ElectricalBurst () {
        super();
        this.setLvl(0);
        this.setName("Electrical Burst");
        this.setType("At-will tech power");
        this.setDescription("You emit a burst of electricity. Each creature within range, other than you, must succeed on a Constitution saving throw or take 1d6 lightning damage. This power's damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self (5-foot sphere)");
        this.setDuration("Instantaneous");
    }
}