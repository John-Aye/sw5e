import com.example.sw5ecompanion.models.powers.Power;

public class Firestorm extends Power
{
    public Firestorm () {
        super();
        this.setLvl(6);
        this.setName("Firestorm");
        this.setType("6th-level tech power");
        this.setDescription("Choose a point on the ground within range, incinerating everything in a 15-foot radius. All creatures must make a Dexterity saving throw, taking 8d8 re damage on a failure or half as much on a success. All large or smaller creatures are pushed to the edge of the power's radius. You may choose one creature to be at the very center of the restorm, if you do so that creature has disadvantage on its saving throw and is knocked prone on a failure. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 7th level or higher, the damage increases by 1d8 and the radius increases by 5 feet for each slot level above 6th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}