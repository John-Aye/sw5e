package com.example.sw5ecompanion.models.equipment.specialist;

public class SecurityKit extends Specialist {

    public SecurityKit() {

        super();
        this.setName("Security Kit");
        this.setCost(500);
        this.setWeight(2);
        this.setDescription("A security kit includes the tools and electronic components necessary " +
                "to bypass electronics and mechanical locks.  It includes sensor devices, a " +
                "specialized commlink designed to detect silent alarms, a small file, a set of " +
                "lockpicks, a small mirror mounted to an elongated handle, a set of " +
                "narrow-bladed scissors, and a pair of pliers.  Proficiency with these tools lets " +
                "you add your proficiency bonus to any ability checks you make to disarm traps " +
                "or open locks.");
    }
}
