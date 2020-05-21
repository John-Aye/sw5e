package com.example.sw5ecompanion.models.charclass;

import java.util.ArrayList;

public class Berserker extends CharClass {

    private int mRage;
    private int mRageDamage;

    public Berserker() {

        super();
        this.setName("Berserker");
        this.setHitDie(12);
        this.setArmor(new String[] {"Light Armor", "Medium Armor"});
        this.setWeapons(new String[] {"Simple Vibroweapons", "Marital Vibroweapons",
                "Simple Blasters"});
        this.setTools(new String[] {});
        this.setSkillAmount(2);
        this.setSkillList(new String[] {"Animal Handling", "Athletics", "Intimidation", "Nature",
        "Perception", "Survival"});

    }

    public void levelOneFeats() {

        mRage = 2;
        mRageDamage = 2;

        ArrayList<String[]> feats = new ArrayList<String[]>();
        String[] rage = {"Rage", "In battle, you fight with primal ferocity.  On your turn, " +
                "you can enter a rage as a bonus action.\n" +
                "While raging you gain the following benefits if you aren't wearing heavy armor:\n" +
                " - You have advantage on Strength checks and Strength saving throws.\n" +
                " - When you make a melee weapon attack using Strength, you gain a bonus to the " +
                "damage roll that increases as you gain levels as a berserker, as shown in the " +
                "Rage Column of the Berserker table.\n" +
                " - You have resistance to kinetic and energy damage.\n" +
                "If you are able to cast power, you can't cast them or concentrate on them while " +
                "raging.\n" +
                "Your rage lasts for 1 minute.  It ends early if you are knocked unconscious or if " +
                "haven't attacked a hostile creature since you last turn or taken damage since then." +
                "  You can also end your rage on your turn as a bonus action.\n" +
                "Once you have raged the number times shown for your berserker level in the Rages " +
                "column of the Berserker table, you must finish a long rest before you can rage " +
                "again."};
        String[] unarmored = {"Unarmored Defence", "While you are not wearing any armor, your Armor " +
                "Class equals 10 + your Dexterity modifier + your Constitution modifier.  You can " +
                "use a shield and still gain this benefit."};

        feats.add(rage);
        feats.add(unarmored);

        this.setLevelOneFeatures(feats);
    }
}
