package com.example.sw5ecompanion.models.packs;

import com.example.sw5ecompanion.models.equipment.Equipment;
import com.example.sw5ecompanion.models.equipment.datarecording.Datacard;
import com.example.sw5ecompanion.models.equipment.datarecording.Datapad;
import com.example.sw5ecompanion.models.equipment.datarecording.Holorecorder;
import com.example.sw5ecompanion.models.equipment.datarecording.StylusPen;
import com.example.sw5ecompanion.models.equipment.storage.Backpack;
import com.example.sw5ecompanion.models.equipment.storage.Canteen;
import com.example.sw5ecompanion.models.equipment.utilities.FieldRations;

import java.util.ArrayList;

public class ScholarsPack extends Pack {

    public ScholarsPack() {

        super();
        this.setCost(290);
        this.setDescription("Includes a backpack, a datapad, 5 datacards, a stylus, a holorecorder, " +
                "5 days of field rations, and a canteen");
        Backpack pack = new Backpack();
        Datapad pad = new Datapad();
        Datacard card = new Datacard();
        StylusPen pen = new StylusPen();
        FieldRations rations = new FieldRations();
        Canteen canteen = new Canteen();
        Holorecorder recorder = new Holorecorder();

        card.setQuantity(5);
        rations.setQuantity(5);

        ArrayList<Equipment> equip = new ArrayList<Equipment>();
        equip.add(pad);
        equip.add(card);
        equip.add(pen);
        equip.add(rations);
        equip.add(canteen);
        equip.add(recorder);
        equip.add(pack);

        this.setEquipment(equip);
    }
}
