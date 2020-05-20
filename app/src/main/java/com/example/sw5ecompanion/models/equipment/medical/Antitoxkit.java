package com.example.sw5ecompanion.models.equipment.medical;

public class Antitoxkit extends Medical {

    public Antitoxkit() {

        super();
        this.setName("Antitoxkit");
        this.setCost(600);
        this.setWeight(4);
        this.setDescription("An antitoxkit contained a variety of wide-spectrum antidote " +
                "hypospry injectors that were designed to neutralize all known poisons.  A kit " +
                "has five charges.  As an action, you can administer a charge of the kit to cure " +
                "a target of one poison affecting them or to give them advantage on saving throws " +
                "against poison for 1 hour.  It confers no benefit to droids or constructs.");
        this.setUses(5);
    }
}
