import com.example.sw5ecompanion.models.powers.Power;

public class GreaterFeedback extends Power
{
    public GreaterFeedback() {
        super();
        this.setLvl(5);
        this.setName("Greater Feedback");
        this.setType("5th-level dark side power");
        this.setDescription("You choose a point within range and cause psychic energy to explode there. Each creature in a 20-footradius sphere centered on that point must make an Intelligence saving throw. A creature with an Intelligence score of 2 or lower can't be aected by this power. A target takes 8d6 psychic damage on a failed save, or half as much damage on a successful one. After a failed save, a target has muddled thoughts for 1 minute. During that time, it rolls a d6 and subtracts the number rolled from all its attack rolls and ability checks, as well as its Constitution saving throws to maintain concentration. The target can make a Wisdom saving throw at the end of each of its turns, ending the eect on itself on a success.");
        this.setPrerequiste("Improved Feedback");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}