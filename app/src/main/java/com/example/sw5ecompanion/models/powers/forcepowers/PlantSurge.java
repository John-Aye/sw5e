import com.example.sw5ecompanion.models.powers.Power;

public class PlantSurge extends Power
{
    public PlantSurge() {
        super();
        this.setLvl(3);
        this.setName("Plant Surge");
        this.setType("3rd-level light side power");
        this.setDescription("If you cast this power using 1 action, all normal plants in a 100-foot radius centered on a point become overgrown. Moving through the area spends 4 feet of movement for every 1 foot moved. You can exclude areas of any size within the power's area from being aected. If you cast this power over 8 hours, all plants in a half-mile radius centered on a point yield twice the normal amount of food when harvested for 1 year.");
        this.setPrerequiste("");
        this.setCastingTime("1 action or 8 hours");
        this.setRange("150 feet");
        this.setDuration("Instantaneous");
    }
}