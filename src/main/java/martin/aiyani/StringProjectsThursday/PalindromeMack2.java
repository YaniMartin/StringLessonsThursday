package martin.aiyani.StringProjectsThursday;

/**
 * Created by yanimartin on 2/11/16.
 */
public class PalindromeMack2 {
    Boolean result = false;

    public boolean isPalindromeNoSpace(String inputString){

        String lowerCaseString=inputString.toLowerCase();
        String slimString = lowerCaseString.replaceAll("[.,/?;!\\s]", "");

        if(slimString.equals(new StringBuilder(slimString).reverse().toString())){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
