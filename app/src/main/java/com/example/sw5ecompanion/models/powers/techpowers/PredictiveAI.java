package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class PredictiveAI extends Power
{
    public PredictiveAI () {
        super();
        this.setLvl(9);
        this.setName("Predictive AI");
        this.setType("9th-level tech power");
        this.setDescription("You touch a willing creature, granting them a limited AI companion that can predict the world around them. For the duration, the target can't be surprised and has advantage on attack rolls, ability checks, and saving throws. Additionally, other creatures have disadvantage on attack rolls against the target for the duration. This power immediately ends if you cast it again before its duration ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 minute");
        this.setRange("Touch");
        this.setDuration("8 hours");
    }
}