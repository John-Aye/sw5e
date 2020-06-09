package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class TruthSerum extends Power
{
    public TruthSerum () {
        super();
        this.setLvl(2);
        this.setName("Truth Serum");
        this.setType("2nd-level tech power");
        this.setDescription("You administer a poison to a creature you touched that prevents it from telling lies. The creature touched must make a Constitution saving throw. On a success, nothing happens. On a failure, the creature can't speak a deliberate lie until the power ends. An aected creature is aware of the power and can thus avoid answering questions to which it would normally respond with a lie. Such a creature can be evasive in its answers as long as it remains within the boundaries of the truth.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("10 minutes");
    }
}