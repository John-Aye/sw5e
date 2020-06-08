import com.example.sw5ecompanion.models.powers.Power;

public class ForceSuppression extends Power
{
    public ForceSuppression() {
        super();
        this.setLvl(3);
        this.setName("Force Suppression");
        this.setType("3rd-level universal power");
        this.setDescription("Choose one creature, object, or force eect within range. Any force power of 3rd level or lower on the target ends. For each force power of 4th level or higher on the target, make an ability check using your forcecasting ability. The DC equals 10 + the power's level. On a success, the power ends. F o r c e P o t e n c y . When you cast this power using a force slot of 4th level or higher, you automatically end the eects of a force power on the target if the power's level is equal to or less than the level of the force slot you used.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}