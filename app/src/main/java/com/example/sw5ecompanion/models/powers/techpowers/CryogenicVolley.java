import com.example.sw5ecompanion.models.powers.Power;

public class CryogenicVolley extends Power
{
    public CryogenicVolley () {
        super();
        this.setLvl(2);
        this.setName("Cryogenic Volley");
        this.setType("2nd-level tech power");
        this.setDescription("An explosion of cold energy erupts from a point you choose within range. Each creature in a 5-foot-radius sphere centered on that point must make a Dexterity saving throw. On a failed save, a creature takes 3d6 cold damage, and its speed is reduced by 10 feet until the start of your next turn. On a successful save, a creature takes half as much damage and isn't slowed. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 3rd level or higher, the damage increases by 1d6 for each slot level above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("90 feet");
        this.setDuration("Instantaneous");
    }
}