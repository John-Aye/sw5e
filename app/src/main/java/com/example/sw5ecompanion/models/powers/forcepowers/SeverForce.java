package com.example.sw5ecompanion.models.powers.forcepowers;

import com.example.sw5ecompanion.models.powers.Power;

public class SeverForce extends Power
{
    public SeverForce() {
        super();
        this.setLvl(3);
        this.setName("SeverForce");
        this.setType("3rd-level universal power");
        this.setDescription("You attempt to interrupt a creature in the process of casting a force power. If the creature is casting a power of 3rd level or lower, its power fails and has no eect. If it is casting a power of 4th level or higher, make an ability check using your forcecasting ability. The DC equals 10 + the power's level. On a success, the creature's power fails and has no eect. F o r c e P o t e n c y . When you cast this power using a force slot of 4th level or higher, the interrupted power has no eect if its level is less than or equal to the level of the force slot you used.");
        this.setPrerequiste("");
        this.setCastingTime("1 reaction");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}