package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class HolographicDisguise extends Power
{
    public HolographicDisguise () {
        super();
        this.setLvl(1);
        this.setName("Holographic Disguise");
        this.setType("1st-level tech power");
        this.setDescription("Until the power ends or you use an action to dismiss it, you can disguise yourself through the use of a hologram emitter. You can appear to be shorter or taller by about a foot and change the appearance of your body weight, but you cannot change the basic structure of your body. The hologram can include your clothes, armor, weapons, and other belongings on your person. The illusion is only visual, so any sort of physical contact will only interact with the real size and shape of you. Someone may also use an action to make an Investigation check against your techcasting save DC, seeing through the hologram on a success.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("hour");
    }
}