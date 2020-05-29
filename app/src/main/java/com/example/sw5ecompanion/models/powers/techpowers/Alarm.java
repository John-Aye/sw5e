import com.example.sw5ecompanion.models.powers.Power;

public class Alarm extends Power
{
    public Alarm () {
        super();
        this.setLvl(1);
        this.setName("Alarm");
        this.setType("1st-level tech power");
        this.setDescription("You set an alarm against unwanted intrusion. Choose a door, a window, or an area within range that is no larger than a 20-foot cube. Until the power ends, an alarm alerts you whenever a Tiny or larger creature touches or enters the warded area. When you cast the power, you can designate creatures that won't set o the alarm. You also choose whether the alarm is mental or audible. A silent alarm alerts you with a ping in your mind if you are within 1 mile of the warded area. This ping awakens you if you are sleeping. An audible alarm produces the sound of a hand bell for 10 seconds within 60 feet.");
        this.setPrerequiste("");
        this.setCastingTime("1 minute");
        this.setRange("30 feet");
        this.setDuration("8 hours");
    }
}