import com.example.sw5ecompanion.models.powers.Power;

public class ForceImmunity extends Power
{
    public ForceImmunity() {
        super();
        this.setLvl(4);
        this.setName("Force Immunity");
        this.setType("4th-level universal power");
        this.setDescription("An immobile, faintly shimmering barrier springs into existence around you and remains for the duration. The barrier moves with you. Any force power of 3rd level or lower cast from outside the barrier can't aect you, even if the power is cast using a higher level force slot. Such a power can target you, but the power has no eect on you. Similarly, the area within the barrier is excluded from the areas aected by such powers. F o r c e P o t e n c y . When you cast this power using a force slot of 5th level or higher, the barrier blocks powers of one level higher for each slot level above 4th.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 1 minute");
    }
}