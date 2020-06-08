import com.example.sw5ecompanion.models.powers.Power;

public class GreaterAnalyze extends Power
{
    public GreaterExplosion () {
        super();
        this.setLvl(9);
        this.setName("Greater Explosion");
        this.setType("9th-level tech power");
        this.setDescription("You expell a massive explosion at a point within range. Each creature in a 40-foot-radius sphere centered on that point must make a Dexterity saving throw. A target takes 40d6 re damage and is knocked prone on a failed save, or half as much damage on a successful one but remain standing. The re spreads around corners. It ignites ammable objects in the area that aren't being worn or carried.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("150 feet");
        this.setDuration("Instantaneous");
    }
}