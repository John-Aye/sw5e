import com.example.sw5ecompanion.models.powers.Power;

public class Cage extends Power
{
    public Cage () {
        super();
        this.setLvl(7);
        this.setName("Cage");
        this.setType("7th-level tech power");
        this.setDescription("An immobile, Invisible, cube-shaped prison composed of energy springs into existence around an area you choose within range. The prison can be a cage or a solid box as you choose. A prison in the shape of a cage can be up to 20 feet on a side and is made from 1/2-inch diameter bars spaced 1/2 inch apart. A prison in the shape of a box can be up to 10 feet on a side, creating a solid barrier that prevents any matter from passing through it and blocking any powers cast into or out of the area. When you cast the power, any creature that is completely inside the cage's area is trapped. Creatures only partially within the area, or those too large to t inside the area, are pushed away from the center of the area until they are completely outside the area. A creature inside the cage can't leave it by unenhanced means. If the creature tries to teleport to leave the cage, it must rst make a Charisma saving throw. On a success, the creature can use that power to exit the cage. On a failure, the creature can't exit the cage and wastes the use of the power or eect. This power can't be dispelled.");
        this.setPrerequiste("");
        this.setCastingTime("1 action");
        this.setRange("100 feet");
        this.setDuration("1 hour");
    }
}