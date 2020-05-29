import com.example.sw5ecompanion.models.powers.Power;

public class Tremor extends Power
{
    public Tremor () {
        super();
        this.setLvl(1);
        this.setName("Tremor");
        this.setType("1st-level universal power");
        this.setDescription("You cause a tremor in the ground within range. Each creature other than you in a 5-foot-radius sphere centered on that point must make a Dexterity saving throw. On a failed save, a creature takes 1d6 kinetic damage and is knocked prone. On a successful save, the creature takes half as much damage and isn't knocked prone. If the ground in that area is loose earth or stone, it becomes dicult terrain until cleared, with each 5-foot-diameter portion requiring at least 1 minute to clear by hand. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("Burst");
        this.setCastingTime("1 action");
        this.setRange("10 feet");
        this.setDuration("Instantaneous");
    }
}