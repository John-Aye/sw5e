import com.example.sw5ecompanion.models.powers.Power;

public class ImprovedDarkSideTendrils extends Power
{
    public ImprovedDarkSideTendrils() {
        super();
        this.setLvl(3);
        this.setName("Improved Dark Side Tendrils");
        this.setType("3rd-level dark side power");
        this.setDescription("You summon a 20-foot-radius sphere of inky blackness at a point within range. No light, enhanced or otherwise, can illuminate the area, creatures fully within the area are blinded, and the area is dicult terrain. Any creature that starts its turn in the area takes 2d6 necrotic damage. Any creature that ends its turn in the area must succeed on a Strength saving throw or take 2d6 poison damage as tendrils of dark energy caress it.");
        this.setPrerequiste("Dark Side Tendrils");
        this.setCastingTime("1 action");
        this.setRange("150 feet");
        this.setDuration("Concentration, up to 1 minute");
    }
}