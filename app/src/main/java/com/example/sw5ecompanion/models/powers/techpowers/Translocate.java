import com.example.sw5ecompanion.models.powers.Power;

public class Translocate extends Power
{
    public Translocate () {
        super();
        this.setLvl(2);
        this.setName("Translocate");
        this.setType("2nd-level tech power");
        this.setDescription("Your form shimmers in a holographic conguration, and then collapses. You teleport up to 30 feet to an unoccupied space that you can see.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action")
        this.setRange("Self");
        this.setDuration("Instantaneous");
    }
}