package martin.aiyani.StringProjectsThursday;

/**
 * Created by yanimartin on 2/11/16.
 */
public class CountWords {

    public int wordCount(String inputToCount){

        if(inputToCount == null){
            return 0;
        }
        String inputOfWords = inputToCount.trim();
        int wordCount = inputOfWords.isEmpty() ? 0 : inputOfWords.split("\\s+").length;
        return wordCount;
    }
}
