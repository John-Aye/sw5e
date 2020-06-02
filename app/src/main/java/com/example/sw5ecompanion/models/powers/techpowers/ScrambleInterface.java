import com.example.sw5ecompanion.models.powers.Power;

public class ScrambleInterface extends Power
{
    public ScrambleInterface () {
        super();
        this.setLvl(3);
        this.setName("Scramble Interface");
        this.setType("3rd-level tech power");
        this.setDescription("You choose one droid or construct you can see within range and scramble its ability to dierentiate targets. The target must make an Intelligence saving throw. If the construct has the 'Piloted' trait, and has a pilot controlling it that is not incapacitated, it gains a bonus to the saving throw equal to the pilot's Intelligence modier. On a failed save, the target loses the ability to distinguish friend from foe, regarding all creatures it can see as enemies until the power ends. Each time the target takes damage, it can repeat the saving throw, ending the eect on itself on a success. Whenever the aected creature chooses another creature as a target, it must choose the target at random from among the creatures it can see within range of the attack, power, or other ability it's using. If an enemy provokes an opportunity attack from the aected creature, the creature must make that attack if it is able to.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}