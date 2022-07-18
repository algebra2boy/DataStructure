import java.util.*;
public class toPrepare
{
    public static void main(){
        
    }
    public static void intro(){
        Scanner console = new Scanner(System.in);
        System.out.println("put a year between 1000 and 3000");
        System.out.print("What is the year:");
        int year = console.nextInt();
        System.out.print("In Roman years:");
        //String romanYears = getRoman(year);
    }
    public static void getRoman(int year){
        int last_Digit = 0,numbers; 
        //int times_value = 1;
        int count = 0;
        String combine = "";
        for(int i=1;i<=4;i++){
            last_Digit = year%10;
            //numbers = last_Digit*times_value;
            //times_value = times_value*10;
            count++;
            year = year/10;
            if(count ==1){
                
            }else if(count ==2){
                
            }else if(count ==3){
                
            }else if(count ==4){
                
            }
        }
        
    }
}
