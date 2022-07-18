import java.util.*;
public class Exercise
{
    public static void main(){
        Yes();
    }

    public static void Yes(){
        /*int total=25;
        for(int number=1;number<=(total/2);number++){
        total=total-number;
        System.out.println(total+" "+number);
        }*/
        int number=1;
        int total=25;
        while(number<=(total/2)){
            total=total-number;
            System.out.println(total+" "+number);
            number++;
        }
    }

    public static void No(){
        int i=1;
        while(i<=2){
            int j=1;
            while(j<=3){
                int k=1;
                while(k<=4){
                    System.out.print("*");
                    k++;
                }
                System.out.print("!");
                j++;
            }
            System.out.println();
            i++;
        }
        /*for(int i=1;i<=2;i++){
        for(int j=1;j<=3;j++){
        for(int k=1;k<=4;k++){
        System.out.print("*");
        }
        System.out.print("!");
        }
        System.out.println();
        }*/
    }

    public static void mystery(int x){
        int y=1,z=0;
        while(2*y<=x){
            y=y*2;
            z++;
        }
        System.out.println(y+ " "+z);
    }

    public static void mystery2(int x){
        int y=0;
        while(x%2==0){
            y++;
            x=x/2;
        }
        System.out.println(x+" "+y);
    }

    public static void Random(){
        /*Random r=new Random();
        System.out.println(r.nextInt(11));
        Random r=new Random();
        int n=r.nextInt(50)+50;
        if(n%2!=0){
        System.out.println("Odd number is" +n);
        }else{
        System.out.println("Even number is"+n);*/
        int number = 1;
        do {
            number *= 2;
            System.out.print(number+" ");
        } while (number <= 200);
        int a=1;
        while(a<=200){
            a*=2;
            System.out.print(a+" ");
        }
    }

    public static void reponse(){
        int number;
        Random r=new Random();
        do{
            System.out.print("Random number: ");
            number=r.nextInt(1001);
            System.out.println(number);
        }while(number<=900);

    }

    public static void trouble(){
        Scanner console=new Scanner(System.in);
        System.out.print("Type a number (or -1 to stop): ");
        int number=console.nextInt();
        int max=number,min=number;
        while(number!=-1){
            if(number>max){
                max=number;
            }else{
                min=number;
            }
            System.out.print("Type a number (or -1 to stop): ");
            number=console.nextInt();
        }
        if(min!=-1){
            System.out.println("Maximum was "+max);
            System.out.println("Minimum was "+min);
        }
    }

    public static String firstWord(String s) {
        int start = 0;
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        int stop = start;
        while (stop < s.length() && s.charAt(stop) != ' ') {
            stop++; }
        return s.substring(start, stop);
    }
}
