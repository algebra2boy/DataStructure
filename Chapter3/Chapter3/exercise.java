import java.util.*;
public class exercise{
    //Exercise1
    public static void printNumbers(int number){
        for(int i=1;i<=number;i++){
            System.out.print("["+i+"]");
        }
        System.out.println();
    }
    //Exercise2
    public static void printPowerOf2(int n){
        for(int i=0;i<=n;i++){
            double power=Math.pow(2,i);
            System.out.print((int)power+" ");
        }
        System.out.println();
        
    }
    public static void printPowerOf2_2(int n){
        int a=1;
        for(int i=0;i<=n;i++){
            System.out.print(a+" ");
            a*=2;
        }
    }
    //Exercise3
    public static void printPowerOfN(int base,int exponent ){
        for(int i=0;i<=exponent;i++){
            double power=Math.pow(base,i);
            System.out.print((int)power+" ");
        }
        System.out.println();
        
    }
    public static void printPowerOfN_2(int base, int exponent){
        int a=1;
        for(int i=0;i<=exponent;i++){
            System.out.print(a+" ");
            a=a*base;
    }
    System.out.println();
    }
    //Exercise4
    public static void printSquare(int min,int max){
        for(int i=min;i<=max;i++){
            for(int j=i;j<=max;j++){
                System.out.print(j);
                }
            for(int j=min;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
            
            }
    }
    //Exercise5
    public static void printGrid(int rows,int columns){
        for(int i=1;i<=rows;i++){
            for(int j=i;j<=rows*(columns-1)+i;j+=4){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //Exercise13
    public static void pay(double salary, int hours){
        double money=(salary*8)+((hours-8)*(1.5*salary));
        System.out.println(money);
        if (hours<=8){
        money=salary*hours;
    }
}
    //Exercise14
    public static double cylinders(double radius, double height){
        double surface_area=2*Math.PI*(Math.pow(radius,2))+2*Math.PI*radius*height;
        System.out.println(surface_area);
        return surface_area;
    }
    //Exercise15
    public static double sphere(double radius){
        double volume=4.0/3*Math.PI*(Math.pow(radius,3));
        System.out.println(volume);
        return volume;
    
    }
    //Exericise16
    public static double triangleArea(double a, double b,double c){
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    //Exercise17

    //Exercise18
    //Exercise19
    //Exercise20
    public static void inputBrithday(){
        Scanner console=new Scanner(System.in);
        System.out.print("On what day of the month were you born? ");
        int day=console.nextInt();
        System.out.print("What is the name of the month in which you were born?" );
        String month=console.next();
        System.out.print("During whay year were you born? ");
        int year=console.nextInt();
        System.out.print("You were born on "+ month+" "+day+", "+year+". You're mighty old");
    }
    //Exercise22
        public static void college(){
       Scanner console=new Scanner(System.in);
       System.out.println("University admission program!");
       System.out.print("What is your GPA? " );
       double GPA =console.nextDouble();
       System.out.print("What is your SAT score? " );
       int SAT = console.nextInt();
       if(GPA>1.8)
       {
           System.out.println("You were accpted!");
       }
       else if(SAT>900){
           System.out.println("You were accpted");
       }
       else{
           System.out.println("You were rejected");
       }
    }
}
