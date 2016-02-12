package martin.aiyani.StringProjectsThursday;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yanimartin on 2/11/16.
 */
public class RemoveVowelsTest {
    RemoveVowels removeVowels = new RemoveVowels();

    @Test
    public void vanishingVowelsTest(){
        String inputString = "I never saw a purple cow";
        String expected = "* n*v*r s*w * p*rpl* c*w";
        String actual = removeVowels.vanishingVowels(inputString);
        assertEquals("This will pass if vowels change to *", expected,actual);
        System.out.println(expected + "\n" + actual);

    }
}
