;import java.util.*;
public class Real_BJP
{
    public static void main(){
        Scanner console=new Scanner(System.in);
        showTwos(120);//Exercise1
        GCD(125,1000);//Exercise2
        toBinary(44);//Exercise3
        randomX();//Exercise4
        printLetter();//Exercise5
        makeGuess();////Exercise6
        diceSum(console);//Exercise7
        randomWalk();//Exercise8
        printFactors(100);//Exercise9
        hopscotch(8);//Exercise10
        threeHeads();//Exercise11
        printAverage();//Exercise12
        consecutive(5,8,2);////Exercise13
        hasMidpoints(4,7,10);//Exercise14
        dominant(4,10,1);//Exercise15
        anglePairs(40,50,90);////Exercise16
        digitSum(-4142);//Exercise18
        firstDigit(1234);//Exercise19
        digitRange(5324);//Exercise20
        swapDigits(2132);//Exercise21
        allDigitsOdd(2345);//Exercise22
        hasAnOddDigit(2334);//Exercise23
        isALLVowels("eIEIO");//Exercise24
    }
    public static void digitRange(int n){
        int biggest = n%10,smallest = n%10;
        while(n>0){
            int digit = n%10;
            if(digit>biggest){
                digit = biggest;
            }else if(digit<smallest){
                digit = smallest;
            }
            n=n/10;
        }
        System.out.println("biggest is"+biggest+"\nsmallset is"+smallest);
    }
    //Exercise3
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
    //Exercise8
    public static void randomWalk(){
        Random r = new Random();int a=0,max=0;
        while(a<3&&a>-3){
            int b = r.nextInt(2);
            if(b==1){
                a++;
            }else{
                a--;
            }
            max = Math.max(a,-4);
            System.out.println("position ="+a);
        }
        System.out.println("max position = "+max);
    }
    //Exercise24
    public static boolean isALLVowels(String a){
        String b = a.toLowerCase();int count=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)!='a'&&b.charAt(i)!='e'&&b.charAt(i)!='i'&&b.charAt(i)!='o'&&b.charAt(i)!='u'){
                count++;
            }
        }
        return count==0;
    }

    public static void printFactors(int number){//Exercise9
        System.out.print("1");
        for(int i=2;i<=number;i++){
            if(number%i==0){
                System.out.print(" and "+i);
            }
        }
    }

    public static void hopscotch(int number){//Exercise10
        if(number>=0){
            System.out.println("  1  ");
            for(int i=1;i<=number;i++){
                System.out.println(3*i-1+"   "+3*i);
                System.out.println("  "+(3*i+1)+"  ");
            }
        }
    }

    public static boolean hasAnOddDigit(int number){//Exercise22
        int a = number,count=0;
        while(number>0){
            a = number%10;
            if((a%2!=0)){
                count++;
            }
            number=number/10;
        }
        return count>0;
    }

    public static int swapDigits(int number){//Exercise21
        int a = number,sum=0,power=0;

        while(a>10){
            int digit1 = a%10;
            a= a/10;
            int digit2 = a%10;
            a= a/10;
            sum+=(digit1*Math.pow(10,power+1)+digit2*Math.pow(10,power));
            power+=2;
        }
        return sum;
    }

    public static int firstDigit(int number){//Exercise19
        int a = Math.abs(number),count = 0;

        while(a>0){
            a=a/10;
            count++;
        }
        return number/(int)(Math.pow(10,count-1));

    }

    public static int GCD(int a,int b)//Exercise2
    {
        while(b!=0){
            int temp = a;
            a = b;
            b = temp%b;
        }
        return Math.abs(a);
    }
    //Exercise22
    public static boolean allDigitsOdd(int number){
        int count=0;
        while(number>0){
            number=number%10;
            if(number%2!=0){
                count++;
            }
            number=number/10;
        }
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
    //Exercise16
    public static boolean anglePairs(int a,int b,int c){
        int max=0,min=0,mid=0;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        mid=a+b+c-min-max;
        return ((min+mid)==90)&&((max+mid==180)||(max+min==180));
    }
    //Exercise15
    public static boolean dominant(int a,int b,int c){
        int max,min,mid;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        mid=a+b+c-min-max;
        return (mid+min)<max;
    }
    //Exercise14
    public static boolean hasMidpoints(int a,int b,int c){
        int max,min,mid;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        mid=a+b+c-min-max;
        return (max+min)/2==mid;
    }
    //Exercise13
    public static boolean consecutive(int a, int b,int c){
        int max,min,middle;
        max=Math.max(a,Math.max(b,c));
        min=Math.min(a,Math.min(b,c));
        middle=a+b+c-max-min;
        return((max-1==middle)&&(middle-1==min));
    }
    //Exercise1
    public static void showTwos(int number){
        int input = number;
        String a = "";
        while(input%2==0){
            input = input/2;
            a =a+"2 * ";
        }
        System.out.println(number+" = "+a+input);       
    }
    //Exercise4
    public static void randomX(){
        System.out.println("Exercise4");
        Random r=new Random();
        int number=r.nextInt(16)+5;
        do{
            number=r.nextInt(16)+5;
            for(int i=1;i<=number;i++){
                System.out.print("x");
            }System.out.println();
        }while(number<16);
    }  
    //Exercise6
    public static void makeGuess(){
        System.out.println("Exercise6");
        Random r=new Random();
        int number=0;
        int sum=0;
        while(number<48){
            int guess=r.nextInt(50)+1;
            number=guess;
            System.out.println("guess = "+number);
            sum++;
        }
        System.out.println("total guesses = "+sum);
    }
    ////Exercise7
    public static void diceSum(Scanner console){
        System.out.println("Exercise7");
        System.out.print("Desired dice sum: ");
        int number=console.nextInt();
        Random r=new Random();
        int sum=0;
        while(sum!=number){
            int roll1=r.nextInt(6)+1;
            int roll2=r.nextInt(6)+1;
            sum=roll1+roll2;
            System.out.println(roll1+" and "+ roll2+" = "+sum);
        }    
    }
    //Exercise5
    public static void printLetter(){
        Random r = new Random();
        int r1,r2;
        char c;
        r1 = (int)(Math.random()*6)+5;
        for(int i=1;i<=r1;i++){
            r2 = (int)(Math.random()*80)+1;
            String a="";
            for(int j=1;j<=r2;j++){
                c=(char)((int)(Math.random()*26+97));
                a+=c;
            }
            System.out.println(a);
        }
    }
    //Exercise11
    public static void threeHeads(){
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
        Scanner console = new Scanner(System.in);
        double sum =0,count=0;
        System.out.print("Type a number:");
        int interger = console.nextInt();
        while(interger>=0)
        {
            sum = sum+interger;
            System.out.print("Type a number:");
            interger = console.nextInt();
            count++; 
        }
        if(count>0){
            System.out.println("Average was "+(sum/count));
        }
    }
    //Exercise18
    public static void digitSum(int number){
        int n = Math.abs(number);
        int sum = 0,digit;
        while(n>0){
            digit = n%10;
            sum = sum+digit;
            n = n/10;
        }
        System.out.println("the sum of "+number+" is "+ sum);
    }
}

