import com.example.sw5ecompanion.models.powers.Power;

public class ForceCamouflage extends Power
{
    public ForceBreach() {
        super();
        this.setLvl(2);
        this.setName("Force Breach");
        this.setType("2nd-level universal power");
        this.setDescription("You become invisible until the power ends. Anything you are wearing or carrying is invisible as long as it is on your person. The power ends if you attack or cast a power.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 hour");
    }
}