import com.example.sw5ecompanion.models.powers.Power;

public class ForceDisarm extends Power
{
    public ForceDisarm() {
        super();
        this.setLvl(0);
        this.setName("Force Disarm");
        this.setType("At-will universal power");
        this.setDescription("You select a weapon or object being worn or carried by a Large or smaller creature within range. The creature must make a Strength or Dexterity saving throw (the creature chooses the ability to use). If the item is being worn, this save is made with disadvantage. On a failed save, the creature takes 1d4 force damage and the item is pulled directly to you. If you have a free hand, you catch the weapon. Otherwise, it lands at your feet. This power's damage increases by 1d4 when you reach 5th level (2d4), 11th level (3d4), and 17th level (4d4).");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("30 feet");
        this.setDuration("Instantaneous");
    }
}