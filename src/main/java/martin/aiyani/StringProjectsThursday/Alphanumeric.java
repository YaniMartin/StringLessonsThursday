package martin.aiyani.StringProjectsThursday;


/**
 * Created by yanimartin on 2/11/16.
 */
public class Alphanumeric {

    public int alphanumericCounter(String inputString){

        String noSpaceOrSpecial = inputString.replaceAll("[.,/?;!\\s]", "");
        int alphaCount = noSpaceOrSpecial.length();

        return alphaCount;
    }
}
