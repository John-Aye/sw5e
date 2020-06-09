package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class FriendlyFire extends Power
{
    public FriendlyFire () {
        super();
        this.setLvl(5);
        this.setName("Friendly Fire");
        this.setType("5th-level tech power");
        this.setDescription("You scramble the targeting protocols of nearby machines. Each droid or construct in a 30-foot-radius sphere centered on a point you choose within range must make an Intelligence saving throw. If a construct has the 'Piloted' trait, and has a pilot controlling it that is not incapacitated, it gains a bonus to the saving throw equal to the pilot's Intelligence modier. On a failed save, the target loses the ability to distinguish friend from foe, regarding all creatures it can see as enemies until the power ends. Each time the target takes damage, it can repeat the saving throw, ending the eect on itself on a success. Whenever the aected creature chooses another creature as a target, it must choose the target at random from among the creatures it can see within range of the attack, power, or other ability it’s using. If an enemy provokes an opportunity attack from the aected creature, the creature must make that attack if it is able to.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}