import com.example.sw5ecompanion.models.powers.Power;

public class SaberWard extends Power
{
    public SaberWard() {
        super();
        this.setLvl(0);
        this.setName("Saber Ward");
        this.setType("At-will universal power");
        this.setDescription("You take a defensive stance. Until the end of your next turn, you have resistance against kinetic and energy damage dealt by weapons.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("Self");
        this.setDuration("Instantaneous");
    }
}