import com.example.sw5ecompanion.models.powers.Power;

public class DisperseForce extends Power
{
    public DisperseForce() {
        super();
        this.setLvl(1);
        this.setName("Disperse Force");
        this.setType("1st-level universal power");
        this.setDescription("This power absorbs damage from incoming energy attacks, lessening its eect on you and distributing it throughout your body. You have resistance to the triggering damage type until the start of your next turn. Also, you gain 5 temporary hit points to potentially absorb the attack. These temporary hit points last until the start of your next turn. F o r c e P o t e n c y . When you cast this power using a force slot of 2nd level or higher, the temporary hit points increases by 5 for each slot level above 1st.");
        this.setPrerequiste("Saber Ward");
        this.setCastingTime("1 reaction, which you take when you take cold, energy, re, ion, lightning, or sonic damage");
        this.setRange("Self");
        this.setDuration("1 round");
    }
}