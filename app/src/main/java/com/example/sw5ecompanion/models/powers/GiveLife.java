import com.example.sw5ecompanion.models.powers.Power;

public class GiveLife extends Power
{
    public GiveLife() {
        super();
        this.setLvl(0);
        this.setName("Give Life");
        this.setType("At-will light side power");
        this.setDescription("Placing your hand on another creature you can transfer your own life force to them. You spend and roll one of your hit dice and the creature regains that many hit points. This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}