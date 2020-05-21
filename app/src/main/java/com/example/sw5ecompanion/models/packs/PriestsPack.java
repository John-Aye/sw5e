package com.example.sw5ecompanion.models.packs;

import com.example.sw5ecompanion.models.equipment.Equipment;
import com.example.sw5ecompanion.models.equipment.datarecording.Datapad;
import com.example.sw5ecompanion.models.equipment.medical.Traumakit;
import com.example.sw5ecompanion.models.equipment.storage.Backpack;
import com.example.sw5ecompanion.models.equipment.storage.Canteen;
import com.example.sw5ecompanion.models.equipment.utilities.Blanket;
import com.example.sw5ecompanion.models.equipment.utilities.Fibercord;
import com.example.sw5ecompanion.models.equipment.utilities.FieldRations;
import com.example.sw5ecompanion.models.equipment.utilities.GlowRod;

import java.util.ArrayList;

public class PriestsPack extends Pack {

    public PriestsPack() {

        super();
        this.setCost(275);
        this.setDescription("Includes a backpack, a blanket, two glowrods, a datapad, a traumakit, " +
                "5 days of field rations, canteen, and 50 feet of fibercord");
        Backpack pack = new Backpack();
        Blanket blanky = new Blanket();
        GlowRod rods = new GlowRod();
        Datapad pad = new Datapad();
        Traumakit kit = new Traumakit();
        FieldRations rations = new FieldRations();
        Canteen canteen = new Canteen();
        Fibercord cord = new Fibercord();

        rods.setQuantity(2);
        rations.setQuantity(5);

        ArrayList<Equipment> equip = new ArrayList<Equipment>();
        equip.add(rods);
        equip.add(rations);
        equip.add(canteen);
        equip.add(kit);
        equip.add(pack);
        equip.add(blanky);
        equip.add(pad);
        equip.add(cord);

        this.setEquipment(equip);
    }
}
