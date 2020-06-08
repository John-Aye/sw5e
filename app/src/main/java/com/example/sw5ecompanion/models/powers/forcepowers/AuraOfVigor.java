import com.example.sw5ecompanion.models.powers.Power;

public class AuraOfVigor extends Power
{
    public AuraOfVigor() {
        super();
        this.setLvl(3);
        this.setName("Aura of Vigor");
        this.setType("3rd-level light side power");
        this.setDescription("Envigorating energy radiates from you in a 30-foot radius. Until the power ends, the aura moves with you, centered on you. Each nonhostile creature in the aura (including you) deals an extra 1d4 damage with weapon attacks.");
        this.setPrerequiste("Valor");
        this.setCastingTime("1 action");
        this.setRange("Self (30-foot radius)");
        this.setDuration("Concentration, up to 1 minute");
    }
}