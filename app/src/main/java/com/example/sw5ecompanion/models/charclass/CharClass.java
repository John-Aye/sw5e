package com.example.sw5ecompanion.models.charclass;

import com.example.sw5ecompanion.models.equipment.Equipment;

import java.util.ArrayList;
import java.util.Map;

public class CharClass {

    private String mName;
    private Map<String, String> mDistinctions;
    private int mLevel;

    private ArrayList<String[]> mLevelOneFeatures;
    private ArrayList<String[]> mLevelTwoFeatures;
    private ArrayList<String[]> mLevelThreeFeatures;
    private ArrayList<String[]> mLevelFourFeatures;
    private ArrayList<String[]> mLevelFiveFeatures;
    private ArrayList<String[]> mLevelSixFeatures;
    private ArrayList<String[]> mLevelSevenFeatures;
    private ArrayList<String[]> mLevelEightFeatures;
    private ArrayList<String[]> mLevelNineFeatures;
    private ArrayList<String[]> mLevelTenFeatures;
    private ArrayList<String[]> mLevelElevenFeatures;
    private ArrayList<String[]> mLevelTwelveFeatures;
    private ArrayList<String[]> mLevelThirteenFeatures;
    private ArrayList<String[]> mLevelFourteenFeatures;
    private ArrayList<String[]> mLevelFifteenFeatures;
    private ArrayList<String[]> mLevelSixteenFeatures;
    private ArrayList<String[]> mLevelSeventeenFeatures;
    private ArrayList<String[]> mLevelEighteenFeatures;
    private ArrayList<String[]> mLevelNineteenFeatures;
    private ArrayList<String[]> mLevelTwentyFeatures;

    private int mHitDie;
    private String[] mArmor;
    private String[] mWeapons;
    private String[] mTools;
    private String[] mSavingThrows;
    private String[] mSkillList;
    private int mSkillAmount;
    private ArrayList<ArrayList<Equipment>> equipment;

