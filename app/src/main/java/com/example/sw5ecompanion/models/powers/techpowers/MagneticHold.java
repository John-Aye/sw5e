import com.example.sw5ecompanion.models.powers.Power;

public class MagneticHold extends Power
{
    public MagneticHold () {
        super();
        this.setLvl(2);
        this.setName("Magnetic Hold");
        this.setType("2nd-level tech power");
        this.setDescription("Until the power ends, one willing creature you touch gains the ability ax itself to and move along any metallic surface. It can move up, down, and across vertical surfaces and upside down along ceilings, all while leaving its hands free, at its normal walking speed.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 hour");
    }
}