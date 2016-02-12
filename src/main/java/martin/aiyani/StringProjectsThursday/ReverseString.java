package martin.aiyani.StringProjectsThursday;


/**
 * Created by yanimartin on 2/11/16.
 */
public class ReverseString {
    StringBuilder finalReversal = new StringBuilder();

    public String stringReversal(String inputString){

        finalReversal.append(inputString);
        finalReversal=finalReversal.reverse();

        return finalReversal.toString();
    }
}
