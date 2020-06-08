import com.example.sw5ecompanion.models.powers.Power;

public class BreathControl extends Power
{
    public BreathControl() {
        super();
        this.setLvl(3);
        this.setName("Bestow Curse");
        this.setType("1st-level universal power");
        this.setDescription("You are able to slow your metabolism in such a way that you can stop breathing and resist the eect of toxins in your body. If you are poisoned, you neutralize the poison. If more than one poison aicts you, you neutralize one poison that you know is present, or you neutralize one at random. For the duration, you have advantage on saving throws against being poisoned, resistance to poison damage, and you no longer need to breathe.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("10 minutes");
    }
}