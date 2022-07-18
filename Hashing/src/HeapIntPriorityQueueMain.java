import java.util.Arrays;

public class HeapIntPriorityQueueMain
{
    public static void main(String[] args)
    {
        HeapIntPriorityQueue pq = new HeapIntPriorityQueue();
        pq.add(42);
        pq.add(50);
        pq.add(45);
        pq.add(78);
        pq.add(61);
        int[] array = pq.toArray();
        System.out.println("Printing An Array:\n" + Arrays.toString(array));
        System.out.println("pq.toString():\n" + pq +"\n");

        HeapIntPriorityQueue pq1 = new HeapIntPriorityQueue();
        pq1.add(90);
        pq1.add(7);

        System.out.println("pq before merge:" + pq);
        System.out.println("pq1 before merge:" + pq1);
        pq.merge(pq1);
        System.out.println("pq.merge(pq1):");
        System.out.println("pq after merge:" + pq);
        System.out.println("pq1 after merge:" + pq1);

    }
}
