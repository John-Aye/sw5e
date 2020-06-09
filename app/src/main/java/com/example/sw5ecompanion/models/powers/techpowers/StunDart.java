package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class StunDart extends Power
{
    public StunDart () {
        super();
        this.setLvl(8);
        this.setName("Stun Dart");
        this.setType("8th-level tech power");
        this.setDescription("You emit a tiny crippling dart at a target within range. If the target has 150 hit points or fewer, it is stunned. Otherwise, the power has no eect. The stunned target must make a Constitution saving throw at the end of each of its turns. On a successful save, this stunning eect ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}