package com.example.sw5ecompanion.models.powers.forcepowers;

import com.example.sw5ecompanion.models.powers.Power;

public class ForceBody extends Power
{
    public ForceBody() {
        super();
        this.setLvl(1);
        this.setName("Force Body");
        this.setType("1st-level universal power");
        this.setDescription("This power enables you to use your health to fuel your force powers. For the duration, when you cast a force power, half the cost is paid by your force points (rounded up) and half the cost is paid by your hit points (rounded down). Additionally, your maximum hit points are decreased by this amount while the power is active. You may end this eect at any time. If you cast a force power that would reduce your hit points to 0, the power automatically fails and this effect ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("1 hour");
    }
}