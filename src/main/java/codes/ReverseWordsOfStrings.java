package codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsOfStrings {
    
    
    public static void main(String args[]) {
        String input="I Love Java Programming";
        List<String> splittedListOfString=Arrays.asList(input.split(" "));
        Collections.reverse(splittedListOfString);
        splittedListOfString.forEach(value->System.out.print(value+" "));
    }

}
