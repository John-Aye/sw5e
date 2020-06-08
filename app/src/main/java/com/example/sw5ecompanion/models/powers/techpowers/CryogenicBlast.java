import com.example.sw5ecompanion.models.powers.Power;

public class CryogenicBlast extends Power
{
    public CryogenicBlast () {
        super();
        this.setLvl(1);
        this.setName("Cryogenic Blast");
        this.setType("1st-level tech power");
        this.setDescription("You release a shard of cryogenic energy at one creature within range. Make a ranged tech attack against the target. On a hit, the target takes 1d10 kinetic damage. Hit or miss, the shard then explodes. The target and each creature within 5 feet of it must succeed on a Dexterity saving throw or take 2d6 cold damage. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 2nd level or higher, the cold damage increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}