package com.example.sw5ecompanion.models.equipment.communication;

public class HolotraceDevice extends Communication {

    public HolotraceDevice() {

        super();
        this.setName("Holotrace Device");
        this.setCost(1000);
        this.setWeight(5);
        this.setDescription("A holotrace device is a wrist-worn gadget that can be used to trace " +
                "a holographic transmission back to its source.");
    }
}
