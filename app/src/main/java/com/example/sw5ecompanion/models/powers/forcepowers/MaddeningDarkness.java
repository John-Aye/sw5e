import com.example.sw5ecompanion.models.powers.Power;

public class MaddeningDarkness extends Power
{
    public MaddeningDarkness () {
        super();
        this.setLvl(8);
        this.setName("Maddening Darkness");
        this.setType("8th-level dark side power");
        this.setDescription("Terrifying darkness spreads from a point you choose within range to ll a 60-foot-radius sphere until the power ends. The darkness spreads around corners. A creature with darkvision can't see through this darkness. Unenhanced light, as well as light created by powers of 8th level or lower, can't illuminate the area. Shrieks, gibbering, and mad laughter can be heard within the sphere. Whenever a creature starts its turn in the sphere, it must make a Wisdom saving throw, taking 8d8 psychic damage on a failed save, or half as much damage on a successful one.");
        this.setPrerequiste("Shroud of Darkness");
        this.setCastingTime("1 action");
        this.setRange("150 feet");
        this.setDuration("Concentration, up to 10 minutes");
    }
    
}