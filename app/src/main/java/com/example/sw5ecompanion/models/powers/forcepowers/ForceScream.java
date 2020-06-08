import com.example.sw5ecompanion.models.powers.Power;

public class ForceScream extends Power
{
    public ForceScream() {
        super();
        this.setLvl(3);
        this.setName("Force Scream");
        this.setType("3rd-level dark side power");
        this.setDescription("You emit a scream imbued with the power of the Force. Each creature you choose within 15 feet of you must succeed on a Constitution saving throw. On a failed save, a creature take 4d6 psychic damage, 4d6 sonic damage, and is deafened until the end of its next turn. On a successful save, it takes half as much damage and isn't deafened.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self (15-foot radius");
        this.setDuration("Instantaneous");
    }
}