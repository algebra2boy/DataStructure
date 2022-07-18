import java.util.*;
public class selfCheck{
    public static void selfcheck_7(){
    Scanner console= new Scanner(System.in);
    System.out.print("the number you put in ");
    int number=console.nextInt();
    if(number%2==1){
        System.out.println("it is an odd number");
    }else{
        System.out.println("it is an even number");
    
    }   
}
    public static void selfcheck_13(){
        Scanner console= new Scanner(System.in);
        System.out.print("What color do you want? ");
        String color=console.next();
        if(color.equalsIgnoreCase("B")){
            System.out.println("You have chosen blue");
    }else if(color.equalsIgnoreCase("G")){
            System.out.println("You have chosen green");
    }else if(color.equalsIgnoreCase("R")){
            System.out.println("You have chosen red");
    }else{
        System.out.println("Unknown color: "+color);
    }
}
    public static void selfcheck_14(){
        Scanner console= new Scanner(System.in);
        System.out.print("Enter a card: ");
        String rank=console.next();
        String suit=console.next();
        if(rank.equals("2")){
            rank="Two";
        }else if(rank.equals("3")){
            rank="Three";
        }else if(rank.equals("4")){
            rank="Four";
        }else if(rank.equals("5")){
            rank="Five";
        }else if(rank.equals("6")){
            rank="Six";
        }else if(rank.equals("7")){
            rank="Seven";
         }else if(rank.equals("8")){
            rank="Eight";
         }else if(rank.equals("9")){
            rank="Nine";
         }else if(rank.equals("10")){
            rank="Ten";
         }else if(rank.equals("J")){
            rank="Jacks";
         }else if(rank.equals("Q")){
            rank="Queen";
         }else if(rank.equals("K")){
            rank="King";
         }else
            rank="Ace";
         if(suit.equals("C")){ 
            suit="Clubs";
         }else if(suit.equals("S")){ 
            suit="Spades";
         }else if(suit.equals("H")){ 
            suit="Hearts";
         }else{
            suit="Diamonds";
         }
         System.out.println(rank+" of "+suit);
    }
    
    public static void selfcheck_8(){
        Scanner console=new Scanner(System.in);
        System.out.print("Type a number: ");
        int number=console.nextInt();
        if(number%2==0){
            if(number%3==0){
            System.out.println("Divisible by 6.");
        }else{
            System.out.println("Odd.");
        }
    }
    }
    public static void selfcheck8(){
        Scanner console=new Scanner(System.in);
        System.out.print("Type a number: ");
        int number=console.nextInt();
    if (number % 2 == 0) {
        if (number % 3 == 0) {
            System.out.println("Divisible by 6.");
        }
    }else {
    System.out.println("Odd.");
    }
}
    public static int selfcheck22(String s){
        int count=0;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='e'){
                count++;
            }
        }
        return count;
    }   
    public static int selfCheck24(String st){
        int count=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch>='n'&&ch<='z'||ch>='N'&&ch<='Z'){
                count++;
        }
    }
        return count;
    }
}
