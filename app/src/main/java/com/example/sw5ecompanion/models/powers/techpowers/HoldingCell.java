import com.example.sw5ecompanion.models.powers.Power;

public class HoldingCell extends Power
{
    public HoldingCell () {
        super();
        this.setLvl(4);
        this.setName("Holding Cell");
        this.setType("4th-level tech power");
        this.setDescription("A sphere of shimmering energy springs into being and encloses a creature or object of Large size or smaller within range. An unwilling creature must make a Dexterity saving throw. On a failed save, the creature is enclosed for the duration. Nothing—not physical objects, energy, or other power eects—can pass through the barrier, in or out, though a creature in the sphere can breathe. The sphere is immune to all damage, and a creature or object inside can't be damaged by attacks or eects originating from outside, nor can a creature inside the sphere damage anything outside it. The sphere is weightless and just large enough to contain the creature or object inside. An enclosed creature can use its action to push against the sphere's walls and thus roll the sphere at up to half the creature's speed. Similarly, the globe can be picked up and moved by other creatures. A disintegrate power targeting the globe destroys it without harming anything inside it.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("120 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}