import com.example.sw5ecompanion.models.powers.Power;

public class KoltoWaves extends Power
{
    public KoltoWaves () {
        super();
        this.setLvl(9);
        this.setName("Kolto Waves");
        this.setType("9th-level tech power");
        this.setDescription("A flood of kolto energy ows from you into injured creatures around you. You restore up to 700 hit points, divided as you choose among any number of creatures that you can see within range. Creatures healed by this power are also cured of all diseases and any eect making them blinded or deafened. This power has no eect on droids or constructs.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}