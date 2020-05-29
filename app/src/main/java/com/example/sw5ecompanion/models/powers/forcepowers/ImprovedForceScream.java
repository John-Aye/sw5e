import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedForceImmunity extends Power
{
    public ImprovedForceScream() {
        super();
        this.setLvl(5);
        this.setName("Improved Force Scream");
        this.setType("5th-level universal power");
        this.setDescription("You emit a violent scream imbued with the power of the Force. Each creature you choose within 30 feet of you must succeed on a Constitution saving throw. On a failed save, a creature take 5d6 psychic damage, 5d6 sonic damage, is deafened, and is knocked prone. On a successful save, it takes half as much damage and isn't deafened or knocked prone.");
        this.setPrerequiste("Force Scream");
        this.setCastingTime("1 action");
        this.setRange("Self (30-foot radius)");
        this.setDuration("Instantaneous");
    }
    
}