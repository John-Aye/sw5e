package com.example.sw5ecompanion.models.charclass;

public class ClassBase {

    private String name;
    private int dieSize;
    private int archetypeSelection;
    private int skillAmount;
    private int[] archetypeLevels;
    private String[] weapons;
    private String[] armor;
    private String[] tools;
    private String[] skillList;
    private String[] savingThrows;

    public ClassBase(String name, int dieSize, int archetypeSelection, int skillAmount, int[] archetypeLevels, String[] weapons, String[] armor, String[] tools, String[] skillList, String[] savingThrows) {
        this.name = name;
        this.dieSize = dieSize;
        this.archetypeSelection = archetypeSelection;
        this.skillAmount = skillAmount;
        this.archetypeLevels = archetypeLevels;
        this.weapons = weapons;
        this.armor = armor;
        this.tools = tools;
        this.skillList = skillList;
        this.savingThrows = savingThrows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDieSize() {
        return dieSize;
    }

    public void setDieSize(int dieSize) {
        this.dieSize = dieSize;
    }

    public int getArchetypeSelection() {
        return archetypeSelection;
    }

    public void setArchetypeSelection(int archetypeSelection) {
        this.archetypeSelection = archetypeSelection;
    }

    public int getSkillAmount() {
        return skillAmount;
    }

    public void setSkillAmount(int skillAmount) {
        this.skillAmount = skillAmount;
    }

    public int[] getArchetypeLevels() {
        return archetypeLevels;
    }

    public void setArchetypeLevels(int[] archetypeLevels) {
        this.archetypeLevels = archetypeLevels;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    public String[] getArmor() {
        return armor;
    }

    public void setArmor(String[] armor) {
        this.armor = armor;
    }

    public String[] getTools() {
        return tools;
    }

    public void setTools(String[] tools) {
        this.tools = tools;
    }

    public String[] getSkillList() {
        return skillList;
    }

    public void setSkillList(String[] skillList) {
        this.skillList = skillList;
    }

    public String[] getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(String[] savingThrows) {
        this.savingThrows = savingThrows;
    }
}
