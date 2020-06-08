import com.example.sw5ecompanion.models.powers.Power;

public class Stasis extends Power
{
    public Stasis () {
        super();
        this.setLvl(5);
        this.setName("Stasis");
        this.setType("5th-level light side power");
        this.setDescription("Choose up to 3 creatures that you can see within range. Each target must succeed on a Wisdom saving throw or be paralyzed for the duration. This power has no eect on droids or constructs. At the end of each of its turns, a target can make another Wisdom saving throw. On a success, the power ends on the target. F o r c e P o t e n c y . When you cast this power using a force slot of 6th level or higher, you can target an additional creature for each slot level above 5th.");
        this.setPrerequiste("Stun");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}