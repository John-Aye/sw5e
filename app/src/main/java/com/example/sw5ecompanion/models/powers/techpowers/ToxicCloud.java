import com.example.sw5ecompanion.models.powers.Power;

public class ToxicCloud extends Power
{
    public ToxicCloud () {
        super();
        this.setLvl(5);
        this.setName("Toxic Cloud");
        this.setType("5th-level tech power");
        this.setDescription("You create a 20-foot-radius sphere of poisonous, yellow-green fog centered on a point you choose within range. The fog spreads around corners. It lasts for the duration or until strong wind disperses the fog, ending the power. Its area is heavily obscured. When a creature enters the power's area for the rst time on a turn or starts its turn there, that creature must make a Constitution saving throw. The creature takes 5d8 poison damage on a failed save, or half as much damage on a successful one. Creatures are aected even if they hold their breath or don't need to breathe. The fog moves 10 feet away from you at the start of each of your turns, rolling along the surface of the ground. The vapors, being heavier than air, sink to the lowest level of the land, even pouring down openings. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 6th level or higher, the damage increases by 1d8 for each slot level above 5th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 10 minutes");
    }
}