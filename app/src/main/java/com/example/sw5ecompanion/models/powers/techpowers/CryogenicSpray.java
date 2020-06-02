import com.example.sw5ecompanion.models.powers.Power;

public class CryogenicSpray extends Power
{
    public CryogenicSpray () {
        super();
        this.setLvl(5);
        this.setName("Cryogenic Spray");
        this.setType("5th-level tech power");
        this.setDescription("A blast of cold air erupts from you. Each creature in a 60-foot cone must make a Constitution saving throw. On a failed save, a creature takes 8d8 cold damage, and its speed is reduced by 10 feet until the start of your next turn. On a successful save, a creature takes half as much damage and isn't slowed. A creature killed by this power becomes frozen in carbonite. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 6th level or higher, the damage increases by 1d8 for each slot level above 5th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Instantaneous");
    }
}