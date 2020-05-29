import com.example.sw5ecompanion.models.powers.Power;

public class AuraOfPurity extends Power
{
    public AuraOfPurity() {
        super();
        this.setLvl(4);
        this.setName("Aura of Purity");
        this.setType("4th-level light side power");
        this.setDescription("Purifying energy radiates from you in a 30-foot radius. Until the power ends, the aura moves with you, centered on you. Each nonhostile creature in the aura (including you) can't become diseased, has resistance to poison damage, and has advantage on saving throws against eects that cause any of the following conditions: blinded, charmed, deafened, frightened, paralyzed, poisoned, and stunned.");
        this.setPrerequiste("Restoration");
        this.setCastingTime("1 action");
        this.setRange("Self (30-foot radius)");
        this.setDuration("Concentration, up to 10 minutes");
    }
}