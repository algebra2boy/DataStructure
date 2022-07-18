import java.util.*;
public class Point_Client
{
    public static void main()
    {
        Point[] p = new Point[8];
        p[0] = new Point(3,1);
        p[1] = new Point(-1,34);
        p[2] = new Point(55,9);
        p[3] = new Point(6,8);
        p[4] = new Point(4,-100);
        p[5] = new Point(-6,-23);
        p[6] = new Point(-90,-3);
        p[7]= new Point(-74,32);
        for(Point po : p)
        {
            System.out.print(po+" ");
        }
        System.out.println();
        Arrays.sort(p);
        for(Point po : p)
        {
            System.out.print(po+" ");
        } 
        System.out.println();
    }
}
