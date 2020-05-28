import com.example.sw5ecompanion.models.powers.Power;

public class ForceBreach extends Power
{
    public ForceBreach() {
        super();
        this.setLvl(5);
        this.setName("Force Breach");
        this.setType("5th-level universal power");
        this.setDescription("Choose a spot within range. All force powers of 5th level or lower in the area end. For each force power of 6th level or higher in the area, make an ability check using your forcecasting ability. The DC equals 10 + the power's level. On a successful check, the force power ends. F o r c e P o t e n c y . When you cast this power using a force slot of 6th level or higher, you automatically end the eects of a force power on the target if the power's level is equal to or less than the level of the force slot you used.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet (20-foot cube)");
        this.setDuration("Instantaneous");
    }
}