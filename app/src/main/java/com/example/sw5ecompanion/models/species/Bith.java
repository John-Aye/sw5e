package com.example.sw5ecompanion.models.species;

import java.util.Map;

public class Bith extends Species {

    public Bith() {
    }

    public Bith(String firstName, String lastName, Map<String, Integer> abilityScoreAdjustments, int age, int maxAge, int minAge, String alignment, String size, double height, double maxHeight, double minHeight, double weight, double maxWeight, double minWeight, int speed, int maxSpeed, int minSpeed, String[] languages, String skinColor, String hairColor, String eyeColor, String[] distinctions, String world, String description) {
        super(firstName, lastName, abilityScoreAdjustments, age, 140, 12, alignment, size, height, 69, 57, weight, 800, 200, speed, 60, 30, languages, skinColor, hairColor, eyeColor, distinctions, world, description);
    }
}
