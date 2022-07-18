import java.util.*;
import java.util.Iterator;
public class Client4
{
    public static void main()
    {
        Integer[] array1 = {1,2,3,4,5}; //{1,2,3,4,5};
        Integer[] array2 = {7,8,9,10};
        Integer[] array3 = {6,10,7,24};
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(int num : array1)
        {
            list1.add(num);
        }        
        for(int num : array2)
        {
            list2.add(num);
        }  
        for(int num : array3)
        {
            list3.add(num);
        } 
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
        System.out.println("list1.equals(list2):"+list1.equals(list2));
        list1.addAll(5,list2);
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println("list1.removeAll(list2)");
        list1.removeAll(list2);
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println("list1.lastIndexOf(5):"+list1.lastIndexOf(5));
        System.out.println("list1.remove(4):"+list1.remove(new Integer(4)));
        Object[] arr = list1.toArray();
        System.out.println("list1.toArray():"+Arrays.toString(arr));
        list2.add(3);
        list3.add(8);
        System.out.println("list2:"+list2);
        System.out.println("list3:"+list3);
        list2.retainAll(list3);
        System.out.println("list2.retainAll(list3):"+list2);
        

        //ArrayList<Integer> list4 = new ArrayList<Integer>();
        Iterator<Integer> itr = list3.listIterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        //System.out.println(itr.previous());
    }
}
