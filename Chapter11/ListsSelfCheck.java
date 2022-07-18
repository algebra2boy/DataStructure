import java.util.*;
public class ListsSelfCheck
{
    public static void main()
    {
        Integer[] array4 = {1,1,3,5,5,5,5,7,7};
        List<Integer> list4 = new LinkedList<Integer>(Arrays.asList(array4));
        System.out.println(list4);
        System.out.println("Duplicates:"+selfcheck4(list4)+"\n");

        String[] array5 = {"Alpha","Baker","Foxtrot","Tongo","Whiskey"};
        List<String> list5 = new LinkedList<String>(Arrays.asList(array5));
        System.out.println(list5);
        selfcheck5(list5,"Charlie");
        System.out.println(list5+"\n");

        Integer[] array6 = {3,9,4,2,3,8,17,4,3,18,3};
        List<Integer> list6 = new LinkedList<Integer>(Arrays.asList(array6));
        System.out.println(list6);
        selfcheck6(list6,3);
        System.out.println(list6);
        
        Integer[] array7 = {1,2,3,4,5,6,5,6,7,8,9};
        List<Integer> list7 = new LinkedList<Integer>(Arrays.asList(array7));
        System.out.println(list7);
        selfcheck7(list7);
        System.out.println(list7);
    }

    public static int selfcheck4(List<Integer> list)
    {
        int count = 0;
        Iterator<Integer> itr = list.iterator();
        int prev = itr.next();
        while(itr.hasNext())
        {
            int curr  = itr.next();
            if(curr==prev)
            {
                count ++;
            }
            prev = curr;
        }
        return count;
    }

    public static void selfcheck5(List<String> list, String word)
    {
        Iterator<String> itr = list.iterator();
        int index = 0;
        String curr  = itr.next();
        while(itr.hasNext() && curr.compareTo(word)<0) // if it met a word that is higher alphabetical level, then stops
        {
            curr  = itr.next();
            index ++;
        }
        list.add(index,word);
    }

    public static void selfcheck6(List<Integer> list, int value)
    {
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            int num = itr.next();
            if(num==value)
            {
                itr.remove();
            }
        }
    }
    public static void selfcheck7(List<Integer> list)
    {
        Iterator<Integer> itr = list.iterator();
        List<Integer> Front = new LinkedList<Integer>();
        for(int i = 0; i <=list.size()/2;i++)
        {
            int num = itr.next();
            Front.add(num);
            itr.remove();
        }
        list.addAll(Front);
    }
}
