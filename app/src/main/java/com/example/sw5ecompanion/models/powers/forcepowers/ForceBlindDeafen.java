import com.example.sw5ecompanion.models.powers.Power;

public class ForceBlindDeafen extends Power
{
    public ForceBlindDeafen() {
        super();
        this.setLvl(2);
        this.setName("Force Blind/Deafen");
        this.setType("2nd-level light side power");
        this.setDescription("You can blind or deafen a foe. Choose one creature that you can see within range to make a Constitution saving throw. If it fails, the target is either blinded or deafened (your choice) for the duration. At the end of each of its turns, the target can make a Constitution saving throw. On a success, the power ends. F o r c e P o t e n c y . When you cast this power using a force slot of 3rd level or higher, you can target one additional creature for each slot level above 2nd.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("1 minute");
    }
}