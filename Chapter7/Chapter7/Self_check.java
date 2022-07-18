import java.util.*;
public class Self_check
{
   public static void main(){
       
   }
   public static void exercise(){
       int[] list = new int[5];
       for(int i=0;i<list.length;i++){
           list[i]=2*i+1;
       }
       for(int i=0;i<list.length;i++){
           list[i]++;
       }
       System.out.println(Arrays.toString(list));
   }
    
}
