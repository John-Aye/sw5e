package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class TemporaryBoost extends Power
{
    public TemporaryBoost () {
        super();
        this.setLvl(0);
        this.setName("Temporary Boost");
        this.setType("At-will tech power");
        this.setDescription("You touch one willing creature. Once before the power ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can roll the die before or after making the ability check. The power then ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 minute");
    }
}