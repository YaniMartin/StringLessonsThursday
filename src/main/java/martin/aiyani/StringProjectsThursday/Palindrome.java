package martin.aiyani.StringProjectsThursday;


/**
 * Created by yanimartin on 2/11/16.
 */
public class Palindrome {
    Boolean stringIsPalindrome = true;
    Boolean stringNotPalindrome = false;

    public Boolean isPalindrome(String inputString){

        return inputString.equals(new StringBuilder(inputString).reverse().toString());

    }
}

