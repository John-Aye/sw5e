import com.example.sw5ecompanion.models.powers.Power;

public class MindTrap extends Power
{
    public MindTrap() {
        super();
        this.setLvl(4);
        this.setName("Mind Trap");
        this.setType("4th-level universal power");
        this.setDescription("You attempt to trap the mind of your target in a psychic cage. The target must make a Charisma saving throw. On a failed save, the creature's mind is trapped. It can think, but it can't have any contact with or perceive the outside world. If the creature takes damage, it makes another Charisma save. On a success, the power ends. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a force slot of 6th level or higher, after 1 minute of concentration the power's duration becomes 24 hours and it no longer requires your concentration.");
        this.setPrerequiste("Force Confusion");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}