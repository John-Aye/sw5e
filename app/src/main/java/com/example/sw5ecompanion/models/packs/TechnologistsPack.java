package com.example.sw5ecompanion.models.packs;

import com.example.sw5ecompanion.models.equipment.Equipment;
import com.example.sw5ecompanion.models.equipment.communication.Commlink;
import com.example.sw5ecompanion.models.equipment.datarecording.Datapad;
import com.example.sw5ecompanion.models.equipment.lifesupport.Respirator;
import com.example.sw5ecompanion.models.equipment.storage.Backpack;
import com.example.sw5ecompanion.models.equipment.storage.Canteen;
import com.example.sw5ecompanion.models.equipment.utilities.Bedroll;
import com.example.sw5ecompanion.models.equipment.utilities.Chronometer;
import com.example.sw5ecompanion.models.equipment.utilities.FieldRations;

import java.util.ArrayList;

public class TechnologistsPack extends Pack {

    public TechnologistsPack() {

        super();
        this.setCost(670);
        this.setDescription("Includes a backpack, chronometer, respirator, datapad, holocom, " +
                "commlink, bedroll, canteen, and 5 days of field rations");
        Backpack pack = new Backpack();
        Bedroll bed = new Bedroll();
        Chronometer meter = new Chronometer();
        Respirator respirator = new Respirator();
        FieldRations rations = new FieldRations();
        Canteen canteen = new Canteen();
        Commlink comm = new Commlink();
        Datapad pad = new Datapad();

        rations.setQuantity(5);

        ArrayList<Equipment> equip = new ArrayList<Equipment>();
        equip.add(bed);
        equip.add(meter);
        equip.add(respirator);
        equip.add(rations);
        equip.add(canteen);
        equip.add(comm);
        equip.add(pack);
        equip.add(pad);

        this.setEquipment(equip);
    }
}
