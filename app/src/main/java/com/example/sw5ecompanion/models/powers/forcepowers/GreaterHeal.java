import com.example.sw5ecompanion.models.powers.Power;

public class GreaterHeal extends Power
{
    public GreaterHeal() {
        super();
        this.setLvl(6);
        this.setName("Greater Heal");
        this.setType("6th-level light side power");
        this.setDescription("Choose a creature that you can see within range. A surge of positive energy washes through the creature, causing it to regain 70 hit points. This power also ends blindness, deafness, and any diseases aecting the target. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a force slot of 7th level or higher, the healing increases by 10 for each slot level above 6th.");
        this.setPrerequiste("Improved Heal");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}