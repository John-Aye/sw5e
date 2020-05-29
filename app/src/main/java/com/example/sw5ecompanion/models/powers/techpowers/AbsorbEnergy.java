import com.example.sw5ecompanion.models.powers.Power;

public class AbsorbEnergy extends Power
{
    public AbsorbEnergy () {
        super();
        this.setLvl(1);
        this.setName("Absorb Energy");
        this.setType("1st-level tech power");
        this.setDescription("The power captures some of the incoming energy, lessening its eect on you and storing it for your next melee attack. You have resistance to the triggering damage type until the start of your next turn. Also, the rst time you hit with a melee attack on your next turn, the target takes an extra 1d6 damage of the triggering type, and the power ends. O v e r c h a r g e T e c h . When you cast this power using a power slot of 2nd level or higher, the extra damage increases by 1d6 for each slot level above 1st.");
        this.setPrerequiste("");
        this.setCastingTime("1 reaction, which you take when you take acid, cold, energy, fire, ion, kinetic, lightning, or sonic damage ");
        this.setRange("Self");
        this.setDuration("1 round");
    }
}