    public CharClass() {

    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Map getDistinctions() {
        return mDistinctions;
    }

    public void setDistinctions(Map distinctions) {
        mDistinctions = distinctions;
    }

    public int getLevel() {
        return mLevel;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public ArrayList<String[]> getLevelOneFeatures() {
        return mLevelOneFeatures;
    }

    public void setLevelOneFeatures(ArrayList<String[]> levelOneFeatures) {
        mLevelOneFeatures = levelOneFeatures;
    }

    public ArrayList<String[]> getLevelTwoFeatures() {
        return mLevelTwoFeatures;
    }

    public void setLevelTwoFeatures(ArrayList<String[]> levelTwoFeatures) {
        mLevelTwoFeatures = levelTwoFeatures;
    }

    public ArrayList<String[]> getLevelThreeFeatures() {
        return mLevelThreeFeatures;
    }

    public void setLevelThreeFeatures(ArrayList<String[]> levelThreeFeatures) {
        mLevelThreeFeatures = levelThreeFeatures;
    }

    public ArrayList<String[]> getLevelFourFeatures() {
        return mLevelFourFeatures;
    }

    public void setLevelFourFeatures(ArrayList<String[]> levelFourFeatures) {
        mLevelFourFeatures = levelFourFeatures;
    }

    public ArrayList<String[]> getLevelFiveFeatures() {
        return mLevelFiveFeatures;
    }

    public void setLevelFiveFeatures(ArrayList<String[]> levelFiveFeatures) {
        mLevelFiveFeatures = levelFiveFeatures;
    }

    public ArrayList<String[]> getLevelSixFeatures() {
        return mLevelSixFeatures;
    }

    public void setLevelSixFeatures(ArrayList<String[]> levelSixFeatures) {
        mLevelSixFeatures = levelSixFeatures;
    }

    public ArrayList<String[]> getLevelSevenFeatures() {
        return mLevelSevenFeatures;
    }

    public void setLevelSevenFeatures(ArrayList<String[]> levelSevenFeatures) {
        mLevelSevenFeatures = levelSevenFeatures;
    }

    public ArrayList<String[]> getLevelEightFeatures() {
        return mLevelEightFeatures;
    }

    public void setLevelEightFeatures(ArrayList<String[]> levelEightFeatures) {
        mLevelEightFeatures = levelEightFeatures;
    }

    public ArrayList<String[]> getLevelNineFeatures() {
        return mLevelNineFeatures;
    }

    public void setLevelNineFeatures(ArrayList<String[]> levelNineFeatures) {
        mLevelNineFeatures = levelNineFeatures;
    }

    public ArrayList<String[]> getLevelTenFeatures() {
        return mLevelTenFeatures;
    }

    public void setLevelTenFeatures(ArrayList<String[]> levelTenFeatures) {
        mLevelTenFeatures = levelTenFeatures;
    }

    public ArrayList<String[]> getLevelElevenFeatures() {
        return mLevelElevenFeatures;
    }

    public void setLevelElevenFeatures(ArrayList<String[]> levelElevenFeatures) {
        mLevelElevenFeatures = levelElevenFeatures;
    }

    public ArrayList<String[]> getLevelTwelveFeatures() {
        return mLevelTwelveFeatures;
    }

    public void setLevelTwelveFeatures(ArrayList<String[]> levelTwelveFeatures) {
        mLevelTwelveFeatures = levelTwelveFeatures;
    }

    public ArrayList<String[]> getLevelThirteenFeatures() {
        return mLevelThirteenFeatures;
    }

    public void setLevelThirteenFeatures(ArrayList<String[]> levelThirteenFeatures) {
        mLevelThirteenFeatures = levelThirteenFeatures;
    }

    public ArrayList<String[]> getLevelFourteenFeatures() {
        return mLevelFourteenFeatures;
    }

    public void setLevelFourteenFeatures(ArrayList<String[]> levelFourteenFeatures) {
        mLevelFourteenFeatures = levelFourteenFeatures;
    }

    public ArrayList<String[]> getLevelFifteenFeatures() {
        return mLevelFifteenFeatures;
    }

    public void setLevelFifteenFeatures(ArrayList<String[]> levelFifteenFeatures) {
        mLevelFifteenFeatures = levelFifteenFeatures;
    }

    public ArrayList<String[]> getLevelSixteenFeatures() {
        return mLevelSixteenFeatures;
    }

    public void setLevelSixteenFeatures(ArrayList<String[]> levelSixteenFeatures) {
        mLevelSixteenFeatures = levelSixteenFeatures;
    }

    public ArrayList<String[]> getLevelSeventeenFeatures() {
        return mLevelSeventeenFeatures;
    }

    public void setLevelSeventeenFeatures(ArrayList<String[]> levelSeventeenFeatures) {
        mLevelSeventeenFeatures = levelSeventeenFeatures;
    }

    public ArrayList<String[]> getLevelEighteenFeatures() {
        return mLevelEighteenFeatures;
    }

    public void setLevelEighteenFeatures(ArrayList<String[]> levelEighteenFeatures) {
        mLevelEighteenFeatures = levelEighteenFeatures;
    }

    public ArrayList<String[]> getLevelNineteenFeatures() {
        return mLevelNineteenFeatures;
    }

    public void setLevelNineteenFeatures(ArrayList<String[]> levelNineteenFeatures) {
        mLevelNineteenFeatures = levelNineteenFeatures;
    }

    public ArrayList<String[]> getLevelTwentyFeatures() {
        return mLevelTwentyFeatures;
    }

    public void setLevelTwentyFeatures(ArrayList<String[]> levelTwentyFeatures) {
        mLevelTwentyFeatures = levelTwentyFeatures;
    }

    public int getHitDie() {
        return mHitDie;
    }

    public void setHitDie(int hitDie) {
        mHitDie = hitDie;
    }

    public String[] getArmor() {
        return mArmor;
    }

    public void setArmor(String[] armor) {
        mArmor = armor;
    }

    public String[] getWeapons() {
        return mWeapons;
    }

    public void setWeapons(String[] weapons) {
        mWeapons = weapons;
    }

    public String[] getTools() {
        return mTools;
    }

    public void setTools(String[] tools) {
        mTools = tools;
    }

    public String[] getSavingThrows() {
        return mSavingThrows;
    }

    public void setSavingThrows(String[] savingThrows) {
        mSavingThrows = savingThrows;
    }

    public String[] getSkillList() {
        return mSkillList;
    }

    public void setSkillList(String[] skillList) {
        mSkillList = skillList;
    }

    public int getSkillAmount() {
        return mSkillAmount;
    }

    public void setSkillAmount(int skillAmount) {
        mSkillAmount = skillAmount;
    }

    public ArrayList<ArrayList<Equipment>> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<ArrayList<Equipment>> equipment) {
        this.equipment = equipment;
    }
}
