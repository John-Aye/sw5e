import com.example.sw5ecompanion.models.powers.Power;

public class ForcePushPull extends Power
{
    public ForcePushPull() {
        super();
        this.setLvl(0);
        this.setName("Force Push/Pull");
        this.setType("At-will universal power");
        this.setDescription("You gain the minor ability to move or manipulate creatures and objects with the Force. You can exert ne control on objects with your telekinetic grip, such as manipulating a simple tool, opening a door or a container, stowing or retrieving an item from an open container, or pouring the contents from a vial. Alternatively, you can push or pull a creature or object you can see. You use the Force to move a Medium or smaller creature or object not being worn or carried within range. The target must make a Strength saving throw. An object automatically fails this saving throw. On a failed save, the creature or object moves a number of feet in a direction of your choice based on its size. A Tiny creature or object can be moved up to 20 feet, a Small creature or object can be moved up to 10 feet, and a Medium creature or object can be moved up to 5 feet. If at the end of this movement the creature or object strikes another creature or object, they both take 1d4 kinetic damage. This power improves when you reach higher levels. At 5th level, you can move a Tiny creature or object up to 30 feet, a Small creature or object up to 20 feet, a Medium creature or object up to 10 feet, and the power's damage increases to 2d4 kinetic damage. At 11th level, you can move a Small creature or object up to 30 feet, a Medium creature up to 20 feet, and the power's damage increases to 3d4 kinetic damage. At 17th level, you can move a Medium creature to up 30 feet, and the power's damage increases to 4d4 kinetic damage.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("60 feet");
        this.setDuration("Instantaneous");
    }
}