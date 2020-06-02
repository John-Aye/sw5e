import com.example.sw5ecompanion.models.powers.Power;

public class ProtectionFromEnergy extends Power
{
    public ProtectionFromEnergy () {
        super();
        this.setLvl(3);
        this.setName("Protection From Energy");
        this.setType("3rd-level tech power");
        this.setDescription("For the duration, the willing creature you touch has resistance to one damage type of your choice: acid, cold, re, lightning, or sonic.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 hour");
    }
}