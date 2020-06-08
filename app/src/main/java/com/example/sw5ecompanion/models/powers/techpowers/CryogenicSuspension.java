import com.example.sw5ecompanion.models.powers.Power;

public class CryogenicSuspension extends Power
{
    public CryogenicSuspension () {
        super();
        this.setLvl(3);
        this.setName("Cryogenic Suspension");
        this.setType("3rd-level tech power");
        this.setDescription("Choose up to six creatures of your choice in a 40-foot cube within range. Each target must succeed on a Dexterity saving throw or be aected by this power for the duration. An aected target's speed is halved, it takes a -2 penalty to AC and Dexterity saving throws, and it can't use reactions. On its turn, it can use either an action or a bonus action, not both. Regardless of the creature's abilities or items, it can't make more than one melee or ranged attack during its turn. If the creature attempts to cast a power with a casting time of 1 action, roll a d20. On an 11 or higher, the power doesn't take eect until the creature's next turn, and the creature must use its action on that turn to complete the power. If it can't, the power is wasted. A creature aected by this power makes another Dexterity saving throw at the end of its turn. On a successful save, the eect ends for it.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}