import com.example.sw5ecompanion.models.powers.Power;

public class ScramblingShield extends Power
{
    public ScramblingShield () {
        super();
        this.setLvl(6);
        this.setName("Scrambling Shield");
        this.setType("6th-level tech power");
        this.setDescription("An immobile, faintly shimmering barrier springs into existence in a 10-foot radius around you and remains for the duration. Any tech power of 5th level or lower cast from outside the barrier can't aect creatures or objects within it, even if the power is cast using a higher level tech slot. Such a power can target creatures and objects within the barrier, but the power has no eect on them. Similarly, the area within the barrier is excluded from the areas aected by such powers. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 7th level or higher, the barrier blocks powers of one level higher for each slot level above 6th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self (10-foot radius)");
        this.setDuration("Concentration, up to 1 minute");
    }
}