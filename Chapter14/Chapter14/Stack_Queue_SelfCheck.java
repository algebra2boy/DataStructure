
import java.util.*;
public class Stack_Queue_SelfCheck
{
    public static void main()
    {
        self8();
        self9();
        self10();
    }
    public static void self8()
    {
        Stack s = new Stack<String>();
        s.push("hello");
        s.push("hi");
        s.push("goodbye");
        s.push("Howdy");
        System.out.println(s);
    }
    public static void self9()
    {
        Stack s = new Stack<Integer>();
        for(int i = 100; i>=0;i-=2)
        {
            s.push(i);
        }
        System.out.println(s);
    }
    public static void self10()
    {
        Queue q = new LinkedList<String>();
        q.add("alpha");
        q.add("beta");
        q.add("gamma");
        q.add("delta");
        System.out.println(q);
    }
}
