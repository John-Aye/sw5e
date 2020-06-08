import com.example.sw5ecompanion.models.powers.Power;

public class DarkShear extends Power
{
    public DarkShear() {
        super();
        this.setLvl(2);
        this.setName("Dark Shear");
        this.setType("2nd-level dark side power");
        this.setDescription("You create a weapon of imperceptible Force energy that lasts until the power ends. It counts as a simple lightweapon with which you are procient. It deals 2d6 psychic damage, and has the nesse, light, and thrown properties (range 20/60). When you attack while within dim light or darkness, you have advantage. If you drop the weapon or throw it, it disappears at the end of the turn. While the power lasts, you can use a bonus action to make the weapon reappear in your hand. F o r c e P o t e n c y . When you cast this power using a 3rd or 4th level force slot, the damage increases by 1d6 (3d6). At 5th or 6th level, the damage increases by 2d6 (4d6). At 7th level or higher, the damage increases by 3d6 (5d6).");
        this.setPrerequiste("");
        this.setCastingTime("1 bonus action");
        this.setRange("self");
        this.setDuration("Concentration, up to 1 minute");
    }
}