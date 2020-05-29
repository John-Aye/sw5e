import com.example.sw5ecompanion.models.powers.Power;

public class Shock extends Power
{
    public Shock() {
        super();
        this.setLvl(0);
        this.setName("Shock");
        this.setType("At-will dark side power");
        this.setDescription("You hurl a bolt of lightning at a target within range, making a ranged power attack. On a hit, the target takes 1d10 lightning damage. The lightning ignites ammable objects in the area that aren't being worn or carried. This power's damage increases by 1d10 when you reach 5th level (2d10), 11th level (3d10), and 17th level (4d10).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}