package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Lock extends Power
{
    public Lock () {
        super();
        this.setLvl(2);
        this.setName("Lock");
        this.setType("2nd-level tech power");
        this.setDescription("You touch a closed door, window, gate, chest, or other entryway, and it becomes locked for the duration. You and the creatures you designate when you cast this power can open the object normally. You can also set a password that, when spoken within 5 feet of the object, suppresses this power for 1 minute. Otherwise, it is impassable until it is broken or the power is dispelled or suppressed. Casting r ele a s e on the object suppresses lo ck for 10 minutes. While aected by this power, the object is more dicult to break or force open; the DC to break it or pick any locks on it increases by 10.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Until dispelled");
    }
}