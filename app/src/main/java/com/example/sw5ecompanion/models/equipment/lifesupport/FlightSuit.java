package com.example.sw5ecompanion.models.equipment.lifesupport;

public class FlightSuit extends LifeSupport {

    public FlightSuit() {

        super();
        this.setName("Flight Suit");
        this.setCost(1000);
        this.setWeight(5);
        this.setDescription("Flight suits, or jumpsuits, are a type of outfit worn by pilots.  " +
                "They are worn in conjunction with flight helmets.  They come in a variety of " +
                "different colors and provide life support, and protect from hostile environments.");
    }
}
