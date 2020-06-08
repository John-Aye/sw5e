import com.example.sw5ecompanion.models.powers.Power;

public class WallOfLight extends Power
{
    public WallOfLight () {
        super();
        this.setLvl(6);
        this.setName("Wall of Light");
        this.setType("6th-level light side power");
        this.setDescription("You conjure an immense manifestation of destructive light side Force energy. The wall appears within range and lasts for the duration. You can make a straight wall up to 100 feet long, 20 feet high, and 5 feet thick, or a ringed wall up to 60 feet in diameter, 20 feet high, and 5 feet thick. The wall provides threequarters cover and its space is dicult terrain. When a creature enters the wall's area for the rst time on a turn or starts its turn there, it must make a Dexterity saving throw. On a failed save, the creature takes 6d10 force damage, or half as much on a success.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("90 feet");
        this.setDuration("Concentration, up to 10 minutes");
    }
}