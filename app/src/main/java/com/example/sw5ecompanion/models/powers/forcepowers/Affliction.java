import com.example.sw5ecompanion.models.powers.Power;

public class Affliction extends Power
{
    public Affliction() {
        super();
        this.setLvl(2);
        this.setName("Affliction");
        this.setType("2nd-level dark side power");
        this.setDescription("Choose a creature that you can see within range. That creature must make a Constitution saving throw. On a failed save, the target's speed is halved, it takes a -2 penalty to AC and Dexterity saving throws, and it can't use reactions. On its turn, it can use either an action or a bonus action, not both. Regardless of the creature's abilities or items, it can't make more than one melee or ranged attack during its turn. If the creature attempts to cast a power with a casting time of 1 action, roll a d20. On an 11 or higher, the power doesn't take eect until the creature's next turn, and the creature must use its action on that turn to complete the power. If it can't, the power is wasted. The creatures makes another Constitution saving throw at the end of its turn. On a successful save, the eect ends.");
        this.setPrerequiste("Slow");
        this.setCastingTime("1 action");
        this.setRange("30 ft");
        this.setDuration("Concentration, up to 1 minute");
    }
}