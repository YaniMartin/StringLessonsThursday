package martin.aiyani.StringProjectsThursday;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yanimartin on 2/11/16.
 */
public class PalindromeMack2Test {
    PalindromeMack2 palindromeMack2 = new PalindromeMack2();

    @Test
    public void palindromeTest1(){
        String inputString = "I never saw a purple cow";
        Boolean expected;
        Boolean actual = palindromeMack2.isPalindromeNoSpace(inputString);
        assertFalse("This will be false if string is not palindrome",expected=actual);
        System.out.println(expected + "\n" + actual);
    }

    @Test
    public void palindromeTest2(){
        String inputString = "Rise to vote, Sir!";
        Boolean expected;
        Boolean actual = palindromeMack2.isPalindromeNoSpace(inputString);
        assertTrue("This will be true if string is palindrome", expected=actual);
        System.out.println(expected + "\n" + actual);
    }

}
