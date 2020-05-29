import com.example.sw5ecompanion.models.powers.Power;

public class MasterRevitalize extends Power
{
    public MasterRevitalize() {
        super();
        this.setLvl(9);
        this.setName("Master Revitalize");
        this.setType("9th-level light side power");
        this.setDescription("You return a dead creature you touch to life, provided that it has been dead no longer than 1 day. If the creature's soul is both willing and at liberty to rejoin the body, the creature returns to life with all its hit points. This power closes all wounds, neutralizes any poison, cures all diseases, and lifts any curses aecting the creature when it died. The power replaces damaged or missing organs and limbs.");
        this.setPrerequiste("Improved Revitalize");
        this.setCastingTime("1 hour");
        this.setRange("Touch");
        this.setDuration("Instantaneous");
    }
}