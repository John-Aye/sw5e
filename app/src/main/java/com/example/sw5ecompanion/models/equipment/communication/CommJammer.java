package com.example.sw5ecompanion.models.equipment.communication;

public class CommJammer extends Communication {

    public CommJammer() {

        super();
        this.setName("Comm Jammer");
        this.setCost(450);
        this.setWeight(3);
        this.setDescription("A comm jammer is a device used to scramble communications.  A comm " +
                "jammer can block transmissions from unenhanced communications devices in a 100 " +
                "foot radius.");
    }
}
