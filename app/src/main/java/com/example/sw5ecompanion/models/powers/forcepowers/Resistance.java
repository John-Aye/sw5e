import com.example.sw5ecompanion.models.powers.Power;

public class Resistance extends Power
{
    public Resistance() {
        super();
        this.setLvl(0);
        this.setName("Resistance");
        this.setType("At-will universal power");
        this.setDescription("You touch one willing creature. Once before the power ends, the target can roll a d4 and add the number rolled to one saving throw of its choice. It can roll the die before or after the saving throw. The power then ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 minute");
    }
}