import com.example.sw5ecompanion.models.powers.Power;

public class Eruption extends Power
{
    public Eruption() {
        super();
        this.setLvl(6);
        this.setName("Eruption");
        this.setType("6th-level universal power");
        this.setDescription("You cause up to six pillars of stone to burst from places on the ground that you can see within range. Each pillar is a cylinder that has a diameter of 5 feet and a height of up to 30 feet. The ground where a pillar appears must be wide enough for its diameter, and you can target the ground under a creature if that creature is Medium or smaller. Each pillar has AC 5 and 30 hit points. When reduced to 0 hit points, a pillar crumbles into rubble, which creates an area of dicult terrain with a 10 - foot radius that lasts until the rubble is cleared. Each 5-foot-diameter portion of the area requires at least 1 minute to clear by hand. If a pillar is created under a creature, that creature must succeed on a Dexterity saving throw or be lifted by the pillar. A creature can choose to fail the save. If a pillar is prevented from reaching its full height because of a ceiling or other obstacle, a creature on the pillar takes 6d6 kinetic damage and is restrained, pinched between the pillar and the obstacle. The restrained creature can use an action to make a Strength or Dexterity check (the creature's choice) against the power's save DC. On a success, the creature is no longer restrained and must either move o the pillar or fall o it. F o r c e P o t e n c y . When you cast this power using a force slot of 7th level or higher, you can create two additional pillars for each slot level above 6th.");
        this.setPrerequiste("Convulsion");
        this.setCastingTime("1 action");
        this.setRange("120 feet");
        this.setDuration("Instantaneous");
    }
}