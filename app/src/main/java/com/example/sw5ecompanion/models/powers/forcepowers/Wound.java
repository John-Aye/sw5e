import com.example.sw5ecompanion.models.powers.Power;

public class Wound extends Power
{
    public Wound () {
        super();
        this.setLvl(1);
        this.setName("Wound");
        this.setType("1st-level dark side power");
        this.setDescription("You make a piercing gesture at a creature within range. Make a ranged force attack against the target. On a hit, the target takes 2d8 necrotic damage and must make a Constitution saving throw. On a failed save, it is also poisoned until the end of your next turn. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, the damage increases by 1d8 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}