import com.example.sw5ecompanion.models.powers.Power;

public class ForceRepulse extends Power
{
    public ForceRepulse() {
        super();
        this.setLvl(3);
        this.setName("Force Repulse");
        this.setType("3rd-level universal power");
        this.setDescription("You release an omnidirectional telekinetic burst. Each creature within 20 feet must make a Dexterity saving throw. On a failed save, a creature takes 8d6 force damage and is pushed back 5 feet. On a successful save, a creature takes half damage and isn't pushed. All small objects that are not worn or carried are also pushed 5 feet back. F o r c e P o t e n c y . When you cast this power using a force slot of 4th level or higher, the damage increases by 1d6 for each slot level above 3rd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self (20-foot radius");
        this.setDuration("Instantaneous");
    }
}