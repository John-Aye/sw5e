import com.example.sw5ecompanion.models.powers.Power;

public class DeathField extends Power
{
    public DeathField() {
        super();
        this.setLvl(8);
        this.setName("Death Field");
        this.setType("8th-level dark side power");
        this.setDescription("You draw the life force from every creature in a 30foot cube centered on a point you choose within range. Each creature in that area must make a Constitution saving throw. A creature takes 10d8 necrotic damage on a failed save, or half as much damage on a successful one. If you reduce a hostile creature to 0, you gain temporary hit points equal to half the damage dealt. This power has no eect on droids or constructs.");
        this.setPrerequiste("Siphon Life");
        this.setCastingTime("1 action");
        this.setRange("90 feet (30-foot cube)");
        this.setDuration("Instantaneous");
    }
}