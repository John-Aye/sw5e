package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class OnOff extends Power
{
    public OnOff () {
        super();
        this.setLvl(0);
        this.setName("On/Off");
        this.setType("At-will tech power");
        this.setDescription("This power allows you to activate or deactivate any electronic device within range, as long as the device is not being wielded by a creature, and has a clearly dened on or o function that can be easily accessed from the outside of the device. Any device that requires a software-based shutdown sequence to activate or deactivate cannot be affected by on/off.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}