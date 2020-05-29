import com.example.sw5ecompanion.models.powers.Power;

public class CalmEmotions extends Power
{
    public CalmEmotions() {
        super();
        this.setLvl(2);
        this.setName("Calm Emotions");
        this.setType("2nd-level light side power");
        this.setDescription("You attempt to suppress strong emotions in a group of people. Each humanoid in a 20-foot-radius sphere centered on a point you choose within range must make a Charisma saving throw a creature can choose to fail this saving throw if it wishes. If a creature fails its saving throw, choose one of the following two eects. You can suppress any eect causing a target to be charmed or frightened. When this power ends, any suppressed eect resumes, provided that its duration has not expired in the meantime. You can make a target indierent about creatures of your choice that it is hostile toward. This indierence ends if the target is attacked or harmed by a power or if it witnesses any of its friends being harmed. When the power ends, the creature becomes hostile again, unless the GM rules otherwise.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}