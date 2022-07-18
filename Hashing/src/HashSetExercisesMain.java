import java.util.*;

public class HashSetExercisesMain
{
    public static void main(String[] args){
        HashIntSet set1 = new HashIntSet(new int[]{-5, 1,2,3});
        HashIntSet set2 = new HashIntSet(new int[]{2,3,6,44,79});
        System.out.println("Exe1\n"+set1);
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1 + "\n");

        HashIntSet set3 = new HashIntSet(new int[]{-2,3,5,6,8});
        HashIntSet set4 = new HashIntSet(new int[]{3,6,8});
        System.out.println("exe2\n" + set3.containAll(set4)+"\n");

        HashIntSet set5 = new HashIntSet(new int[]{-2,3,5,6,8});
        HashIntSet set6 = new HashIntSet(new int[]{-2,3,5,6,8});
        System.out.println("set5.equals(set6):"+set5.equals(set6)+"\n");

        HashIntSet set7 = new HashIntSet(new int[]{-2,3,5,6,8});
        HashIntSet set8 = new HashIntSet(new int[]{2,3,6,8,11});
        System.out.println("exe4\n" + set7);
        System.out.println(set8);
        set7.removeAll(set8);
        System.out.println(set7 +"\n");

        HashIntSet set9 = new HashIntSet(new int[]{-2,3,5,6,8});
        HashIntSet set10 = new HashIntSet(new int[]{2,3,6,8,11});
        System.out.println("exe5\n" + set9);
        System.out.println(set10);
        set9.retailAll(set10);
        System.out.println(set9 +"\n");

        int[] exe8 = {42,9,22,17,-3,81};
        System.out.println(Arrays.toString(exe8));
        descending(exe8);
        System.out.println(Arrays.toString(exe8)+"\n");

        PriorityQueue<Integer> pq9 = new PriorityQueue<Integer>() ;
        int[] array = {42,50,45,78,61};
        for(int a: array){
            pq9.add(a);
        }
        System.out.println(pq9);
        int value = kthSmallest(pq9,4);
        System.out.println("value:" + kthSmallest(pq9,4)+"\n");

        PriorityQueue<Integer> pq10 = new PriorityQueue<Integer>() ;
        int[] array2 = {5,6,7,8,9};
        for(int a: array2){
            pq10.add(a);
        }
        System.out.println(pq10);
        System.out.println("isConsecutive(pq10):" +isConsecutive(pq10) +"\n");

        PriorityQueue<Integer> pq11 = new PriorityQueue<Integer>() ;
        int[] array3 = {7,7,8,8,10,10,45,45,45};
        for(int a: array3){
            pq11.add(a);
        }
        System.out.println(pq11);
        removeDuplicates(pq11);
        System.out.println("removeDuplicates(pq11): " + pq11 + "\n");

        PriorityQueue<Integer> pq12 = new PriorityQueue<Integer>();
        int[] array4 = {7,8,10,45};
        for(int a : array4)
        {
          pq12.add(a);
        }
        System.out.println(pq12);
        stutter(pq12);
        System.out.println("stutter(pq12)" + pq12);
    }

    public static void descending(int[] array)
    {
        Queue<Integer> pq = new PriorityQueue<Integer>();
        int index = 0;
        for(int i = 0;i<array.length;i++)
        {
            pq.add(array[i]);
        }
        while (!pq.isEmpty())
        {
            array[index] = pq.remove();
            index++;
        }
    }

    public static int kthSmallest(PriorityQueue<Integer> pq, int k)
    {
        if(k<=0 || k > pq.size()){ throw new IllegalArgumentException();}
        Stack<Integer> temp = new Stack<Integer>();
        int value;
        for(int i = 0; i < k ;i++)
        {
            temp.push(pq.remove());
        }
        value = temp.peek();

        while(!temp.isEmpty())
        {
            pq.add(temp.pop());
        }
        return value;
    }

    public static boolean isConsecutive(PriorityQueue<Integer> pq)
    {
        if(pq.isEmpty() || pq.size() ==1){throw new IllegalStateException();}
        Stack<Integer> s = new Stack<Integer>();
        boolean Consecutive = true;
        int prev = pq.remove();
        while(!pq.isEmpty() && Consecutive)
        {
            int curr = pq.remove();
            s.push(prev);
            if(prev + 1 != curr){ Consecutive = false; }
            prev = curr;
        }
        while(!s.empty()) { pq.add(s.pop());}
        return Consecutive;
    }
    // preCondition: passing a non-empty pq
    public static void removeDuplicates(PriorityQueue<Integer> pq)
    {
        Stack<Integer> s = new Stack<Integer>();
        int prev = pq.peek();
        while(!pq.isEmpty())
        {
            int curr = pq.remove();
            if(prev != curr){
               s.push(prev);
            }
            prev = curr;
        }
        pq.add(prev);
        while(!s.isEmpty()){
            pq.add(s.pop());
        }
    }

    public static <E> void stutter(PriorityQueue<E> pq)
    {
        final Queue<E> q = new LinkedList<>();
        while(!pq.isEmpty()){
            E value = pq.remove();
            q.add(value); q.add(value);
        }
        int size = q.size();
        for(int i = 0;i<size;i++)
        {
            pq.add(q.remove());
        }
    }
}
