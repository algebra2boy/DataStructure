    import java.util.*;
public class Bills {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int numBills1 = getBills(a, "John");
        int numBills2 = getBills(a, "Jane");
        System.out.println("John needs " + numBills1 + " bills");
        System.out.println("Jane needs " + numBills2 + " bills");
    }

    public static int getBills(Scanner a, String name) {
        System.out.print("How much will " + name + " be spending? ");
        double amount = a.nextDouble();
        System.out.println();
        int numBills = (int) (amount / 20.0);
        if (numBills * 20.0 < amount) {
            numBills++;
        }
        return numBills;
    }
    public static void code(){
        double gpa=3.2;
        double roundoff=Math.abs(gpa*3-9.6);
        if(roundoff<0.001){
            System.out.println("You earned enough credits.");
            System.out.println(gpa*3);
        }
        
}
    public static void mult(){
        Scanner console=new Scanner(System.in);
        System.out.print("How many numbers you have ");
        double numbers=console.nextDouble();
        double sum=1.0;
        for(int i=1;i<=numbers;i++){
            System.out.print("# "+ i +" ");
            double next=console.nextDouble();
            sum*=next;
        }
        System.out.println(sum);
}
    //public static void name(String name){
        
    
}