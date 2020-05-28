import com.example.sw5ecompanion.models.powers.Power;

public class Earthquake extends Power
{
    public Earthquake() {
        super();
        this.setLvl(8);
        this.setName("Earthquake");
        this.setType("8th-level universal power");
        this.setDescription("You create a seismic disturbance at a point on the ground that you can see within range. For the duration, an intense tremor rips through the ground in a 100foot-radius circle centered on that point and shakes creatures and structures in contact with the ground in that area. The ground in the area becomes dicult terrain. Each creature on the ground that is concentrating must make a Constitution saving throw. On a failed save, the creature's concentration is broken. When you cast this power and at the end of each turn you spend concentrating on it, each creature on the ground in the area must make a Dexterity saving throw. On a failed save, the creature is knocked prone. This power can have additional eects depending on the terrain in the area, as determined by the GM. F i s s u r e s . Fissures open throughout the power's area at the start of your next turn after you cast the power. A total of 1d6 such ssures open in locations chosen by the GM. Each is 1d10 x 10 feet deep, 10 feet wide, and extends from one edge of the power's area to the opposite side. A creature standing on a spot where a ssure opens must succeed on a Dexterity saving throw or fall in. A creature that successfully saves moves with the ssure's edge as it opens. A ssure that opens beneath a structure causes it to automatically collapse (see below). S t r u c t u r e s . The tremor deals 50 kinetic damage to any structure in contact with the ground in the area when you cast the power and at the start of each of your turns until the power ends. If a structure drops to 0 hit points, it collapses and potentially damages nearby creatures. A creature within half the distance of a structure's height must make a Dexterity saving throw. On a failed save, the creature takes 5d6 kinetic damage, is knocked prone, and is buried in the rubble, requiring a DC 20 Strength (Athletics) check as an action to escape. The GM can adjust the DC higher or lower, depending on the nature of the rubble. On a successful save, the creature takes half as much damage and doesn't fall prone or become buried.");
        this.setPrerequiste("Eruption");
        this.setCastingTime("1 action");
        this.setRange("500 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}