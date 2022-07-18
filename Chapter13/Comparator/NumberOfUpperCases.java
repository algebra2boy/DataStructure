import java.util.*;
public class NumberOfUpperCases implements Comparator<String>
{
    public int compare(String s1,String s2){
        int s1UpperCount=0, s2UpperCount=0;
        for(int i=0;i<s1.length();i++){if(Character.isUpperCase(s1.charAt(i))){s1UpperCount++;}}
        for(int i=0;i<s2.length();i++){if(Character.isUpperCase(s2.charAt(i))){s2UpperCount++;}}
        return s1UpperCount - s2UpperCount;
    }
}
