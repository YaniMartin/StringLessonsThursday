package martin.aiyani.StringProjectsThursday;

import martin.aiyani.StringProjectsThursday.CountLetterE;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yanimartin on 2/11/16.
 */
public class CountLetterETest {
    CountLetterE countLetterE = new CountLetterE();

    @Test
    public void eCounterTest(){
        String inputString = "I never saw a purple cow.";
        int expected = 3;
        int actual = countLetterE.eCounter(inputString);
        assertEquals("This will print the amount of letter e in input",expected,actual);
        System.out.println(expected + "\n" + actual);

    }
}
