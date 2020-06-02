package com.example.sw5ecompanion.models.species;

import java.util.Map;

public abstract class Species {

    private String firstName;
    private String lastName;

    private Map<String, Integer> abilityScoreAdjustments;

    private int age;
    private int maxAge;
    private int minAge;

    private String alignment;

    private String size;

    private double height;
    private double maxHeight;
    private double minHeight;

    private double weight;
    private double maxWeight;
    private double minWeight;

    private int speed;
    private int maxSpeed;
    private int minSpeed;

    private String[] languages;

    private String skinColor;
    private String hairColor;
    private String eyeColor;

    private String[] distinctions;

    private String world;

    private String description;

    public Species() {
    }

    public Species(String firstName, String lastName, Map<String, Integer> abilityScoreAdjustments, int age, int maxAge, int minAge, String alignment, String size, double height, double maxHeight, double minHeight, double weight, double maxWeight, double minWeight, int speed, int maxSpeed, int minSpeed, String[] languages, String skinColor, String hairColor, String eyeColor, String[] distinctions, String world, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.abilityScoreAdjustments = abilityScoreAdjustments;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.alignment = alignment;
        this.size = size;
        this.height = height;
        this.maxHeight = maxHeight;
        this.minHeight = minHeight;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.languages = languages;
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.distinctions = distinctions;
        this.world = world;
        this.description = description;
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setSpeed(speed);
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(double minHeight) {
        this.minHeight = minHeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
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
        if (age > maxAge) {
            this.age = maxAge;
        } else if (age < minAge) {
            this.age = minAge;
        } else {
            this.age = age;
        }
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
        if (height > maxHeight) {
            this.height = maxHeight;
        } else if (height < minHeight) {
            this.height = minHeight;
        } else {
            this.height = height;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > maxWeight) {
            this.weight = maxWeight;
        } else if (weight < minWeight) {
            this.weight = minWeight;
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > maxSpeed) {
            this.speed = maxSpeed;
        } else if (speed < minSpeed) {
            this.speed = minSpeed;
        } else {
            this.speed = speed;
        }
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

