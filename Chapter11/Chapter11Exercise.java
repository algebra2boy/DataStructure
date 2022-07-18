import java.util.*;
import java.io.*;
public class Chapter11Exercise
{
    public static void main()
    {
        Integer[] array1 = {1,2,3,4,5};
        Integer[] array2 = {6,7,8,9,10,11,12};
        List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(array1));
        List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(array2));
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        List<Integer> alternate = alternate(list1,list2);
        System.out.println("after alternate(list1,list2):"+alternate+"\n");

        Integer[] array3 = {1,2,3,4,2,4};
        List<Integer> list3= new LinkedList<Integer>(Arrays.asList(array3));
        System.out.println("list3"+list3);
        removeInRange(list3,2,1,5);
        System.out.println("removeInRange(list3,2,1,5):"+list3+"\n");

        Integer[] array4 = {15,1,6,12,-3,4,8,21,2};
        List<Integer> list4 = new LinkedList<Integer>(Arrays.asList(array4));
        System.out.println("list4"+list4);
        partition(list4,5);
        System.out.println("partition(list4,5):"+list4+"\n");

        Integer[] array5 = {-20,-12,100,-4,-20,86,12,-12};
        List<Integer> list5= new LinkedList<Integer>(Arrays.asList(array5));
        System.out.println("list5"+list5);
        sortAndRemoveDuplicates(list5);
        System.out.println("sortAndRemoveDuplicates(list5):"+list5);
        System.out.println("countUnique(list5):"+countUnique(list5)+"\n");

        List<Integer> list7 = new LinkedList<Integer>();
        list7.add(-4);
        list7.add(-20);
        list7.add(2);
        System.out.println("list7:"+list7);
        System.out.println("countCommon(list5,list7):"+countCommon(list5,list7)+"\n");

        Set<String> set8 = new HashSet<String>();
        set8.add("APPLE");
        set8.add("PIE");
        System.out.println("maxLength:"+maxLength(set8)+"\n");

        Set<Integer> set9 = new HashSet<Integer>();
        set9.add(2);
        set9.add(4);
        System.out.println("hasOdd(set9):"+hasOdd(set9)+"\n");

        Set<String> set10 = new HashSet<String>();
        set10.add("APPLE");
        set10.add("PIEA");
        System.out.println("set10:"+set10);
        removeEvenLength(set10);
        System.out.println("removeEvenLength(set10):"+set10+"\n");

        Set<Integer> set11 = new HashSet<Integer>();
        Set<Integer> set12 = new HashSet<Integer>();
        Set<Integer> set13 = new HashSet<Integer>();
        set11.add(1);
        set11.add(4);
        set11.add(7);
        set11.add(9);
        set12.add(2);
        set12.add(4);
        set12.add(5);
        set12.add(6);
        set12.add(7);
        System.out.println("set11:"+set11);
        System.out.println("set12:"+set12);
        set13 = symmetricDifference(set11,set12);
        System.out.println("symmetricDifference(set11,set12):"+set13);
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> list3 = new ArrayList<Integer>();    
        
        Iterator<Integer> itr1 = list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();

        while(itr1.hasNext()||itr2.hasNext()){
            if(itr1.hasNext()){
                list3.add(itr1.next());}
            if(itr2.hasNext()){
                list3.add(itr2.next()); }
        }
        return list3;
    }

    public static void removeInRange(List<Integer> list, int value, int start, int end)
    {
        Iterator<Integer> itr = list.iterator();
        int index = 0;
        while(itr.hasNext())
        {
            int number = itr.next();
            if(index>=start && index<end && number==value)
            {
                itr.remove();
            }
            index++;
        }
    }  

    public static void sortAndRemoveDuplicates(List<Integer> list)
    {
        Set<Integer> set = new TreeSet<Integer>(list);  
        list.clear();
        list.addAll(set);    
    }

    public static int countUnique(List<Integer>list)  
    {
        if(list.isEmpty())
        {
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>(list);  
        return set.size();
    }

    public static int countCommon(List<Integer>list1, List<Integer> list2)
    {
        Set<Integer> set1 = new TreeSet<Integer>(list1);
        Set<Integer> set2 = new TreeSet<Integer>(list2);
        set1.retainAll(set2);
        return set1.size();
    }

    public static int maxLength(Set<String> set)
    {
        Iterator<String> itr = set.iterator();
        int longest = 0;
        while(itr.hasNext())
        {
            longest = Math.max(longest,itr.next().length());
        }
        return longest;
    }

    public static void partition(List<Integer>list, int value)
    {
        List<Integer> less = new ArrayList<Integer>();
        List<Integer> more = new ArrayList<Integer>();

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            int number = itr.next();
            if(number>value)
            {
                more.add(number);
            }else
            {
                less.add(number);
            }
        }
        list.clear();
        list.addAll(less);
        list.addAll(more);
    }

    public static boolean hasOdd(Set<Integer> set)
    {
        if(set.isEmpty())
        {
            return false;
        }
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
            if(itr.next()%2!=0)
            {
                return true;
            }
        }
        return false;
    }

    public static void removeEvenLength(Set<String> set)
    {
        Iterator<String> itr = set.iterator();
        while(itr.hasNext())
        {
            if(itr.next().length()%2==0)
            {
                itr.remove();
            }
        }
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> union = new HashSet<Integer>(set1);
        Set<Integer> common = new HashSet<Integer>(set1);
        union.addAll(set2);
        common.retainAll(set2);
        union.removeAll(common);
        return union;
    }
}

