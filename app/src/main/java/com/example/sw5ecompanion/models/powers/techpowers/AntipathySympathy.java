import com.example.sw5ecompanion.models.powers.Power;

public class AntipathySympathy extends Power
{
    public AntipathySympathy () {
        super();
        this.setLvl(8);
        this.setName("Antipathy/Sympathy");
        this.setType("8th-level tech power");
        this.setDescription("This power attracts or repels creatures of your choice. You target something within range, either a Huge or smaller object or creature or an area that is no larger than a 200-foot cube. Then specify a kind of intelligent creature, such as rancors, kath hounds, or twi'leks. You invest the target with an aura that either attracts or repels the specied creatures for the duration. Choose antipathy or sympathy as the aura's eect. A n t i p a t h y . The power causes creatures of the kind you designated to feel an intense urge to leave the area and avoid the target. When such a creature can see the target or comes within 60 feet of it, the creature must succeed on a Wisdom saving throw or become frightened. The creature remains frightened while it can see the target or is within 60 feet of it. While frightened by the target, the creature must use its movement to move to the nearest safe spot from which it can't see the target. If the creature moves more than 60 feet from the target and can't see it, the creature is no longer frightened, but the creature becomes frightened again if it regains sight of the target or moves within 60 feet of it. S y m p a t h y . The power causes the specied creatures to feel an intense urge to approach the target while within 60 feet of it or able to see it. When such a creature can see the target or comes within 60 feet of it, the creature must succeed on a Wisdom saving throw or use its movement on each of its turns to enter the area or move within reach of the target. When the creature has done so, it can't willingly move away from the target. If the target damages or otherwise harms an aected creature, the aected creature can make a Wisdom saving throw to end the eect, as described below. E n d i n g t h e E f f e c t . If an aected creature ends its turn while not within 60 feet of the target or able to see it, the creature makes a Wisdom saving throw. On a successful save, the creature is no longer aected by the target and recognizes the feeling of repugnance or attraction as unnatural. In addition, a creature aected by the power is allowed another Wisdom saving throw every 24 hours while the power persists. A creature that successfully saves against this eect is immune to it for 1 minute, after which time it can be aected again.");
        this.setPrerequiste("");
        this.setCastingTime("1 hour");
        this.setRange("60 feet");
        this.setDuration("10 days");
    }
}