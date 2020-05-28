import com.example.sw5ecompanion.models.powers.Power;

public class Feedback extends Power
{
    public Feedback() {
        super();
        this.setLvl(0);
        this.setName("Feedback");
        this.setType("At-will dark side power");
        this.setDescription("You unleash a burst of psychic energy at a target within range. If the target can hear you (though it need not understand you), it must succeed on an Intelligence saving throw or take 1d4 psychic damage and have disadvantage on the next attack roll it makes before the end of its next turn. This power's damage increases by 1d4 when you reach 5th level (2d4), 11th level (3d4), and 17th level (4d4).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}