package martin.aiyani.StringProjectsThursday;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by yanimartin on 2/11/16.
 */
public class SpellOutTest {

    SpellOut spellOut = new SpellOut();

    @Test
    public void spellOutTest(){
        String inputString = "never saw a purple cow";
        String expected = "I N-E-V-E-R S-A-W A P-U-R-P-L-E C-O-W";
        String actual = spellOut.spellingOutStrings(inputString);
        assertEquals("This will be true is words are capital letters and dashed", expected,actual);
    }
}
