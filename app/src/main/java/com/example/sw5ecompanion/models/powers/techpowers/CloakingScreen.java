import com.example.sw5ecompanion.models.powers.Power;

public class CloakingScreen extends Power
{
    public CloakingScreen () {
        super();
        this.setLvl(4);
        this.setName("Cloaking Screen");
        this.setType("4th-level tech power");
        this.setDescription("You or a creature you touch becomes invisible until the power ends. Anything the target is wearing or carrying is invisible as long as it is on the target's person.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 minute");
    }
}