import com.example.sw5ecompanion.models.powers.Power;

public class DebilitatingGas extends Power
{
    public DebilitatingGas () {
        super();
        this.setLvl(2);
        this.setName("DebilitatingGas");
        this.setType("2nd-level tech power");
        this.setDescription("You touch a willing creature to grant it the ability to see in the dark. For the duration, that creature has darkvision out to a range of 60 feet.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("8 hours");
    }
}