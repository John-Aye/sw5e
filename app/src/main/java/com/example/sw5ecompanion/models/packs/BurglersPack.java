package com.example.sw5ecompanion.models.packs;

import com.example.sw5ecompanion.models.equipment.Equipment;
import com.example.sw5ecompanion.models.equipment.storage.Backpack;
import com.example.sw5ecompanion.models.equipment.storage.Canteen;
import com.example.sw5ecompanion.models.equipment.utilities.Chronometer;
import com.example.sw5ecompanion.models.equipment.utilities.FieldRations;
import com.example.sw5ecompanion.models.equipment.utilities.FusionCutter;
import com.example.sw5ecompanion.models.equipment.utilities.GlowRod;
import com.example.sw5ecompanion.models.equipment.utilities.GrapplingHook;
import com.example.sw5ecompanion.models.equipment.utilities.Hydrospanner;

import java.util.ArrayList;

public class BurglersPack extends Pack {

    public BurglersPack() {

        super();
        this.setDescription("Includes a backpack, two glow rods, a hydrospanner, a fusion cutter," +
                " a chronometer, a grappling hook, 5 days of field rations, and a canteen");
        this.setCost(290);
        Backpack backpack = new Backpack();
        GlowRod rods = new GlowRod();
        Hydrospanner spanner = new Hydrospanner();
        FusionCutter cutter = new FusionCutter();
        Chronometer meter = new Chronometer();
        GrapplingHook hook = new GrapplingHook();
        FieldRations rations = new FieldRations();
        Canteen canteen = new Canteen();

        
    }
}
