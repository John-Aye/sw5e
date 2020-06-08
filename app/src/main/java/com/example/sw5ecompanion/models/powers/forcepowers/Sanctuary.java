import com.example.sw5ecompanion.models.powers.Power;

public class Sanctuary extends Power
{
    public Sanctuary() {
        super();
        this.setLvl(1);
        this.setName("Sanctuary");
        this.setType("1st-level light side power");
        this.setDescription("Until the power ends, any creature who targets the warded creature with an attack, a harmful power, or a hostile action must rst make a Wisdom saving throw. On a failed save, the creature must choose a new target or lose the attack or power. This power doesn't protect the warded creature from area eects. If the warded creature makes an attack, casts a power that aects an enemy creature, or takes a hostile action this power ends.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("30 feet");
        this.setDuration("1 minute");
    }
}