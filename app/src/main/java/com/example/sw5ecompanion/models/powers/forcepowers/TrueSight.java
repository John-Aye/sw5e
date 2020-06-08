import com.example.sw5ecompanion.models.powers.Power;

public class TrueSight extends Power
{
    public TrueSight () {
        super();
        this.setLvl(6);
        this.setName("True Sight");
        this.setType("6th-level universal power");
        this.setDescription("You shift your vision to see through use of the Force, giving you the ability to see things as they actually are. For the duration, you have truesight and notice secret doors hidden by powers, all out to a range of 120 feet.");
        this.setPrerequiste("Force Sight");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("1 hour");
    }
}