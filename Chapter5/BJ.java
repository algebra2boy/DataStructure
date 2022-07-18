import java.util.*;
public class BJ
{
    public static void main(){
        Exercise1(36);
        Exercise11();
    }
    public static String toBinary(int n){
        String a = "";
        while(n>0){
            if(n%2==0){
                a = "0"+a;
            }else{
                a = "1"+a;
            }
            n=n/2;
        }
        return a;
    }
    //Exercise1
    public static void Exercise1(int number){
        int input = number;
        String a = "";
        while(input%2==0){
            input = input/2;
            a =a+"2 * ";
        }
        System.out.println(number+" = "+a+input);
        
    }
    //Exercise11
    public static void Exercise11(){
        Random r=new Random();
        int count=0;
        while(count!=3){
            int number=r.nextInt(2);    
            if(number==0){
                System.out.print("T ");
            }else if(number==1){
                System.out.print("H ");
                count++;
            }
            if(number==1){
                count=count;
            }else{
                /*if the next one is not a head, the count 
                will be drop to 0, like 01201201010, when the 
                count is equal to 3, it will be good
                 */
                count=0;
            }
        }
        System.out.println("Three heads in a row!");  
    }
    //Exercise12
    public static void printAverage(){
        Scanner console=new Scanner (System.in);
        System.out.print("Type a number: ");
        double number=console.nextDouble();
        double sum=0;
        int count=0;
        while(number>=0){
            count++;
            sum+=number;
            System.out.print("Type a number: ");
            number=console.nextDouble();
        }
        if(count>0){
            double average=sum/count;
            System.out.println("Average was "+average);
        }
    }
    //Exercise13
    public static boolean consecutive(int a, int b,int c){
        int max,min;
        double middle;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        middle=a+b+c-max-min;
        return((max-1==middle)&&(middle-1==min));
    }
    //Exercise14
    public static boolean hasMidpoints(int a,int b,int c){
        int max=0,min=0;
        double mid=0;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        mid=a+b+c-min-max;
        return (max+min)/2.0==mid;
    }
    //Exercise15
    public static boolean dominant(int a,int b,int c){
        int max,min,mid;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        mid=a+b+c-min-max;
        return (mid+min)<max;
    }
    //Exercise16
    public static boolean anglePairs(int a,int b,int c){
        int max=0,min=0,mid=0;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        mid=a+b+c-min-max;
        return ((min+mid)==90)&&((max+mid==180)||(max+min==180));
    }

    //Exercise19
    public static int firstDigit(int number){
        int count=0;
        int digit=number;
        while(Math.abs(digit)>0){     //this while loop is to find how many digit
            digit=digit/10; //in the number,after, we use the scientific notation
            count++;        //ex.1000=1*10^3,we realize the # of 0 is 3
        }                   //but the # of digit is 4, so we decrease by 1
        return Math.abs(number)/(int)(1*Math.pow(10,count-1));//pow is double type, that is why I use int
    }
    /*public static void isAllVowels(String a){
    String b=a.toLowerCase();
    int index=0;
    while(index!=b.length()-1){
    if(b){
    }
    index++;
    }
    }*/
}
