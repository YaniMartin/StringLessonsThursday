package martin.aiyani.StringProjectsThursday;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yanimartin on 2/11/16.
 */
public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    public void palindromeTest1(){
        String inputString = "I never saw a purple cow";
        Boolean expected;
        Boolean actual = palindrome.isPalindrome(inputString);
        assertFalse("This will be false if not a palindrome", expected=actual);
        System.out.println(expected + "\n" + actual);
    }

    @Test
    public void palindromeTest2(){
        String inputString = "rotavator";
        Boolean expected;
        Boolean actual = palindrome.isPalindrome(inputString);
        assertTrue("This will be true if a palindrome", expected=actual);
        System.out.println(expected + "\n" + actual);
    }
}
