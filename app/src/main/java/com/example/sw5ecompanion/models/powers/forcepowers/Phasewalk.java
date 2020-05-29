import com.example.sw5ecompanion.models.powers.Power;

public class Phasewalk extends Power
{
    public Phasewalk() {
        super();
        this.setLvl(2);
        this.setName("Phasewalk");
        this.setType("2nd-level universal power");
        this.setDescription("You teleport up to 30 feet to an unoccupied space that you can see.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("Self");
        this.setDuration("Instantaneous");
    }
}