import java.util.*;
public class Chapter4Exercise_problem{
    public static void main(){
        System.out.println("Exercise_1");
        Exercise_1(6);
        Exercise_2("Apple",4);
        Exercise_3(4,30);
        Exercise_4(4);
        Exercise_5(3,2);
        Exercise_6(2,5);
        Exercise_7(5);
        Scanner console= new Scanner(System.in);
        System.out.println("Exercise8");
        Exercise_8(console);
        System.out.println("Exercise9");
        Exercise_9(console);
        System.out.println("Exercise9");
        Exercise_10(console);
        System.out.println("Exercise11");
        Exercise_11(console,4);
        Exercise_12(3,4,5);
        Exercise_13(3,4);
        Exercise_14(2,3);
        //Exercise_15();
        Exercise_16("apbpa");
        //Exercise_17();
        //Exercise_18();
        Exercise_19(4,5);
        Exercise_20(1,1,2);
        //Exercise_21();
    }

    public static double Exercise_1(int a){
        double sum=0.0;
        for(int i=1;i<=a;i++){
            sum=sum+(1.0/i);
        }
        return sum;
    }

    public static String Exercise_2(String s,int a){
        String c="";
        for(int i=1;i<=a;i++){
            c=s+c;
        }
        return c;
    }

    public static String Exercise_3(int month,int days){
        if((month==12&&days>=16)||(month<=2)||(month==3&&days<=15)){
            return "winter";
        }else if((month==3&&days>=16)||(month<=5)||(month==6&&days<=15)){
            return "spring";
        }else if((month==6&&days>=16)||(month<=8)||(month==9&&days<=15)){
            return "summer";
        }else{
            return "fall";    
        }
    }

    public static String Exercise_4(int month){
        if(month==4||month==6||month==9||month==11){
            return"30 days";
        }else if(month==2){
            return"28 days";
        }else{
            return"31 days";
        }
    }

    public static int Exercise_5(int base,int exponent){
        int sum=1;
        for(int i=1;i<=exponent;i++){
            sum=sum*base;
        }
        return sum;
    }

    public static void Exercise_6(int first,int last){
        if(first<last){
            for(int i=first;i<=last;i++){
                System.out.print(i+" ");
            }
        }else if(first>last){
            for(int i=first;i>=last;i--){
                System.out.print(i+" ");
            }
        }else{
            System.out.println(first);
        }
    }

    public static void Exercise_7(int size) {
        int front = 0;
        int back = size - 1;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(j == front || j == back)
                    System.out.print("x");
                else
                    System.out.print("o");
            }
            System.out.println();
            front++;
            back--;
        }
    }

    public static void Exercise_8(Scanner console){
        System.out.print("How many numbers do you want to enter? ");
        int numbers=console.nextInt();
        int min=0;
        int max=0;
        for(int i=1;i<=numbers;i++){
            System.out.print("Number "+i+": ");
            int input=console.nextInt();
            if(input>=max){
                max=input;
            }else if(input<=min){
                min=input;
            }
        }
        System.out.println("Smallest ="+min);
        System.out.println("Largest = "+max);
    }   

    public static void Exercise_9(Scanner console){
        System.out.print("How many integers? ");
        int intergers=console.nextInt();
        int sum=0;
        int max=0;
        for(int i=1;i<=intergers;i++){
            System.out.print("Next integers? ");
            int numbers=console.nextInt();
            if(numbers%2==0){
                sum=sum+numbers;
            }if(numbers%2==0&&numbers>max){
                max=numbers;
            }
        }
        System.out.print("Even sum ="+sum+", ");
        System.out.println("Even max = "+max);
    }

    public static void Exercise_10(Scanner console){
        System.out.print("Enter a student record: ");
        String name=console.next();
        int times=console.nextInt();
        double sum=0;
        for(int i=1;i<=times;i++){
            int grade=console.nextInt();
            sum=sum+grade;
        }
        double average=sum/times;
        System.out.println(name+"'s grade is "+average);
    }

    public static void Exercise_11(Scanner console,int n){
        String a="";
        for(int i=1;i<=n;i++){
            System.out.print("name #"+i+"?" );
            String names=console.nextLine();
            if(names.length()>a.length()){
                a=names;
            }
        }
        System.out.println(a.toUpperCase().charAt(0)+a.toLowerCase().substring(1,a.length()-1)+"'s name is longest");
    }

    public static void Exercise_12(int a,int b,int c){
        if(a<=0||b<=0||c<=0){
            throw new IllegalArgumentException("The length shouldn't be negative");
        }else if((a+b<c)||(a+c<b)||(b+c<a)){
            throw new IllegalArgumentException("One side's length should be longer than the sum of the other two");
        }
        if((a==b)&&(a==c)&&(b==c)){
            System.out.println("equilateral");
        }else if((a!=b)&&(a!=c)&&(b!=c)){
            System.out.println("scalene");
        }else{
            System.out.println("isosceles");
        }
    }

    public static double Exercise_13(int a,int b){
        double average=(a+b)/2.0;
        return average;
    }

    public static double Exercise_14(double base,int exponent){
        double sum=1;
        for(int i=1;i<=Math.abs(exponent);i++){
            sum=sum*base;
        }
        if(exponent<0){
            return 1/sum;
        }
        return sum;
    }

    public static void Exercise_16(String s){
        int count=0;
        for(int i=0;i<s.length()/2;i++){
            String a=s.toUpperCase();
            if(a.charAt(i)==a.charAt((a.length()-1-i))){
                count++;
            }
        }
        if(count==s.length()/2){
            System.out.println(s+" is a palindrome");
        }else{//(count!=s.length()/2)
            System.out.println(s+" isn't a palindrome");
        }   
    }

    public static int Exercise_18(String s){
        int count =0;
        if(s.charAt(0) !=' '){
            count++;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '&&s.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }

    public static String Exercise_19(double x, double y) {
        if(x>0&&y>0){
            return"quadrant 1";
        }else if(x>0&&y<0){
            return"quadrant 4";
        }else if(x<0&&y>0){
            return"quadrant 2";
        }else if(x<0&&y<0){
            return"quadrant 3";
        }else if(x==0){
            return"lies on y-axis";
        }else{
            return"lies on x-axis";
        }
    }

    public static int Exercise_20(int a,int b,int c){
        int number=0;
        if((a!=b)&&(a!=c)&&(b!=c)){
            number=3;
        }else if((a==b)&&(a==c)&&(b==c)){
            number=1;
        }else{
            number=2;
        }
        return number; 
    }
}
