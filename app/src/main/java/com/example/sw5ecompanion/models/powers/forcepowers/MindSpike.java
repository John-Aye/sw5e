import com.example.sw5ecompanion.models.powers.Power;

public class MindSpike extends Power
{
    public MindSpike() {
        super();
        this.setLvl(2);
        this.setName("Mind Spike");
        this.setType("2nd-level dark side power");
        this.setDescription("Choose one creature you can see. The target must make a Wisdom saving throw. A creature takes 3d8 psychic damage on a failed save, or half as much damage on a successful one. Additionally, on a failed save, you always know the target's location, but only while the two of you are on the same planet. The target can't become hidden from you, and if it's invisible, it gains no benets from this condition against you. This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}