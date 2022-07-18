import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class Chapter14Exercises
{
    public static void main(String[] args){
        Integer[] exe1 = {3,-5,1,2,-4};
        Stack<Integer> splitStack = new Stack<Integer>();
        addAll(splitStack, exe1);
        System.out.println(splitStack);
        splitStack(splitStack);
        System.out.println("splitStack():"+splitStack+"\n");

        Integer[] exe2 = {3,7,1,14,9};
        Stack<Integer> stutter = new Stack<Integer>();
        addAll(stutter,exe2);
        System.out.println(stutter);
        stutter(stutter);
        System.out.println("stutter():"+stutter+"\n");

        Stack<Integer> copyStack = new Stack<Integer>();
        addAll(copyStack,exe2);
        System.out.println(copyStack);
        Stack<Integer> copy = copyStack(copyStack);
        System.out.println(copyStack);
        System.out.println("copyStack():"+copy+"\n");

        Integer[] exe4 = {7,2,8,9,4,11,7,1,42};
        Stack<Integer> collapse = new Stack<Integer>();
        addAll(collapse,exe4);
        System.out.println(collapse);
        collapse(collapse);
        System.out.println("collapse():"+collapse+"\n");

        System.out.println("equals(collapse,collapse):"+equals(stutter,stutter));
        System.out.println("equals(collapse,stutter):"+equals(collapse,stutter)+"\n");

        Integer[] exe6 = {3,5,4,17,6,83,1,84,16,37};
        Queue<Integer> rearragee = new LinkedList<Integer>();
        addAll(rearragee,exe6);
        System.out.println(rearragee);
        rearrage(rearragee);
        System.out.println("after rearraging itself half ->>>" + rearragee+"\n");

        Integer[] exe7 = {1,8,7,2,9,18,12,0,4};
        Queue<Integer> reverseHalf = new LinkedList<Integer>();
        addAll(reverseHalf,exe7);
        System.out.println(reverseHalf);
        reverseHalf(reverseHalf);
        System.out.println("after reversing itself half ->>>" + reverseHalf);

        Integer[] exe11 = {1,2,8,6,-1,15,-7};
        Stack<Integer> switchPairs = new Stack<Integer>();
        addAll(switchPairs, exe11);
        System.out.println(switchPairs);
        switchPairs(switchPairs);
        System.out.println("after switchPairing ->"+ switchPairs+"\n");

        Integer[] exe10 = {1,2,3,4,5,6};
        Stack<Integer> isConsecutive = new Stack<Integer>();
        addAll(isConsecutive, exe10);
        System.out.println(isConsecutive);
        System.out.println("isConsecutive():"+isConsecutive(isConsecutive));
        System.out.println(isConsecutive+"\n");

        Integer[] exe15 = {20,20,17,11,8,8,3,2};
        Stack<Integer> isSorted = new Stack<Integer>();
        addAll(isSorted,exe15);
        System.out.println(isSorted);
        System.out.println("isSort():"+isSorted(isSorted));
        System.out.println(isSorted+"\n");

        Integer[] exe14 = {10,53,19,24};
        Stack<Integer> mirror = new Stack<Integer>();
        addAll(mirror,exe14);
        System.out.println(mirror);
        mirror(mirror);
        System.out.println("after mirroring ->" + mirror+"\n");

        /*Integer[] exe17 = {2,2,2,2,2,-4,-4,-4,82,6,6,6,6,17,17};
        //Integer[] exe17 = {4,4,4,7,7};
        Stack<Integer> compressedDuplicated = new Stack<Integer>();
        addAll(compressedDuplicated,exe17);
        System.out.println(compressedDuplicated);
        compressDuplicates(compressedDuplicated);
        System.out.println("after compressing ->>" + compressedDuplicated);*/

        Integer[] exe19 = {2,8,3,19,2,3,2-8,-8,-3,7,12,-8,4};
        Stack<Integer> removeMin = new Stack<Integer>();
        addAll(removeMin, exe19);
        System.out.println(removeMin);
        System.out.println("smallest value:"+removeMin(removeMin));
        System.out.println(removeMin);


    }
    public static void splitStack(Stack<Integer> s){
        Queue<Integer> q = new LinkedList<Integer>();
        stackToQueue(s, q);
        int size = q.size();
        for(int i = 0; i< size;i++){
            int n = q.remove();
            if(n<0){s.push(n);}
            else{q.add(n);}
        }
        queuetoStack(q, s);
    }

    public static void stutter(Stack<Integer> s){
        Queue<Integer> q = new LinkedList<Integer>();
        stackToQueue(s,q);
        while(!q.isEmpty()){
            int n = q.remove();
            s.push(n);
            s.push(n);
        }
        stackToQueue(s,q);
        queuetoStack(q,s);
    }

    public static void collapse(Stack<Integer> s){
        Queue<Integer> q = new LinkedList<Integer>();
        stackToQueue(s,q);
        queuetoStack(q,s);
        while(!s.isEmpty()){
             int n1 = s.pop();
            if(!s.isEmpty()){
                int n2 = s.pop();
                q.add(n1+n2);
            }else{
                q.add(n1);
            }
        }
        queuetoStack(q,s);
    }
    public static Stack<Integer> copyStack(Stack<Integer> s){
        Stack<Integer> copy = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        stackToQueue(s,q);
        queuetoStack(q,s);
        while(!s.isEmpty()){
            int n = s.pop();
            copy.push(n);
            q.add(n);
        }
        queuetoStack(q,s);
        return copy;
    }

    public static boolean equals(Stack<Integer> s1, Stack<Integer>s2){
        if(s1.size() != s2.size()){
            return false;
        }else{ // same size
            Stack<Integer> s3 = new Stack<Integer>();
            boolean equal = true;
            while(equal && !s1.isEmpty()){
                int n1 = s1.pop();
                int n2 = s2.pop();
                if(n1 != n2 ){ equal = false;}
                s3.push(n1);
                s3.push(n2);
            }
            while(!s3.isEmpty()){
                s2.push(s3.pop());
                s1.push(s3.pop());
            }
            return equal;
        }
    }

    public static void reverseHalf(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        int size = q.size()/2;
        for(int i = 1;i <= size;i++){
            q.add(q.remove());
            s.push(q.remove());
        }
        if(q.size()%2 !=0){ q.add(q.remove());}; // odd case
        System.out.println("q ->>"+q);
        while(!s.isEmpty()){
            q.add(q.remove());
            q.add(s.pop());
        }
        if(q.size()%2 !=0){ q.add(q.remove());};
    }

    public static void switchPairs(Stack<Integer> s){
        Queue<Integer> q = new LinkedList<Integer>();
        stackToQueue(s,q);
        queuetoStack(q,s);
        stackToQueue(s,q);
        while(!q.isEmpty()){
            int n1 = q.remove();
            if(!q.isEmpty()){
                s.push(q.remove());
                s.push(n1);
            }else{
                s.push(n1);
            }
        }
    }

    public static boolean isConsecutive(Stack<Integer> s){
        if(s.size()<=2){return true;}

        Queue<Integer> q = new LinkedList<Integer>();
        boolean yes = true;
        int prev = s.pop();
        q.add(prev);

        while(yes && !s.isEmpty()){
            int curr = s.pop();
            if(curr + 1 != prev){  yes = false; }
            q.add(curr);
            prev = curr;

        }
        stackToQueue(s,q);
        queuetoStack(q,s);
        stackToQueue(s,q);
        queuetoStack(q,s);
        return yes;
    }

    public static boolean isSorted(Stack<Integer> s){
        if(s.isEmpty() || s.size() == 1){return true;}
        Queue<Integer> q = new LinkedList<Integer>();
        boolean sort = true;
        int value = s.peek();
        while(sort && !s.isEmpty()){
            int n = s.pop();
            if(value>n){  sort = false; }
            q.add(n);
        }
        queuetoStack(q,s);
        stackToQueue(s,q);
        queuetoStack(q,s);
        return sort;
    }

    public static void mirror(Stack<Integer>s){
        Queue<Integer> q = new LinkedList<Integer>();
        stackToQueue(s,q);
        queuetoStack(q,s);
        stackToQueue(s,q);
        int size = q.size();
        for(int i = 1;i<=size;i++){
            int n = q.remove();
            s.push(n);
            q.add(n);
        }
        stackToQueue(s,q);
        queuetoStack(q,s);

    }    /*public static void compressDuplicates(Stack<Integer> s){
        if(!s.isEmpty()){
            Queue<Integer> q = new LinkedList<Integer>();
            stackToQueue(s,q);
            queuetoStack(q,s);
            stackToQueue(s,q);

            int occurence = 1;
            int prev = q.remove();
            while(!q.isEmpty()){
                System.out.println(q);
                  int curr = q.remove();
                  if(curr == prev){
                      occurence++;
                      if(!q.isEmpty() && q.peek() != prev){
                          s.push(occurence);
                          s.push(curr);
                      }
                  }else{
                      s.push(1);
                      s.push(curr);
                  }
                prev = curr;
                System.out.println("s->>"+s);
            }

        }
    }*/

    public static void rearrage(Queue<Integer>q){
        Stack<Integer> s = new Stack<Integer>();
        rearrage(s,q);
        rearrage(s,q);

    }

    private static void rearrage(Stack<Integer> s, Queue<Integer>q){
        int size = q.size();
        for(int i = 0;i<size;i++){
            int n = q.remove();
            if(n%2==0){
                q.add(n);
            }
            else{
                s.push(n);
            }
        }
        stackToQueue(s,q);
    }

    public static int removeMin(Stack<Integer> s){
        if(s.size()==0){throw new NoSuchElementException("no value");}
        Queue<Integer> q = new LinkedList<Integer>();
        int min = s.peek();
        while(!s.isEmpty()){
            int n = s.pop();
            q.add(n);
            min = Math.min(min,n);
        }

        int size = q.size();
        for(int i = 1;i <=size;i++){
            int n = q.remove();
            if(n != min){
                s.push(n);
            }
        }
        stackToQueue(s,q);
        queuetoStack(q,s);
        return min;
    }


    public static <T> void stackToQueue(Stack<T> s, Queue<T> q) {
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static <T> void queuetoStack(Queue<T> q, Stack<T> s){
        while(!q.isEmpty()){
            s.push(q.remove());
        }

    }

    public static <T> void addAll(Stack<T> s, T[] array){
        for(T value: array){
            s.push(value);
        }
    }
    public static <T> void addAll(Queue<T> q, T[] array){
        for(T value: array){
            q.add(value);
        }
    }

}
