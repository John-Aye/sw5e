import com.example.sw5ecompanion.models.powers.Power;

public class TranslationProgram extends Power
{
    public TranslationProgram () {
        super();
        this.setLvl(1);
        this.setName("Translation Program");
        this.setType("1st-level tech power");
        this.setDescription("For the duration, you understand the literal meaning of any spoken registered language that you hear, as long as you have your tech focus. You also understand any written language that you see, but you must be within reach of the surface on which the words are written. It takes about 1 minute to read one page of text. This power doesn't decode secret messages in a text, nor does it interpret a glyph, such as an ancient Sith rune, that isn't part of a written language.");
        this.setPrerequiste("");
        this.setCastingTime("1 action")
        this.setRange("Self");
        this.setDuration("1 hour");
    }
}