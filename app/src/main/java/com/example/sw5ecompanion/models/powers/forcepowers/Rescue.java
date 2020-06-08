import com.example.sw5ecompanion.models.powers.Power;

public class Rescue extends Power
{
    public Rescue() {
        super();
        this.setLvl(2);
        this.setName("Rescue");
        this.setType("2nd-level universal side power");
        this.setDescription("You pull one willing ally you can see within 30 feet of you to an unoccupied space within 5 feet of you. The target must use their reaction to accept the pull.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
}