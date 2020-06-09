package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class GreaterLight extends Power
{
    public GreaterLight () {
        super();
        this.setLvl(3);
        this.setName("Greater Light");
        this.setType("3rd-level tech power");
        this.setDescription("A 60-foot-radius sphere of light spreads from a point you choose. The sphere is bright light and sheds dim light for an additional 60 feet. If you chose an object you are holding or one that isn't being worn or carried, the light shines from and moves with the object. Completely covering the object with something opaque blocks the light. If any of this power's area overlaps with enhanced darkness made by a power of 3rd level or lower, the darkness is dispelled.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("1 hour");
    }
}