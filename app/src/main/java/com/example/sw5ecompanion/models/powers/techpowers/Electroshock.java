package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Electroshock extends Power
{
    public Electroshock () {
        super();
        this.setLvl(0);
        this.setName("Electroshock");
        this.setType("At-will tech power");
        this.setDescription("Lightning springs from you to deliver a shock to a creature you try to touch. Make a melee tech attack against the target. You have advantage on the attack roll if the target is wearing armor made of metal. On a hit, the target takes 1d8 lightning damage, and it can't take reactions until the start of its next turn. This power's damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}