import com.example.sw5ecompanion.models.powers.Power;

public class TechOverride extends Power
{
    public TechOverride () {
        super();
        this.setLvl(3);
        this.setName("Tech Override");
        this.setType("3rd-level tech power");
        this.setDescription("You attempt to interrupt a creature in the process of casting a tech power. If the creature is casting a power of 3rd level or lower, its power fails and has no eect. If it is casting a power of 4th level or higher, make an ability check using your techcasting ability. The DC equals 10 + the power's level. On a success, the creature's power fails and has no eect. O v e r c h a r g e T e c h . When you cast this power using a tech slot of 4th level or higher, the interrupted power has no eect if its level is less than or equal to the level of the force slot you used.");
        this.setPrerequiste("");
        this.setCastingTime("1 reaction")
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}