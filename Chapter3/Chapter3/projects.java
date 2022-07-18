import java.util.*;
public class projects{
    public static void main(String[]args){
        project1(3,4);
        project2();
        project3();
        project4();
        project5();
    }
    public static void project1(int segments,int height){
        for(int i=1;i<=segments;i++){
            for(int j=1;j<=height;j+=2){
                System.out.println();
            }
        }
        
    }
    public static void project2(){
        System.out.println("\tCurrent balance \tInterest\tNew balance\t\tNew deposit");
        double a1=1000.0;//Initial
        for(int i=1;i<=25;i++){  
            double a2=0.065;//interest
            int a3=100;//deposit
            double a4=a1*(1+a2);//New balance
            System.out.println("\t"+round(a1)+"\t\t"+"\t6.5%"+"\t\t"+round(a4)+"\t\t\t"+a3);
            a4+=100;
            a1=a4;
        }  
        }
        public static double round(double n){
            return Math.round(n*10.0)/10.0;
        } 
    public static void project3(){
        System.out.println("\tDay\tPresents Received\tTotal presents");
        for(int i=1;i<=12;i++){
            System.out.println("\t"+i+"\t\t"+i+"\t\t\t"+(i*(i+1)/2));             
        }
    }   
    /*public static void project3secondmethod(){
        System.out.println("\tDay\tPresents Received\tTotal presents");
        int total=0;
        for(int i=1;i<=12;i++){
            total=total+i;
            System.out.println("\t"+i+"\t\t"+i+"\t\t\t"+total);    
    }
    }*/
    public static void project4(){
        Scanner console= new Scanner(System.in);
        System.out.print("Side x is ");
        double x=console.nextDouble();
        System.out.print("Side y is ");
        double y=console.nextDouble();
        System.out.print("Hypotenuse is " );
        double h=console.nextDouble();
        
        double angle1=Math.atan(y/x);
        double angle1degree = Math.round(Math.toDegrees(angle1)*100.0)/100.0;
        
        double angle2=Math.atan(x/y);
        double angle2degree = Math.round(Math.toDegrees(angle2)*100.0)/100.0;
        double angle3=Math.round((180-angle1degree-angle2degree)*100.0)/100.0;
        System.out.println("The three angles are "+angle1degree+" "+angle2degree+" "+angle3);
    }
    public static void project5(){
        Scanner console= new Scanner(System.in);
        System.out.print("The latitude of the first city is ");
        double x1=console.nextDouble();
        System.out.print("The longitude of the first city is ");
        double y1=console.nextDouble();
        System.out.print("The latitude of the second city is ");
        double x2=console.nextDouble();
        System.out.print("The longitude of the second city is ");
        double y2=console.nextDouble();
        
        //r=radian
        double x1r=Math.toRadians(x1);
        double x2r=Math.toRadians(x2);
        double y1r=Math.toRadians(y1);
        double y2r=Math.toRadians(y2);
        double angular=Math.acos((Math.sin(x1r)*Math.sin(x2r))+(Math.cos(x1r)*Math.cos(x2r)*Math.cos(y1r-y2r)));
        
        double earthradius=6372.795;
        System.out.println("The distance between two cities are "+(Math.round(earthradius*angular*1000.0)/1000.0)+" km");
    }
    public static void project6(){
        
    }
    public static String padded(int n,int width){
        String s=""+n;
        for(int i=s.length();i<width;i++){
            s=" "+s;
    }
        return s;
    }
    
}
