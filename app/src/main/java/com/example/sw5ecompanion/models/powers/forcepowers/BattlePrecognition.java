import com.example.sw5ecompanion.models.powers.Power;

public class BattlePrecognition extends Power
{
    public BattlePrecognition() {
        super();
        this.setLvl(1);
        this.setName("Battle Precognition");
        this.setType("1st-level universal power");
        this.setDescription("Your attunement to the Force warns you when you are about to enter danger. Until the power ends, your base AC becomes 13 + your Dexterity modier. This power has no eect if you are wearing armor.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("8 hours");
    }
}