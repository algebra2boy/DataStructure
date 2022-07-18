import java.util.*;
public class LuckyNumber
{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Your lucky number:");
        int lucky = input.nextInt();
        while(lucky!=-1){
        int[] number;
        number = getValue();
        System.out.println(Arrays.toString(number));
        int match = 0;
        for(int i = 0;i<100;i++){
            if(number[i]==lucky){
                match++;
            }          
        }
        System.out.println("There are " +match+ " match to the lucky number\n");
        System.out.print("Your lucky number(quit=-1):");
        lucky = input.nextInt();
    }
    }
    
    public static int[] getValue(){
        int[] number = new int[100];//100 trials
        for(int i = 0; i<number.length;i++){
            number[i] = (int) (Math.random()*10);
        }
        return number;
    }
}
