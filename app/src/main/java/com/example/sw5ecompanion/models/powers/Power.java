package com.example.sw5ecompanion.models.powers;

public abstract class Power{

    private int lvl;
    private String name;
    private String type;
    private String description;
    private String prerequiste;
    private String castingTime;
    private String range;
    private String duration;

    public Power()
    {
        super();
    }
    public Power(int lvl, String name, String type, String description, String prerequiste, String castingTime, String range, String duration) {
        this.lvl = lvl;
        this.name = name;
        this.type = type;
        this.description = description;
        this.prerequiste = prerequiste;
        this.castingTime = castingTime;
        this.range = range;
        this.duration = duration;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrerequiste() {
        return prerequiste;
    }

    public void setPrerequiste(String prerequiste) {
        this.prerequiste = prerequiste;
    }

    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
