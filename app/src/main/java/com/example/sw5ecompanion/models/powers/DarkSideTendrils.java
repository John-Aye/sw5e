import com.example.sw5ecompanion.models.powers.Power;

public class DarkSideTendrils extends Power
{
    public DarkSideTendrils() {
        super();
        this.setLvl(1);
        this.setName("Dark Side Tendrils");
        this.setType("1st-level dark side power");
        this.setDescription("Tendrils of dark energy erupt from you and batter all creatures within 10 feet of you. Each creature in that area must make a Strength saving throw. On a failed save, a target takes 2d6 necrotic damage and can't take reactions until its next turn. On a successful save, the creature takes half damage, but suers no other eect. F o r c e P o t e n c y . When you cast this power using a power slot of 2nd level or higher, the damage increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self (10-foot radius)");
        this.setDuration("Instantaneous");
    }
}