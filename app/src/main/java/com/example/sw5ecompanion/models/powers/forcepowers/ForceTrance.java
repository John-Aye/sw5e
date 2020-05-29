import com.example.sw5ecompanion.models.powers.Power;

public class ForceTrance extends Power
{
    public ForceTrance() {
        super();
        this.setLvl(3);
        this.setName("Force Trance");
        this.setType("3rd-level light side power");
        this.setDescription("You make a calming gesture, and up to three willing creatures of your choice that you can see within range fall unconscious for the power's duration. The power ends on a target early if it takes damage or someone uses an action to shake or slap it awake. If a target remains unconscious for the full duration, that target gains the benet of a short rest, and it can't be aected by this power again until it nishes a long rest. F o r c e P o t e n c y . When you cast this power using a force slot of 4th level or higher, you can target one additional willing creature for each slot level above 3rd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("10 minutes");
    }
}