package martin.aiyani.StringProjectsThursday;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yanimartin on 2/11/16.
 */
public class AlphanumericTest {
    Alphanumeric alphanumeric = new Alphanumeric();

    @Test
    public void alphanumericTest(){
        String inputString = "1984 by George Orwell.";
        int expected = 18;
        int actual = alphanumeric.alphanumericCounter(inputString);
        assertEquals("This wil print the number of alphanumerics",expected,actual);
        System.out.println(expected + "\n" + actual);
    }
}
