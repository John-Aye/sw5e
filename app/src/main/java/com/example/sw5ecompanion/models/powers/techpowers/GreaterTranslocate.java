import com.example.sw5ecompanion.models.powers.Power;

public class GreaterTranslocate extends Power
{
    public GreaterTranslocate () {
        super();
        this.setLvl(5);
        this.setName("Greater Translocate");
        this.setType("5th-level tech power");
        this.setDescription("Your form shimmers in a holographic conguration, and then collapses. You teleport up to 60 feet to an unoccupied space that you can see. On each of your turns before the power ends, you can use a bonus action to teleport in this way again.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}