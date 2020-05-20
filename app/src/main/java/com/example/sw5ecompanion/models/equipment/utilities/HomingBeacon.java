package com.example.sw5ecompanion.models.equipment.utilities;

public class HomingBeacon extends Utilities {

    private String mDescription;

    public HomingBeacon() {

        super();
        this.setName("Homing Beacon");
        this.setCost(450);
        this.setWeight(1);
        mDescription = "A homing beacon is a device used to track starships or any other entity " +
                "being transported.  Homing beacons transmit using non-mass HoloNet transceivers " +
                "able to be tracked through hyperspace.  Homing beacons are small enough that they " +
                "can easily be hidden inside a ship, or tucked into some crevice on its exterior.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
