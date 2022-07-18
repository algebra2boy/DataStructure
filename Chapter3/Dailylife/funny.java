import java.util.*;
public class funny{
    public static void main(){
        namecheck("Valery");




    }
    public static void namecheck(String name){
        String input ="";
        Scanner console=new Scanner(System.in);
        System.out.print("Who is this ");
        String answer=console.next();
        if(answer.equalsIgnoreCase("Valery")){
            input="I am sorry, no access";
        }else{
            input="welcome to MetroHacks";
        }
        System.out.println(input);
    }
    public static void lottery(){
        Random number=new Random();
        Scanner console=new Scanner(System.in);
        System.out.print("The number you want for lottery");
    
    }
}
