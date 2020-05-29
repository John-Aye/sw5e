import com.example.sw5ecompanion.models.powers.Power;

public class Hysteria extends Power
{
    public Hysteria() {
        super();
        this.setLvl(4);
        this.setName("Hysteria");
        this.setType("4th-level dark side power");
        this.setDescription("You tap into the nightmares of a creature you can see within range and create an illusory manifestation of its deepest fears, visible only to that creature. The target becomes frightened for the duration. At the end of each of the target's turns before the power ends, the target must succeed on a Wisdom saving throw or take 4d10 psychic damage. On a successful save, the power ends. This power has no eect on droids or constructs. F o r c e P o t e n c y . When you cast this power using a force power slot of 5th level or higher, the damage increases by 1d10 for each slot level above 4th.");
        this.setPrerequiste("Hallucination");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}