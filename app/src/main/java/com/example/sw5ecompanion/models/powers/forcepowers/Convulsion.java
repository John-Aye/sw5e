import com.example.sw5ecompanion.models.powers.Power;

public class Convulsion extends Power
{
    public Convulsion() {
        super();
        this.setLvl(3);
        this.setName("Convulsion");
        this.setType("3rd-level universal power");
        this.setDescription("Choose a point you can see on the ground within range. A fountain of churned earth and stone erupts in a 20-foot cube centered on that point. Each creature in that area must make a Dexterity saving throw. A creature takes 3d12 kinetic damage on a failed save, or half as much damage on a successful one. Additionally, the ground in that area becomes dicult terrain until cleared. Each 5-foot-square portion of the area requires at least 1 minute to clear by hand. F o r c e P o t e n c y . When you cast this power using a force slot of 4th level or higher, the damage increases by 1d12 for each slot level above 3rd.");
        this.setPrerequiste("Tremor");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}