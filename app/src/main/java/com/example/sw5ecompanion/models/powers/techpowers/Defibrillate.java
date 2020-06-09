package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Defibrillate extends Power
{
    public Defibrillate () {
        super();
        this.setLvl(1);
        this.setName("Defibrillate");
        this.setType("4th-level tech power");
        this.setDescription("You touch a creature that has died within the last minute and administer a shock to restore it to life. That creature returns to life with 1 hit point. This power can't return to life a creature that has died of old age, nor can it restore any missing body parts. If the creature is lacking body parts or organs integral for its survival—its head, for instance—the power automatically fails. Once this power has restored a creature to life, it cannot benet from this power again until it nishes a short or long rest.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}