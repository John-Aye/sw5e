import com.example.sw5ecompanion.models.powers.Power;

public class Darkness extends Power
{
    public Darkness() {
        super();
        this.setLvl(2);
        this.setName("Darkness");
        this.setType("2nd-level dark side power");
        this.setDescription("Darkness spreads from a point you choose within range to ll a 15-foot-radius sphere until the power ends. The darkness spreads around corners. A creature with darkvision can't see through this darkness, and unenhanced light can't illuminate it. If the point you choose is on an object you are holding or one that isn't being worn or carried, the darkness comes from the object and moves with it. Completely covering the source of the darkness with an opaque object blocks the darkness. If this power's area overlaps with light created by a 2nd-level power or lower, this power and the light are dispelled.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Concentration, up to 10 minutes");
    }
}