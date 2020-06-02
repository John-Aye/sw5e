import com.example.sw5ecompanion.models.powers.Power;

public class EnergyShield extends Power
{
    public EnergyShield () {
        super();
        this.setLvl(1);
        this.setName("Energy Shield");
        this.setType("1st-level tech power");
        this.setDescription("You quickly create an energy shield. Until the start of your next turn, you have a +5 bonus to AC. This includes the triggering attack.");
        this.setPrerequiste("");
        this.setCastingTime("1 reaction, which you take when you are hit by an attack")
        this.setRange("Self");
        this.setDuration("1 round");
    }
}