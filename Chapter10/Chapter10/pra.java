import java.util.*;
public class pra
{
    public static void main(){
        ArrayList<Integer> list9 = new ArrayList<Integer>();
        list9.add(7);
        list9.add(2);
        list9.add(0);
        list9.add(0);
        list9.add(4);
        list9.add(0);
        System.out.println("#9 OP="+rangeBetweenZero(list9)+"\n");
    }

    public static int rangeBetweenZero(ArrayList<Integer> a){
        int count = 0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)==0){
                count++;
            }
        }
        if(count<=1){
           return count;
        }
        return a.lastIndexOf(0)-a.indexOf(0);      
    }
}
