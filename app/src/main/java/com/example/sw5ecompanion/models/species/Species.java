package com.example.sw5ecompanion.models.species;

import java.util.Map;

public abstract class Species {

    private String firstName;
    private String lastName;

    private Map<String, Integer> abilityScoreAdjustments;

    private int age;

    private String alignment;

    private String size;
    private double height;
    private double weight;

    private int speed;

    private String[] languages;

    private String skinColor;
    private String hairColor;
    private String eyeColor;

    private String[] distinctions;

    private String world;

    private String description;

    public Species() {
    }

    public Species(String firstName, String lastName, Map<String, Integer> abilityScoreAdjustments, int age, String alignment, String size, double height, double weight, int speed, String[] languages, String skinColor, String hairColor, String eyeColor, String[] distinctions, String world, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.abilityScoreAdjustments = abilityScoreAdjustments;
        this.age = age;
        this.alignment = alignment;
        this.size = size;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.languages = languages;
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.distinctions = distinctions;
        this.world = world;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getAbilityScoreAdjustments() {
        return abilityScoreAdjustments;
    }

    public void setAbilityScoreAdjustments(Map<String, Integer> abilityScoreAdjustments) {
        this.abilityScoreAdjustments = abilityScoreAdjustments;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String[] getDistinctions() {
        return distinctions;
    }

    public void setDistinctions(String[] distinctions) {
        this.distinctions = distinctions;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

