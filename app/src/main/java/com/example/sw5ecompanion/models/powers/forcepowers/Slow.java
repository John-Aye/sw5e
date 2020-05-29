import com.example.sw5ecompanion.models.powers.Power;

public class Slow extends Power
{
    public Slow() {
        super();
        this.setLvl(0);
        this.setName("Slow");
        this.setType("At-will dark side power");
        this.setDescription("A hostile creature of your choice must make a Constitution saving throw. On a failed save, the target's speed decreases by 10 feet until the power ends. The target's speed decreases by 5 more feet when you reach 5th level (15 feet), 11th level (20 feet), and 17th level (25 feet).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("15 feet");
        this.setDuration("1 hour");
    }
}