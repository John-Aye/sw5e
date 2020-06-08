import com.example.sw5ecompanion.models.powers.Power;

public class Burst extends Power
{
    public Burst() {
        super();
        this.setLvl(0);
        this.setName("Burst");
        this.setType("At-will universal power");
        this.setDescription("You cause the earth to burst from beneath your feet. Each creature within range, other than you, must succeed on a Dexterity saving throw or take 1d6 kinetic damage. This power's damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self (5-foot sphere)");
        this.setDuration("Instantaneous");
    }
}