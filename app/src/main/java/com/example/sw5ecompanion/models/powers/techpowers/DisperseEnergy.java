import com.example.sw5ecompanion.models.powers.Power;

public class DisperseEnergy extends Power
{
    public DisperseEnergy () {
        super();
        this.setLvl(6);
        this.setName("Disperse Energy");
        this.setType("6th-level tech power");
        this.setDescription("You have resistance to acid, cold, re, lightning, and sonic damage for the power's duration. When you take damage of one of those types, you can use your reaction to gain immunity to that type of damage, including against the triggering damage. If you do so, the resistances end, and you have the immunity until the end of your next turn, at which time the power ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}