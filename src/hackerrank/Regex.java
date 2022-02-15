package hackerrank;
import java.util.regex.*;
public class Regex {
    public static void main(String arg[]){
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("SxxA");
        System.out.println(" String mathcer the given regex  " + matcher.matches());
        System.out.println(Pattern.matches("[xyz]","x"));

    }
}
