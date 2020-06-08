import com.example.sw5ecompanion.models.powers.Power;

public class Hex extends Power
{
    public Hex() {
        super();
        this.setLvl(1);
        this.setName("Hex");
        this.setType("1st-level dark side power");
        this.setDescription("You curse an opponent within range. Until the power ends, you deal an extra 1d6 necrotic damage to the target whenever you hit it with an attack. Also, choose one ability when you cast the power. The target has disadvantage on ability checks made with the chosen ability. If the target drops to 0 hit points before this power ends, you can use a bonus action on a subsequent turn of yours to curse a new creature. F o r c e P o t e n c y . When you cast this power using a force slot of 3rd or 4th level, you can maintain your concentration on the power for up to 8 hours. When you use a force slot of 5th level or higher, you can maintain your concentration on the power for up to 24 hours.");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 1 hour");
    }
}