import java.util.*;
import java.util.Iterator;
public class Client2
{
    public static void main()
    {
        
        int[] data = {1,2,3,4,5,6,7};
        ArrayIntList list = new ArrayIntList();
        for(int n:data)
        {
            list.add(n);
        }
        System.out.println(list);
        
        ArrayIntListIterator i = list.iterator();
        int product = 1;
        while(i.hasNext())
        {
            int n = i.next();
            if(n==0)
            {
                i.remove();
            }else
            {
                product*=n;
            }            
        }
        
        System.out.println("product = "+ product);
    }
}
