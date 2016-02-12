package martin.aiyani.StringProjectsThursday;

import org.junit.Test;

import java.util.Arrays;
import java.util.StringJoiner;

import static org.junit.Assert.*;
/**
 * Created by yanimartin on 2/11/16.
 */
public class SpellOut {
    StringJoiner joinStrings = new StringJoiner(" ");

    public String spellingOutStrings(String inputString) {

        String bigLetters = inputString.toUpperCase();
        String blankToDash = bigLetters.replaceAll("", "-");
        String[] brokenUpString = blankToDash.split(" ");
        //String storedDashesTrimmed;

        for (int i=0; i<brokenUpString.length; i++) {
            //String element = brokenUpString[i];
            String nextElement = brokenUpString[i];
            i++;
            String storedDashesTrimmed = nextElement.substring(1, nextElement.length() - 1);
            //i++;

            return storedDashesTrimmed;
        }
        return null;
    }
}

