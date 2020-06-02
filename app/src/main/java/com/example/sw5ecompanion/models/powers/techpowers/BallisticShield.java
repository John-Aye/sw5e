import com.example.sw5ecompanion.models.powers.Power;

public class BallisticShield extends Power
{
    public BallisticShield () {
        super();
        this.setLvl(4);
        this.setName("Ballistic Shield");
        this.setType("4th-level tech power");
        this.setDescription("A flickering blue shield surrounds your body. Until the power ends, you have resistance to kinetic and energy damage.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 hour");
    }
}