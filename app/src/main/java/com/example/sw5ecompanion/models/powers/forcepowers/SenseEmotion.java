import com.example.sw5ecompanion.models.powers.Power;

public class SenseEmotion extends Power
{
    public SenseEmotion() {
        super();
        this.setLvl(1);
        this.setName("SenseEmotion");
        this.setType("1st-level universal power");
        this.setDescription("You attune your senses to pick up the emotions of others for the duration. When you cast the power, and as your action on each turn until the power ends, you can focus your senses on one humanoid you can see within 30 feet of you. You instantly learn the target's prevailing emotion, whether it's love, anger, pain, fear, calm, or something else. If the target isn't actually humanoid or it is immune to being charmed, you sense that it is calm.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Concentration, up to 10 minutes");
    }
}