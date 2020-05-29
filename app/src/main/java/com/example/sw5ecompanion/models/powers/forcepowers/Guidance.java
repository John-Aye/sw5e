import com.example.sw5ecompanion.models.powers.Power;

public class Guidance extends Power
{
    public Guidance() {
        super();
        this.setLvl(0);
        this.setName("Guidance");
        this.setType("At-will light side power");
        this.setDescription("You touch one willing creature. Once before the power ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can roll the die before or after making the ability check. The power then ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 minute");
    }
}