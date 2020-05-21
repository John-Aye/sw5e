package com.example.sw5ecompanion.models.packs;

import com.example.sw5ecompanion.models.equipment.Equipment;
import com.example.sw5ecompanion.models.equipment.clothing.ClothesFine;
import com.example.sw5ecompanion.models.equipment.datarecording.Datacard;
import com.example.sw5ecompanion.models.equipment.datarecording.Datapad;
import com.example.sw5ecompanion.models.equipment.datarecording.StylusPen;
import com.example.sw5ecompanion.models.equipment.storage.Canteen;
import com.example.sw5ecompanion.models.equipment.storage.Chest;
import com.example.sw5ecompanion.models.equipment.utilities.FieldRations;

import java.util.ArrayList;

public class DiplomatsPack extends Pack {

    public DiplomatsPack() {

        this.setCost(330);
        this.setDescription("Includes a chest, a set of fine clothes, a datapad, 5 datacards, " +
                "a stylus, 5 days of field rations, and a canteen");

        Chest chest = new Chest();
        ClothesFine clothes = new ClothesFine();
        Datapad pad = new Datapad();
        Datacard card = new Datacard();
        StylusPen pen = new StylusPen();
        FieldRations rations = new FieldRations();
        Canteen canteen = new Canteen();

        card.setQuantity(5);
        rations.setQuantity(5);

        ArrayList<Equipment> equip = new ArrayList<Equipment>();
        equip.add(chest);
        equip.add(clothes);
        equip.add(pad);
        equip.add(pen);
        equip.add(rations);
        equip.add(card);
        equip.add(canteen);

        this.setEquipment(equip);
    }
}
