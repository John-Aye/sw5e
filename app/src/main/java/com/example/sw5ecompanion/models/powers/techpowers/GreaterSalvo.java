package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class GreaterSalvo extends Power
{
    public GreaterSalvo () {
        super();
        this.setLvl(9);
        this.setName("Greater Salvo");
        this.setType("9th-level tech power");
        this.setDescription("You launch four projectiles at points you can see within range. Each creature within a 20-foot-radius sphere of each point must make a Dexterity saving throw. A creature takes 15d6 re damage and 15d6 kinetic damage on a failed save, or half as much damage on a successful one. A creature in the area of more than one ery burst is aected only once. The power damages objects in the area and ignites ammable objects that aren't being worn or carried.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}