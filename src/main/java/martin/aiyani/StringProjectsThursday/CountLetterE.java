package martin.aiyani.StringProjectsThursday;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by yanimartin on 2/11/16.
 */
public class CountLetterE {

    public int eCounter(String inputString){

    int countE = StringUtils.countMatches(inputString, "e");

        return countE;
    }
}
