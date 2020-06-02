import com.example.sw5ecompanion.models.powers.Power;

public class Overload extends Power
{
    public Overload () {
        super();
        this.setLvl(1);
        this.setName("Overload");
        this.setType("1st-level tech power");
        this.setDescription("You expel a burst of power. Each creature in a 15-foot cube originating from you must make a Dexterity saving throw. On a failed save, a creature takes 2d6 ion damage and is pushed 10 feet away from you. On a successful save, the creature takes half as much damage and isn't pushed. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self (15-foot cube)");
        this.setDuration("Instantaneous");
    }
}