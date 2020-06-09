package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class MagneticField extends Power
{
    public MagneticField () {
        super();
        this.setLvl(2);
        this.setName("Magnetic Field");
        this.setType("2nd-level tech power");
        this.setDescription("You create a strong magnetic field around you in a 10-foot radius which moves with you, remaining centered on you. The eld lasts for the power's duration. The eld has the following eects: The area is dicult terrain for creatures other than you. The attack rolls of ranged weapon attacks which deal kinetic, energy, or ion damage have disadvantage if the attacks pass in or out of the eld. Communications equipment cannot communicate into or out of the field.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 hour");
    }
}