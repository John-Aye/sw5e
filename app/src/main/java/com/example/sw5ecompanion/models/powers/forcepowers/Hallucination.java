import com.example.sw5ecompanion.models.powers.Power;

public class Hallucination extends Power
{
    public Hallucination() {
        super();
        this.setLvl(2);
        this.setName("Hallucination");
        this.setType("2nd-level dark side power");
        this.setDescription("You craft a dangerous illusion in the mind of a creature that you can see within range. The target must make a Wisdom saving throw. On a failed save, you create a phantasmal object, creature, or other visible phenomenon of your choice that is no larger than a 10-foot cube and that is perceivable only to the target for the duration. This power has no eect on droids or constructs. The hallucination includes sound, temperature, and other stimuli, also evident only to the creature. The target can use its action to examine the hallucination with an Intelligence (Investigation) check against your force power save DC. If the check succeeds, the target realizes that the hallucination is an illusion, and the power ends. While a target is aected by the power, the target treats the hallucination as if it were real. The target rationalizes any illogical outcomes from interacting with the hallucination. For example, a target attempting to walk across a phantasmal bridge that spans a chasm falls once it steps onto the bridge. If the target survives the fall, it still believes that the bridge exists and comes up with some other explanation for its fall - it was pushed, it slipped, or a strong wind might have knocked it o. An aected target is so convinced of the hallucination's reality that it can even take damage from the illusion. A hallucination created to appear as a creature can attack the target. Similarly, a hallucination created to appear as re, a pool of acid, or lava can burn the target. Each round on your turn, the hallucination can deal 1d6 psychic damage to the target if it is in the hallucination's area or within 5 feet of the hallucination, provided that the illusion is of a creature or hazard that could logically deal damage, such as by attacking. The target perceives the damage as a type appropriate to the illusion. F o r c e P o t e n c y . When you cast this power using a force power slot of 3rd level or higher, the range increases by 20 feet, the image dimensions increase by 5 feet, and you can target one additional creature for every two slot levels above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60");
        this.setDuration("Concentration, up to 1 minute");
    }
}