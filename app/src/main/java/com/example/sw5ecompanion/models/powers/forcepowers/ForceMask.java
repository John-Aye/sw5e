import com.example.sw5ecompanion.models.powers.Power;

public class ForceMask extends Power
{
    public ForceMask() {
        super();
        this.setLvl(1);
        this.setName("Force Mask");
        this.setType("1st-level universal power");
        this.setDescription("Until the power ends or you use an action to dismiss it, you can disguise yourself through use of the Force in many ways. You can appear to be shorter or taller by about a foot and change the appearance of your body and weight, but you cannot change the basic structure of your body. This eect can include your clothes, weapons, and other belongings on your person. This eect is only visual, so any sort of physical contact will only interact with the real size and shape of you. A creature that uses its action to examine you can identify this eect with a successful Intelligence (Investigation) check against your force save DC. This power has no eect on droids or constructs.");
        this.setPrerequiste("Mind Trick");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("1 hour");
    }
}