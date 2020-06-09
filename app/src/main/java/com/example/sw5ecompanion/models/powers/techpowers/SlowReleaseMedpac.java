package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class SlowReleaseMedpac extends Power
{
    public SlowReleaseMedpac () {
        super();
        this.setLvl(3);
        this.setName("Slow-Release Medpac");
        this.setType("3rd-level tech power");
        this.setDescription("Kolto energy radiates from you in an aura with a 30-foot radius. Until the power ends, the aura moves with you, centered on you. You can use a bonus action to cause one creature in the aura (including you) to regain 2d6 hit points.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self (30-foot radius)");
        this.setDuration("Concentration, up to 1 minute");
    }
}