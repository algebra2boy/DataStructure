import java.util.*;
public class RotateCircularDbLLL_Client
{
    public static void main(){
        Scanner console = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("How long is the list? ");
        int length = console.nextInt();
        
        System.out.println("\nThe numbers are: ");
        String numbers = input.nextLine();
        Scanner readInput = new Scanner(numbers); 
        CircularDblLinkedList list = new CircularDblLinkedList();
        while(readInput.hasNextInt()){
            list.add(readInput.nextInt());
        }
        
        System.out.println("list:"+list);
        System.out.println("(a) Care to rotate\n(b) Quit");
        System.out.print("Enter a choice:");
        char choice = console.next().charAt(0);
        
        if(choice == 'b'){
            System.out.println("Bye a Good Day");
        }else{
            System.out.print("What is the rotate value? ");
            String value = console.next();
            char sign  = value.charAt(0);
            int shift = Integer.parseInt(""+value.charAt(1));
            System.out.println("sign: " + sign);
            System.out.println("shift number = " + shift);
            list.rotate(sign,shift);
            System.out.println("list:"+list);
        }
    }
}
