package com.example.sw5ecompanion.models.packs;

import com.example.sw5ecompanion.models.equipment.Equipment;
import com.example.sw5ecompanion.models.equipment.clothing.ClothesCostume;
import com.example.sw5ecompanion.models.equipment.specialist.DisguiseKit;
import com.example.sw5ecompanion.models.equipment.storage.Backpack;
import com.example.sw5ecompanion.models.equipment.storage.Canteen;
import com.example.sw5ecompanion.models.equipment.utilities.Bedroll;
import com.example.sw5ecompanion.models.equipment.utilities.FieldRations;
import com.example.sw5ecompanion.models.equipment.utilities.GlowRod;

import java.util.ArrayList;

public class EntertainersPack extends Pack {

    public EntertainersPack() {

        super();
        this.setCost(420);
        this.setDescription("Includes a backpack, a bedroll, two costumes, two glow rods, 5 days " +
                "of field rations, a canteen, and a disguise kit");
        Backpack pack = new Backpack();
        Bedroll bed = new Bedroll();
        ClothesCostume costume = new ClothesCostume();
        GlowRod rods = new GlowRod();
        FieldRations rations = new FieldRations();
        Canteen canteen = new Canteen();
        DisguiseKit kit = new DisguiseKit();

        costume.setQuantity(2);
        rods.setQuantity(2);
        rations.setQuantity(5);

        ArrayList<Equipment> equip = new ArrayList<Equipment>();
        equip.add(bed);
        equip.add(costume);
        equip.add(rods);
        equip.add(rations);
        equip.add(canteen);
        equip.add(kit);
        equip.add(pack);

        this.setEquipment(equip);
    }
}
