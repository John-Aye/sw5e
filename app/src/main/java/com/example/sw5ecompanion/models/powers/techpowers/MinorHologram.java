package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class MinorHologram extends Power
{
    public MinorHologram () {
        super();
        this.setLvl(0);
        this.setName("Minor Hologram");
        this.setType("At-will tech power");
        this.setDescription("This ability is a minor tech trick that creates one of the following eects within range. You create an instantaneous, harmless sensory eect, such as a shower of sparks, a pu of wind, faint musical notes, or an odd odor. You instantaneously light or snu out a source of light. You instantaneously clean or soil an object no larger than 1 cubic foot. You chill, warm, or avor up to 1 cubic foot of nonliving material for 1 hour. You make a color, a small mark, or a symbol appear on an object or a surface for 1 hour. You create a trinket or an illusory image that can t in your hand and that lasts until the end of your next turn. If you use this power multiple times, you can have up to three of its non-instantaneous eects active at a time, and you can dismiss such an eect as an action.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("10 feet");
        this.setDuration("Up to 1 hour");
    }
}