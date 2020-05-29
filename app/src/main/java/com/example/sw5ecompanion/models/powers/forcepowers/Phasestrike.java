import com.example.sw5ecompanion.models.powers.Power;

public class Phasestrike extends Power
{
    public Phasestrike() {
        super();
        this.setLvl(1);
        this.setName("Phasestrike");
        this.setType("1st-level universal power");
        this.setDescription("Until the power ends, your movement doesn't provoke opportunity attacks. Once before the power ends, you can give yourself advantage on one weapon attack roll on your turn. That attack deals an extra 1d8 force damage on a hit. Whether you hit or miss, your walking speed increases by 30 feet until the end of that turn.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}