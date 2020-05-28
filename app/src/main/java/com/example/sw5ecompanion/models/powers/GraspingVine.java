import com.example.sw5ecompanion.models.powers.Power;

public class GraspingVine extends Power
{
    public GraspingVine() {
        super();
        this.setLvl(4);
        this.setName("Grasping Vine");
        this.setType("4th-level light side power");
        this.setDescription("You make a vine sprout from the ground in an unoccupied space you can see. When you cast this power, you can make the vine whip a creature up to 30 feet from it, if you can see the target. The creature must pass a Dexterity save or be pulled 20 feet directly toward the vine. Until the power ends, you can use your bonus action to have the vine lash out again.");
        this.setPrerequiste("Plant Surge");
        this.setCastingTime("1 bonus action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}