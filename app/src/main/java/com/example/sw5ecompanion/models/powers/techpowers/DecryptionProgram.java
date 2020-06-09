package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class DecryptionProgram extends Power
{
    public DecryptionProgram () {
        super();
        this.setLvl(1);
        this.setName("Decryption Program");
        this.setType("1st-level tech power");
        this.setDescription("You gain insight into an encrypted message you are holding when you cast this power, granting you advantage on ability checks you make to decipher the document.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}