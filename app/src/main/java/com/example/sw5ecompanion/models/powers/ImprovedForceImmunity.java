import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedForceImmunity extends Power
{
    public ImprovedForceImmunity() {
        super();
        this.setLvl(6);
        this.setName("Improved Force Immunity");
        this.setType("6th-level universal power");
        this.setDescription("An immobile, faintly shimmering barrier springs into existence in a 15-foot radius around you and remains for the duration. The barrier moves with you. Any force power of 5th level or lower cast from outside the barrier can't aect creatures or objects within it, even if the power is cast using a higher level force slot. Such a power can target creatures and objects within the barrier, but the power has no eect on them. Similarly, the area within the barrier is excluded from the areas aected by such powers. F o r c e P o t e n c y . When you cast this power using a force slot of 7th level or higher, the barrier blocks powers of one level higher for each slot level above 6th.");
        this.setPrerequiste("Force Immunity");
        this.setCastingTime("1 action");
        this.setRange("Self (15-foot radius)");
        this.setDuration("Concentration, up to 1 minute");
    }
    
}