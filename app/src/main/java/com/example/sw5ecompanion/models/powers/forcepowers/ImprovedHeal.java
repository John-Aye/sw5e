import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedHeal extends Power
{
    public ImprovedHeal() {
        super();
        this.setLvl(5);
        this.setName("Improved Force Scream");
        this.setType("5th-level light side power");
        this.setDescription("A wave of healing energy washes out from a point of your choice within range. Choose up to six creatures in a 30-foot-radius sphere centered on that point. Each target regains hit points equal to 3d8 + your forcecasting ability modier. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a force slot of 6th level or higher, the healing increases by 1d8 for each slot level above 5th.");
        this.setPrerequiste("Heal");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
    
}