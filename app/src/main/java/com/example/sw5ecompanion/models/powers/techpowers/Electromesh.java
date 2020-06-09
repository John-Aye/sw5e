package com.example.sw5ecompanion.models.powers.techpowers;

import com.example.sw5ecompanion.models.powers.Power;

public class Electromesh extends Power
{
    public Electromesh () {
        super();
        this.setLvl(2);
        this.setName("Electromesh");
        this.setType("2nd-level tech power");
        this.setDescription("You expel a mass of thick, adhesive mesh at a point of your choice within range. The mesh ll a 20-foot cube from that point for the duration. The mesh is dicult terrain and lightly obscures their area. If the mesh isn't anchored between two solid masses (such as walls) or layered across a oor, wall, or ceiling, the electromesh collapses on itself, and the power ends at the start of your next turn. Mesh layered over a at surface has a depth of 5 feet. Each creature that starts its turn in the mesh or that enters it during its turn must make a Dexterity saving throw. On a failed save, the creature is restrained as long as it remains in the mesh or until it breaks free. A creature restrained by the mesh can use its action to make a Strength check against your tech save DC. If it succeeds, it is no longer restrained. The mesh is ammable. Any 5-foot cube of electromesh exposed to re burns away in 1 round, dealing 2d4 re damage to any creature that starts its turn in the fire.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}