import com.example.sw5ecompanion.models.powers.Power;

public class Explosion extends Power
{
    public Explosion () {
        super();
        this.setLvl(3);
        this.setName("Explosion");
        this.setType("3rd-level tech power");
        this.setDescription("You create an explosion at a point within range. Each creature in a 20-foot-radius sphere centered on that point must make a Dexterity saving throw. A target takes 8d6 re damage on a failed save, or half as much damage on a successful one. The re spreads around corners. It ignites ammable objects in the area that aren't being worn or carried. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 4th level or higher, the damage increases by 1d6 for each slot level above 3rd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("150 feet");
        this.setDuration("Instantaneous");
    }
}