package martin.aiyani.StringProjectsThursday;

/**
 * Created by yanimartin on 2/11/16.
 */
public class RemoveVowels {

    public String vanishingVowels(String inputString){

        String lowerCase = inputString.toLowerCase();

        String noMoreVowels = lowerCase.replaceAll("[aeiou]", "*");

        return noMoreVowels;
    }
}
