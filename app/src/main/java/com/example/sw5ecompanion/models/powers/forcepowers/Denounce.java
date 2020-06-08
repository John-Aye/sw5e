import com.example.sw5ecompanion.models.powers.Power;

public class Denounce extends Power
{
    public Denounce() {
        super();
        this.setLvl(0);
        this.setName("Denounce");
        this.setType("At-will dark side power");
        this.setDescription("A target of your choice within range must make a Charisma saving throw. On a failed save, when the target makes their next attack roll or saving throw they must roll a d4 and subtract the number from it. The power then ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}