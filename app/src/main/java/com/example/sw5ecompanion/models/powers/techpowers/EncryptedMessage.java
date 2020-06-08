import com.example.sw5ecompanion.models.powers.Power;

public class EncryptedMessage extends Power
{
    public EncryptedMessage () {
        super();
        this.setLvl(0);
        this.setName("Encrypted Message");
        this.setType("At-will tech power");
        this.setDescription("You point your finger toward a creature within range that possesses a commlink and whisper a message. The target (and only the target) hears the message and can send an encrypted reply that only you can hear. These messages cannot be intercepted or decrypted by unenhanced means. You can cast this power through solid objects if you are familiar with the target and know it is beyond the barrier. 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood blocks the power. The power doesn't have to follow a straight line and can travel freely around corners or through openings.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("1 round");
    }
}