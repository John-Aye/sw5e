import com.example.sw5ecompanion.models.powers.Power;

public class IonBlast extends Power
{
    public IonBlast () {
        super();
        this.setLvl(0);
        this.setName("Invulnerability");
        this.setType("At-will tech power");
        this.setDescription("You create a blast of ion energy. Choose one creature within range, or choose two creatures within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d4 ion damage. Droids and constructs have disadvantage on this saving throw. This power's damage increases by 1d4 when you reach 5th level (2d4), 11th level (3d4), and 17th level (4d4).");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
}