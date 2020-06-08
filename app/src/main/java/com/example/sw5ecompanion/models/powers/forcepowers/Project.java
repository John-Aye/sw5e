import com.example.sw5ecompanion.models.powers.Power;

public class Project extends Power
{
    public Project() {
        super();
        this.setLvl(1);
        this.setName("Project");
        this.setType("1st-level light side power");
        this.setDescription("You lift three piles of debris or small objects from the ground and hurl them. Each pile hits a creature of your choice that you can see within range. The pile deals 1d4+1 force damage to its target. The piles all strike simultaneously and you can direct them to hit one creature or several. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, you lift and throw an additional pile of debris for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}