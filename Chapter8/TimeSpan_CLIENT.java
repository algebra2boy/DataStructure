import java.util.*;
public class TimeSpan_CLIENT 

{
    public static void main()
    {
        TimeSpan t1, t2, t3, t4;

        t1 = new TimeSpan();
        System.out.println("t1 = " + t1.toString());
        System.out.println();

        t1.add(5,30);
        System.out.println("t1.add(5,30) = " + t1.toString());
        System.out.println();

        t2 = new TimeSpan(3,45);
        System.out.println("t2 = new TimeSpan(3,45) = " + t2);
        System.out.println();        

        t2.add(t1);
        System.out.println("t2.add(t1) = " + t2);
        System.out.println();  

        t2.subtract(t1);
        System.out.println("t2.subtract(t1) = " + t2);
        System.out.println();          

        t1.scale(3);
        System.out.println("t1.scale(3) = " + t1);
        System.out.println(); 

        ArrayList<TimeSpan> t = new ArrayList<TimeSpan>();
        t.add(new TimeSpan(7,20));    
        t.add(new TimeSpan(3,50));
        t.add( new TimeSpan(23,30));
        t.add(new TimeSpan(13,13));

        System.out.println("before sorting "+t);
        Collections.sort(t);
        System.out.println("after sorting "+t);

    }  // main

} // TimeSpan_CLIENT

/*
 * OUTPUT:
t1 = 0h 0m

t1.add(1,30) = 1h 30m

t2 = new TimeSpan(3,45) = 3h 45m

t2.add(t1) = 5h 15m

t2.subtract(t1) = 3h 45m

t1.scale(3) = 4h 30m

 */
