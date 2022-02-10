package code6;
//count the number of word in string and print the individal words in a line
public class Strings {
    public static void main(String arg[]){
        countWords(" I live in Rawalpindi");
    }
    public static void countWords( String text){
        var words  = text.split(""); /// here words willl be the arry of strings
        int numOfwords = words.length;
        String sentence = String.format(" your text consists of %d words", numOfwords);
        System.out.println(sentence);
        for ( int i=0; i<=numOfwords ; i++)
        {
            System.out.println(words[i]);
        }


    }

}
