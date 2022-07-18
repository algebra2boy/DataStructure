import java.util.*;
public class RandonInt
{
    public static void main()
    {
        int[] number;
        number = getValue();
        System.out.println(Arrays.toString(number));
        int vote = 0; int underdog = 0;
        for(int i = 0;i<100;i++){
            if(number[i]<=54){
                vote++;
            }else{
                underdog++;
            }            
        }
        System.out.println("vote:"+vote);
        System.out.println("underdog:"+underdog);
    }
    public static int[] getValue(){
        int[] number = new int[100];
        for(int i = 0; i<number.length;i++){
            number[i] = (int) (Math.random()*number.length);
        }
        return number;
    }

}
