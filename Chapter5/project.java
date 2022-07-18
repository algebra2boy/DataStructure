import java.util.*;
public class project
{
    public static void project4(int a){
    System.out.println("This program has you, the user, choose a number");
    System.out.println("between 1 and 10. Then I, the computer, will try");
    System.out.println("my best to guess it");
    Random r=new Random();
    int n=r.nextInt(10)+1;
    String bingo="";
    int count=0;
    while(n!=a){
        if(n!=a){
            bingo="n";
        }
        System.out.println("Is it "+n+"   (y/n) "+bingo );
        n=r.nextInt(10)+1;
        count++;
    }
    if(n==a){
        System.out.println("Is it "+n+"   (y/n) "+"y" );
    }
    System.out.println("I got your number of "+a+" correct in "+(count+1)+" guesses");
    }
}