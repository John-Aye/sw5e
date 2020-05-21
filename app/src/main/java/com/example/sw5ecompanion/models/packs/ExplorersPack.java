package com.example.sw5ecompanion.models.packs;

import com.example.sw5ecompanion.models.equipment.Equipment;
import com.example.sw5ecompanion.models.equipment.communication.Commlink;
import com.example.sw5ecompanion.models.equipment.storage.Backpack;
import com.example.sw5ecompanion.models.equipment.storage.Canteen;
import com.example.sw5ecompanion.models.equipment.utilities.Bedroll;
import com.example.sw5ecompanion.models.equipment.utilities.Fibercord;
import com.example.sw5ecompanion.models.equipment.utilities.FieldRations;
import com.example.sw5ecompanion.models.equipment.utilities.GlowRod;
import com.example.sw5ecompanion.models.equipment.utilities.MessKit;

import java.util.ArrayList;

public class ExplorersPack extends Pack {

    public ExplorersPack() {

        super();
        this.setCost(250);
        this.setDescription("Includes a backpack, a bedroll, a blanket, a mess kit, two glow rods, " +
                "a commlink, 10 days of field rations, a canteen, and 50 feet of fibercord.");
        Backpack pack = new Backpack();
        Bedroll bed = new Bedroll();
        MessKit kit = new MessKit();
        GlowRod rods = new GlowRod();
        Commlink comm = new Commlink();
        FieldRations rations = new FieldRations();
        Canteen canteen = new Canteen();
        Fibercord cord = new Fibercord();

        rods.setQuantity(2);
        rations.setQuantity(10);

        ArrayList<Equipment> equip = new ArrayList<Equipment>();
        equip.add(bed);
        equip.add(comm);
        equip.add(rods);
        equip.add(rations);
        equip.add(canteen);
        equip.add(kit);
        equip.add(pack);
        equip.add(cord);

        this.setEquipment(equip);
    }
}
