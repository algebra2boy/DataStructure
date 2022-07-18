import java.util.*;
import java.io.*;

public class Vocabulary {
    public static void main(String[] args)

    throws FileNotFoundException { 
        Scanner console = new Scanner(System.in); 

        System.out.print("file #1 name? ");
        Scanner in1 = new Scanner(new File(console.nextLine())); 
        System.out.print("file #2 name? ");
        Scanner in2 = new Scanner(new File(console.nextLine())); 
        System.out.println();
        Set<String> list1 = getWords(in1); 
        Set<String> list2 = getWords(in2);
        Set<String> common = getOverlap(list1,list2);
        //reportResults(list1, list2, common);

    }
    // post: reads words from the Scanner, converts them to
    //       lowercase, returns a sorted list of unique words
    public static Set<String> getWords(Scanner input) {
        // ignore all but alphabetic characters and apostrophes
        input.useDelimiter("[∧a-zA-Z']+");
        // read all words and sort
        Set<String> words = new TreeSet<String>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            words.add(next);
        }
        return words;
    }
    public static Set<String> getOverlap(Set<String> s1, Set<String> s2){
        Set<String> common = new TreeSet<String>(s1);
        common.retainAll(s2);
        return common;
    }
}

