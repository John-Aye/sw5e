import com.example.sw5ecompanion.models.powers.Power;

public class ToxinPurge extends Power
{
    public ToxinPurge () {
        super();
        this.setLvl(2);
        this.setName("Toxin Purge");
        this.setType("2nd-level tech power");
        this.setDescription("You touch a creature. If it is poisoned or diseased, you neutralize the poison or disease. If more than one poison or disease aicts the target, you neutralize one poison or disease that you know is present, or you neutralize one at random. For the duration, the target has advantage on saving throws against being poisoned or diseased, and it has resistance to poison damage.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Touch");
        this.setDuration("1 hour");
    }
}