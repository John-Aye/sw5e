package com.example.sw5ecompanion.models.equipment.utilities;

public class HeatGenerator extends Utilities {

    private String mDescription;

    public HeatGenerator() {

        super();
        this.setName("Heat Generator");
        this.setCost(400);
        this.setWeight(4);
        mDescription = "Heat generators are special devices typically worn on belts that function " +
                "as a portable, personal heat supply.  Activating or deactivating the generator " +
                "requires a bonus action and, while active, you are adapted to cold climates, as " +
                "described in chapter 5 of the Dungeon Masters Guide.  The generator lasts for 10 " +
                "minutes, and can be recharged by a power source or replacing the power cell.";
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
