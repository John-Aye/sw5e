import com.example.sw5ecompanion.models.powers.Power;

public class ForceMend extends Power
{
    public ForceMend() {
        super();
        this.setLvl(7);
        this.setName("Force Mend");
        this.setType("7th-level light side power");
        this.setDescription("You touch a creature and stimulate its natural healing ability. The target regains 4d8+15 hit points. For the duration of the power, the target regains 1 hit point at the start of each of its turns (10 hit points each minute). If the creature has a severed part you hold it to the stump, the power instantaneously causes the limb to knit to the stump. This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 minute");
        this.setRange("Touch");
        this.setDuration("1 hour");
    }
}