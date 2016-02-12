package martin.aiyani.StringProjectsThursday;

import martin.aiyani.StringProjectsThursday.CountWords;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yanimartin on 2/11/16.
 */
public class CountWordsTest {
CountWords countWords = new CountWords();

    @Test
    public void countWordsTest(){
        String testString = "I never saw a purple cow";
        int expected = 6;
        int actual = countWords.wordCount(testString);
        assertEquals("This will pass if number of words is returned",expected,actual);
        System.out.println(testString + " \n" + actual);
    }

}
