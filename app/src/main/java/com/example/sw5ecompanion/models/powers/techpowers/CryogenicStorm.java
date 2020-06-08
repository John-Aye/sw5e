import com.example.sw5ecompanion.models.powers.Power;

public class CryogenicStorm extends Power
{
    public CryogenicStorm () {
        super();
        this.setLvl(4);
        this.setName("Cryogenic Storm");
        this.setType("4th-level tech power");
        this.setDescription("A storm of cryogenic energy encompasses the ground in a 20-foot-radius, 40-foot-high cylinder centered on a point within range. Each creature in the cylinder must make a Dexterity saving throw. A creature takes 2d8 kinetic damage and 4d6 cold damage on a failed save, or half as much damage on a successful one. The storm's area of eect becomes dicult terrain until the end of your next turn. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 5th level or higher, the kinetic damage increases by 1d8 for each slot level above 4th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}