package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Light extends Power
{
    public Light () {
        super();
        this.setLvl(0);
        this.setName("Light");
        this.setType("At-will tech power");
        this.setDescription("You touch one object that is no larger than 10 feet in any dimension. Until the power ends, the object sheds bright light in a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The power ends if you cast it again or dismiss it as an action. If you target an object held or worn by a hostile creature, that creature must succeed on a Dexterity saving throw to avoid the power.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}