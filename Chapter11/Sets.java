import java.util.*;
public class Sets
{
    public static void main()
    {
        Set<Integer> set = new HashSet<Integer>();
        set.add(74);
        set.add(12);
        set.add(74);
        set.add(74);
        set.add(43);
        set.add(100);
        set.add(100);
        set.add(102);
        set.add(103);
        set.add(6);
        set.add(2);
        set.remove(1000);
        System.out.println(set);
        String word = "snake";
        System.out.println(word.compareTo("apple"));
    }
}
