package com.example.sw5ecompanion.models.equipment.lifesupport;

public class Respirator extends LifeSupport {

    public Respirator() {

        super();
        this.setName("Respirator");
        this.setCost(200);
        this.setWeight(1);
        this.setDescription("A respirator, or breath mask, is a portable device that allowed an " +
                "oxygen-breather to survive in low-oxygen atmospheres.  Although not suitable for" +
                " use in outer-space, these hands-free masks were essential equipment for " +
                "deep-space travel that might require activity outside of a starship.");
    }
}
