import com.example.sw5ecompanion.models.powers.Power;

public class DelayedExplosion extends Power
{
    public DelayedExplosion () {
        super();
        this.setLvl(7);
        this.setName("Delayed Explosion");
        this.setType("7th-level tech power");
        this.setDescription("You create a delayed explosion at a point within range. When the power ends, either because your concentration is broken or because you decide to end it, the explosion occurs. Each creature in a 20-footradius sphere centered on that point must make a Dexterity saving throw. A creature takes re damage equal to the total accumulated damage on a failed save, or half as much damage on a successful one. The power's base damage is 12d6. If at the end of your turn the explosion has not yet occurred, the damage increases by 1d6. If the explosion is touched before the interval has expired, the creature touching it must make a Dexterity saving throw. On a failed save, the power ends immediately, causing the explosion. The re spreads around corners. It ignites ammable objects in the area that aren't being worn or carried. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 8th level or higher, the base damage increases by 1d6 for each slot level above 7th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("150 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}