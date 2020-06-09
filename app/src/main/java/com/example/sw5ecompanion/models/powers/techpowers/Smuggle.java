package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Smuggle extends Power
{
    public Smuggle () {
        super();
        this.setLvl(2);
        this.setName("Smuggle");
        this.setType("2nd-level tech power");
        this.setDescription("You dampen sound and light and dull the scent from creatures in your vicinity. For the duration, each creature you choose within 30 feet of you has a +10 bonus to Dexterity (Stealth) checks and can't be tracked except by enhanced means. You can choose yourself as well. A creature that receives this bonus leaves behind no traces of its passage.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 hour");
    }
}