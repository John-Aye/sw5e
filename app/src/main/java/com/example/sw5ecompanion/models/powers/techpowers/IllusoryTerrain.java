import com.example.sw5ecompanion.models.powers.Power;

public class IllusoryTerrain extends Power
{
    public IllusoryTerrain () {
        super();
        this.setLvl(4);
        this.setName("Illusory Terrain");
        this.setType("4th-level tech power");
        this.setDescription("You make natural terrain in a 150-foot cube in range look, sound, and smell like some other sort of natural terrain. Manufactured structures, equipment, and creatures within the area aren't changed in appearance. The tactile characteristics of the terrain are unchanged, so creatures entering the area are likely to see through the illusion. If the dierence isn't obvious by touch, a creature carefully examining the illusion can attempt an Intelligence (Investigation) check against your tech save DC to disbelieve it. A creature who discerns the illusion for what it is, sees it as a vague image superimposed on the terrain.");
        this.setPrerequiste("");
        this.setCastingTime("10 minutes")
        this.setRange("300 feet");
        this.setDuration("24 hours");
    }
}