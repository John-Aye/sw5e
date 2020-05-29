import com.example.sw5ecompanion.models.powers.Power;

public class Turbulence extends Power
{
    public Turbulence () {
        super();
        this.setLvl(0);
        this.setName("Turbulence");
        this.setType("At-will light side power");
        this.setDescription("Choose one creature, or choose two creatures that are within 5 feet of each other, within range. A target must succeed on a Dexterity saving throw or take 1d6 force damage. This power's damage increases by 1d6 when you reach 5th, 11th, and 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}