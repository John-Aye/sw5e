import com.example.sw5ecompanion.models.powers.Power;

public class MasterForceScream extends Power
{
    public MasterForceScream() {
        super();
        this.setLvl(8);
        this.setName("Master Force Scream");
        this.setType("8th-level dark side power");
        this.setDescription("You emit a cacophonous scream imbued with the power of the Force. Each creature you choose within 60 feet of you must succeed on a Constitution saving throw. On a failed save, a creature takes 6d6 psychic damage, 6d6 sonic damage, is deafened, knocked prone, and blinded for 1 minute. On a successful save, it takes half as much damage and isn't deafened, knocked prone, or blinded by this power. A creature blinded by this power makes another Constitution saving throw at the end of each of its turns. On a successful save, it is no longer blinded.");
        this.setPrerequiste("Improved Force Scream");
        this.setCastingTime("1 action");
        this.setRange("Self (60-foot radius)");
        this.setDuration("Instantaneous");
    }
}