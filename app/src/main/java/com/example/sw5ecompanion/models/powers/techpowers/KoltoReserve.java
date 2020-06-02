import com.example.sw5ecompanion.models.powers.Power;

public class KoltoReserve extends Power
{
    public KoltoReserve () {
        super();
        this.setLvl(4);
        this.setName("Kolto Reserve");
        this.setType("4th-level tech power");
        this.setDescription("You touch a creature and grant it a small reserve of kolto. The rst time the target would drop to 0 hit points as a result of taking damage, the target instead drops to 1 hit point, and the power ends. If the power is still in eect when the target is subjected to an eect that would kill it instantaneously without dealing damage, that eect is instead negated against the target, and the powers ends. This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("8 hours");
    }
}