import com.example.sw5ecompanion.models.powers.Power;

public class GreaterHologram extends Power
{
    public GreaterHologram () {
        super();
        this.setLvl(3);
        this.setName("Greater Hologram");
        this.setType("3rd-level tech power");
        this.setDescription("You create an image no larger than a 20 foot cube. It appears at a spot you can see and lasts for the duration. It seems completely real, sounds and other sensory eects included. You can't create a sensory eect strong enough to cause damage or a condition. As long as you are within range of the illusion, you can use your action to make the image to move to any other spot within range. As the image changes location, you can alter it so that its movements appear natural for the image. Physical interaction with the image reveals it as an illusion. A creature can use its action to determine that it's an illusion with a successful Investigation check. If a creature learns it's an illusion, it can see through the image, and the other sensory qualities become faint to it. O v e r c h a r g e T e c h . The power lasts until dispelled without requiring concentration if cast at 6th-level or higher.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 10 minutes");
    }
}