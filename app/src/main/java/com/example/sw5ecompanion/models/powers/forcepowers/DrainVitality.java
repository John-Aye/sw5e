import com.example.sw5ecompanion.models.powers.Power;

public class DrainVitality extends Power
{
    public DrainVitality() {
        super();
        this.setLvl(2);
        this.setName("Drain Vitality");
        this.setType("2nd-level dark side power");
        this.setDescription("You draw the willpower from a creature you can see within range. Make a ranged force attack against the target. On a hit, the target takes 2d6 necrotic damage and it deals only half damage with weapon attacks that use Strength until the power ends. At the end of each of the target's turns, it can make a Constitution saving throw against the power. On a success, the power ends. F o r c e P o t e n c y . When you cast this power using a force slot of 3rd level or higher, the damage increases by 1d6 for each slot level above 2nd.");
        this.setPrerequiste("Drain Vitality");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}