import com.example.sw5ecompanion.models.powers.Power;

public class MasterHeal extends Power
{
    public MasterHeal() {
        super();
        this.setLvl(9);
        this.setName("Master Heal");
        this.setType("9th-level light side power");
        this.setDescription("A wave of healing energy washes over the creature you touch. The target regains all its hit points. If the creature is charmed, frightened, paralyzed, or stunned, the condition ends. If the creature is prone, it can use its reaction to stand up. This power has no eect on droids or constructs.");
        this.setPrerequiste("Greater Heal");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}