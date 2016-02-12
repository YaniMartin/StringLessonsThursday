package martin.aiyani.StringProjectsThursday;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yanimartin on 2/11/16.
 */
public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    public void stringReversalTest(){
        String inputString = "I never saw a purple cow";
        String expected = "woc elprup a was reven I";
        String actual = reverseString.stringReversal(inputString);
        assertEquals("This will reverse a string",expected,actual);
        System.out.println(expected + "\n" + actual);
    }

}
