import com.example.sw5ecompanion.models.powers.Power;

public class ForceEnlightenment extends Power
{
    public ForceEnlightenment() {
        super();
        this.setLvl(2);
        this.setName("Force Enlightenment");
        this.setType("2nd-level light side power");
        this.setDescription("You touch a creature and enhance it with the Force. Choose one of the following eects; the target gains that eect until the power ends. E n d u r a n c e . The target has advantage on Constitution checks. It also gains 2d6 temporary hit points, which are lost when the power ends. S t r e n g t h . The target has advantage on Strength checks, and his or her carrying capacity doubles. D e x t e r i t y . The target has advantage on Dexterity checks. It also doesn't take damage from falling 20 feet or less if it isn't incapacitated. S p l e n d o r . The target has advantage on Charisma checks. C u n n i n g . The target has advantage on Intelligence checks. W i s d o m . The target has advantage on Wisdom checks. F o r c e P o t e n c y . When you cast this power using a force slot of 3rd level or higher, you can target one additional creature for each slot level above 2nd.");
        this.setPrerequiste("Guidance");
        this.setCastingTime("1 action");
        this.setRange("Touch");
        this.setDuration("Concentration, up to 1 hour");
    }
}