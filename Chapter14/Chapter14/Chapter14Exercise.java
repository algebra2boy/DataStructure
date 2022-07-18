
import java.util.*;
public class Chapter14Exercise
{
    public static void main()
    {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(-1);
        s1.push(3);
        s1.push(-100);
        s1.push(25);
        s1.push(21);
        System.out.println("s1:"+s1);
        splitStack(s1);
        System.out.println("splitStack(s1):"+s1+"\n");
        
        
        Stack s2 = new Stack<Integer>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        System.out.println("s2:"+s2);
        stutter(s2);
        System.out.println("stutter(s2):"+s2+"\n");

        Stack s3 = new Stack<Integer>();
        s3.push(3);
        s3.push(4);
        s3.push(5);
        System.out.println("s3:"+s3);
        Stack s3new = copyStack(s3);
        System.out.println("copyStack(s3):"+s3new+"\n");

        Stack s4 = new Stack<Integer>();
        s4.push(9);
        s4.push(2);
        s4.push(4);
        System.out.println("s4:"+s4);
        collapse(s4);
        System.out.println("collapse(s4):"+s4+"\n");
        
        Stack<Integer> s5 = new Stack<Integer>();
        s5.push(3);
        s5.push(3);
        s5.push(3);
        Stack<Integer> s5other = new Stack<Integer>();
        s5other.push(3);
        s5other.push(3);
        s5other.push(3);
        System.out.println("s5:"+s5);
        System.out.println("s5other:"+s5other);
        System.out.println("Is s5 equal to s5 other:" + equals(s5,s5other)+"\n");
        
        Queue<Integer> q6 = new LinkedList<Integer>();
        q6.add(2);
        q6.add(5);
        q6.add(1);
        q6.add(4);
        q6.add(7);
        q6.add(10);
        System.out.println("q6:"+q6);
        rerannage(q6);
        System.out.println("rerannage(q6):"+q6+"\n");
        
        Stack<Integer> s9 = new Stack<Integer>();
        s9.push(1);
        s9.push(2);
        s9.push(8);
        s9.push(6);
        s9.push(-1);
        s9.push(15);
        s9.push(7);
        s9.push(8);
        System.out.println("s9:"+s9);
        switchPairs(s9);
        System.out.println("switchPairs(s9):"+s9+"\n");
        
        Stack<Integer> s10 = new Stack<Integer>();
        s10.push(4);
        s10.push(5);
        s10.push(6);
        s10.push(7);
        s10.push(8);
        s10.push(9);
        s10.push(10);
        s10.push(11);
        s10.push(12);
        System.out.println("s10:"+s10);   
        System.out.println("isConsecutive(s10):"+isConsecutive(s10));
        System.out.println("s10:"+s10+"\n"); 
        
        
        Stack<Integer> s15 = new Stack<Integer>();
        s15.push(20);
        s15.push(20);
        s15.push(17);
        s15.push(11);
        s15.push(8);
        s15.push(8);
        s15.push(3);
        s15.push(2);
        System.out.println("s15:"+s15);       
        System.out.println("isSorted(s15):"+isSorted(s15));
        System.out.println("s15:"+s15+"\n"); 
    }

    public static void stutter(Stack<Integer> s)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        while(!s.isEmpty()){
            int n = s.pop();
            q.add(n);
            q.add(n);
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){ 
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
    }

    public static Stack<Integer> copyStack(Stack<Integer> s)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        while(!s.isEmpty()){
            int n = s.pop();
            q.add(n);
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){ 
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        return s;
    }

    public static void collapse(Stack<Integer> s)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            int n1 = s.pop();
            int n2 = 0;
            if(!s.isEmpty())
            {
                n2 = s.pop();
            }
            q.add(n1+n2);
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
    }
    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2 )
    {
        if(s1.size()!=s2.size())
        {
            return false;
        }else
        {
            Stack<Integer> s3 = new Stack<Integer>();
            boolean same = true;
            while(same &&!s1.isEmpty())
            {
                int n1 = s1.pop();
                int n2 = s2.pop();
                if(n1!=n2)
                {
                    same = false;
                }
                s3.push(n1);
                s3.push(n2);
            }
            while(!s3.isEmpty())
            {
                s2.push(s3.pop());
                s1.push(s3.pop());
            }
            return same;
        }       
    }
    public static void rerannage(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<Integer>();
        int oldSize =q.size();
        for(int i=0;i<oldSize;i++)
        {
            int n = q.remove();
            if(n%2==0){
                q.add(n);
            }else{
                s.push(n);
            }
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0;i<oldSize;i++)
        {
            int n = q.remove();
            if(n%2==0){
                q.add(n);
            }else{
                s.push(n);
            }
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void splitStack(Stack<Integer> s)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        int oldSize = q.size();
        for(int i = 0;i<oldSize;i++)
        {
            int n = q.remove();
            if(n<0)
            {
                s.push(n);
            }else
            {
                q.add(n);
            }
        }
        while(!q.isEmpty())
        {
            s.push(q.remove());
        }
    }
    
    public static void switchPairs(Stack<Integer> s)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        while(!s.isEmpty()){ q.add(s.pop()); }
        while(!q.isEmpty()){ s.push(q.remove()); }
        while(!s.isEmpty()){ q.add(s.pop()); }
        while(!q.isEmpty()){
            int n1 = q.remove();
            if(!q.isEmpty()){
                int n2 = q.remove();
                s.push(n2);
            }
            s.push(n1);
        }
    }
    public static boolean isSorted(Stack<Integer> s1)
    {
        if(!s1.isEmpty())
        {
            Stack<Integer> s2 = new Stack<Integer>();
            boolean sort = true;
            int prev = s1.pop();
            s2.push(prev);
            
            while(sort && !s1.isEmpty())
            {
                int curr = s1.pop();
                if(!(prev<=curr)){
                    sort = false;
                }
                s2.push(curr);
                prev = curr;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return sort;
        }
        return false;
    }
    
    public static boolean isConsecutive(Stack<Integer> s)
    {
        if(!s.isEmpty()){
            Queue<Integer> q = new LinkedList<Integer>();
            boolean match = true;
            int prev = s.pop();
            q.add(prev);
            
            while(match && !s.isEmpty()){
                int curr = s.pop();
                if(curr+1!=prev){
                    match = false;
                }
                q.add(curr);
                prev = curr;
            }
            while(!s.isEmpty()){q.add(s.pop());}
            while(!q.isEmpty()){s.push(q.remove());}
            while(!s.isEmpty()){q.add(s.pop());}
            while(!q.isEmpty()){s.push(q.remove());}
            return match;
        }
        return false;
    }
}
