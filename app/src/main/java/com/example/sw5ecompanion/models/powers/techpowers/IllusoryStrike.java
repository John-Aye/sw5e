import com.example.sw5ecompanion.models.powers.Power;

public class IllusoryStrike extends Power
{
    public IllusoryStrike () {
        super();
        this.setLvl(0);
        this.setName("Homing Rockets");
        this.setType("At-will tech power");
        this.setDescription("As part of the action used to cast this power, you must make a melee attack with a weapon against one creature within your weapon's reach, otherwise the power fails. On a hit, the target suers the attack's normal eects, and you create an illusory duplicate of yourself in your space that only the target can see. The target has disadvantage on the next attack roll it makes against you before the start of your next turn. This power creates multiple duplicates when you reach higher levels. At 5th level, you create a second illusory duplicate, and the target has disadvantage on the next two attacks it makes against you before the start of your next turn. The number of duplicates and attacks with disadvantage increases to three at 11th level and four at 17th level.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Varies");
        this.setDuration("1 round");
    }
}