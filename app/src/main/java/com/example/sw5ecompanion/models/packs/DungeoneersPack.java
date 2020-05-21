package com.example.sw5ecompanion.models.packs;



import com.example.sw5ecompanion.models.equipment.Equipment;
import com.example.sw5ecompanion.models.equipment.datarecording.Datapad;
import com.example.sw5ecompanion.models.equipment.storage.Backpack;
import com.example.sw5ecompanion.models.equipment.storage.Canteen;
import com.example.sw5ecompanion.models.equipment.utilities.Fibercord;
import com.example.sw5ecompanion.models.equipment.utilities.FieldRations;
import com.example.sw5ecompanion.models.equipment.utilities.FusionCutter;
import com.example.sw5ecompanion.models.equipment.utilities.GlowRod;
import com.example.sw5ecompanion.models.equipment.utilities.GrapplingHook;

import java.util.ArrayList;

public class DungeoneersPack extends Pack {

    public DungeoneersPack() {


        this.setCost(320);
        this.setDescription("Includes a backpack, 5 glow rods, a fusion cutter, a grappling hook, " +
                "a chronometer, 10 days of field rations, a canteen and 50 feet of fibercord.");

        Backpack pack = new Backpack();
        GlowRod rods = new GlowRod();
        FusionCutter cutter = new FusionCutter();
        Datapad pad = new Datapad();
        GrapplingHook hook = new GrapplingHook();
        Fibercord cord = new Fibercord();
        FieldRations rations = new FieldRations();
        Canteen canteen = new Canteen();

        rods.setQuantity(5);
        rations.setQuantity(10);

        ArrayList<Equipment> equip = new ArrayList<Equipment>();
        equip.add(pack);
        equip.add(rods);
        equip.add(pad);
        equip.add(cutter);
        equip.add(rations);
        equip.add(cord);
        equip.add(canteen);
        equip.add(hook);

        this.setEquipment(equip);
    }
}
