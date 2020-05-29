import com.example.sw5ecompanion.models.powers.Power;

public class StasisField extends Power
{
    public StasisField () {
        super();
        this.setLvl(8);
        this.setName("Stasis Field");
        this.setType("8th-level light side power");
        this.setDescription("Choose a target that you can see within range. Each creature must succeed on a Wisdom saving throw or be paralyzed for the duration. This power has no eect on droids or constructs. At the end of each of a target's turns, it can make another Wisdom saving throw. On a success, the power ends on the target. F o r c e P o t e n c y . When you cast this power using a force slot of 9th level, the size of the cube increases to 40 feet.");
        this.setPrerequiste("Stasis");
        this.setCastingTime("1 action");
        this.setRange("120 feet (30-foot cube)");
        this.setDuration("Concentration, up to 1 minute");
    }
}