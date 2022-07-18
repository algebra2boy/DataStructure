import java.util.*;
import java.io.*;
public class WordCount
{
    public static final int OCCUR = 500;
    public static void main(String[] args) throws FileNotFoundException{

        System.out.println("tracking word count");

        Scanner input = new Scanner(new File("read.txt"));
        Map<Integer, String> revese = getMap(input);
        for(int count : revese.keySet())
        {
            System.out.println("\""+revese.get(count)+"\"occurs for " + count +" times");
        }
    }

    public static Map<Integer,String> getMap(Scanner input)
    {
        Map<String,Integer> m = new TreeMap<String,Integer>();
        Map<Integer,String> reverseMap = new TreeMap<Integer,String>();
        while(input.hasNext())
        {
            String word = input.next();
            if(!m.containsKey(word))
            
                m.put(word,1);
            else
            
                m.put(word,m.get(word)+1);            
        }
        for(String word : m.keySet())
        {
            reverseMap.put(m.get(word),word);
        }
        return reverseMap;
    }
}
