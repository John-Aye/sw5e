import com.example.sw5ecompanion.models.powers.Power;

public class Restoration extends Power
{
    public Restoration() {
        super();
        this.setLvl(2);
        this.setName("Restoration");
        this.setType("2nd-level light side power");
        this.setDescription("You touch a creature and end either one disease or one condition aicting it. The condition can be blinded, deafened, paralyzed, or poisoned.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}