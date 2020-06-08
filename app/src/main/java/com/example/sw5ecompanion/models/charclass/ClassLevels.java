package com.example.sw5ecompanion.models.charclass;

public class ClassLevels {

    private String special;
    private int specialAmount;
    private String[][] features;

    public ClassLevels(String special, int specialAmount, String[][] features) {
        this.special = special;
        this.specialAmount = specialAmount;
        this.features = features;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getSpecialAmount() {
        return specialAmount;
    }

    public void setSpecialAmount(int specialAmount) {
        this.specialAmount = specialAmount;
    }

    public String[][] getFeatures() {
        return features;
    }

    public void setFeatures(String[][] features) {
        this.features = features;
    }
}
