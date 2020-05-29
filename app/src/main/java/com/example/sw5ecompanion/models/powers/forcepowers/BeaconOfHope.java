import com.example.sw5ecompanion.models.powers.Power;

public class BeaconOfHope extends Power
{
    public BeaconOfHope() {
        super();
        this.setLvl(3);
        this.setName("Beacon of Hope");
        this.setType("3rd-level light side power");
        this.setDescription("This power bestows hope and vitality. Choose any number of creatures within range. For the duration, each target has advantage on Wisdom saving throws and death saving throws, and regains the maximum number of hit points possible from any healing.");
        this.setPrerequiste("Heroism");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}