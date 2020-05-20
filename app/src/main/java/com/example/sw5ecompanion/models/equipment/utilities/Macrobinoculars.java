package com.example.sw5ecompanion.models.equipment.utilities;

public class Macrobinoculars extends Utilities {

    private String mDescription;

    public Macrobinoculars() {

        super();
        this.setName("Macrobinoculars");
        this.setCost(750);
        this.setWeight(1);
        mDescription = "Macrobinoculars are handheld viewing devices that allow users to observe " +
                "distant objects.  Some models are able to see into space from the surface of a " +
                "planet";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
