package com.example.sw5ecompanion.models.equipment.communication;

public class PocketScrambler extends Communication {

    public PocketScrambler() {

        super();
        this.setName("Pocket Scrambler");
        this.setCost(800);
        this.setWeight(1);
        this.setDescription("A pocket scrambler is a simple add-on to any commlink that " +
                "automatically encodes any messages sent out.  The transmitted message can only be " +
                "read by a device equipped with a matched scrambler.");
    }
}
