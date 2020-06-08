import com.example.sw5ecompanion.models.powers.Power;

public class ToxinScan extends Power
{
    public ToxinScan () {
        super();
        this.setLvl(1);
        this.setName("Toxin Scan");
        this.setType("1st-level tech power");
        this.setDescription("For the duration, you can see the presence and location of poisons and diseases within 30 feet of you. You also identify the kind of poison or disease in each case.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 10 minutes");
    }
}