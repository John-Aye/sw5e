package com.example.sw5ecompanion.models.equipment.utilities;

public class MessKit extends Utilities {

    private String mDescription;

    public MessKit() {

        super();
        this.setName("Mess Kit");
        this.setCost(20);
        this.setWeight(1);
        mDescription = "This box contains a cip and simple cutlery.  The box clamps together, and " +
                "one side can be used as a cooking pan and the other as a plate or shallow bowl.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
