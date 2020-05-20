package com.example.sw5ecompanion.models.equipment.utilities;

public class RestrainingBolt extends Utilities {

    private String mDescription;

    public RestrainingBolt() {

        super();
        this.setName("Restraining Bolt");
        this.setCost(350);
        this.setWeight(1);
        mDescription = "Restraining bolt are small, cylindrical devices that can be affixed to a " +
                "droid in order to limit its functions and enforce obedience.  When inserted, a " +
                "restraining bolt restricts the droid from any movement its master does not desire," +
                " and also forced it to respond to signals produced by a hand-held control unit.\n" +
                "Installing a restraining bolt takes 1 minute.  The droid must make a DC 13 " +
                "Constitution saving throw.  A hostile droid makes this save with advantage.  On a " +
                "successful save, the restraining bolt overloads and is rendered useless.  On a " +
                "failed save, the restraining bolt correctly installed, and the control unit can be " +
                "used to actively control the droid.  While the control unit is inactive, the " +
                "droid can act freely but it can not attempt to remove the restraining bolt.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
