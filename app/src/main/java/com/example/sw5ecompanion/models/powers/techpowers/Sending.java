package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Sending extends Power
{
    public Sending () {
        super();
        this.setLvl(3);
        this.setName("Sending");
        this.setType("3rd-level tech power");
        this.setDescription("You send a short message of twenty-five words or less to a creature with which you are familiar that possesses a commlink. The creature hears the message, recognizes you as the sender if it knows you, and can answer in a like manner immediately. You can send the message across any distance and even to other planets, but if the target is on a dierent planet than you, there is a 5 percent chance that the message doesn't arrive.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Unlimited");
        this.setDuration("1 round");
    }
}