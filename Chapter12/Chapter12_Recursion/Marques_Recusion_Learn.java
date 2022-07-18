
public class Marques_Recusion_Learn
{
    public static void main(){
        countDownRecursively(5);//#1
        print(1);
        countUpRecursively(7);//#2
        print(2);
        printStrinRecursively("Hello");
        fractionCountUpRecusively(5);//#3
        print(3);
        printEvenNums(5);//#4
        print(4);
        printOddNums(5);//#5
        print(5);
        print10sRecursively(6);//#6
        print(6);
        printLettersRecursively(7);//#7
        print(7);
        printLettersRecursivelyStartEnd(5,10);//#8
        print(8);
        printParenthesesRecursively(5);
        print(9);
        printRepetitiveNumber(3,6);//#10
        print(10);
        printTriangleRecursively(4);//#11
        print(11);

        System.out.println("How many digits in 1234567 = "+
            numberOfDigitsRecursively(1234567));//#12
        print(12);

        System.out.println("is all digits are even in 2468 = "+ 
            areDigitsAllEvenRecursively(2468));
        print(13);//#13

        System.out.println("How many 0 in 7800000 = "+
            countNumber_Of_Ks_Recursively(7800000,0));//#14
        print(14);

        System.out.println("12345's backward is");//#15
        printNumbersBackward(12345);
        print(15);

        System.out.println("76532's backward is "+reverseNumRecursively(76532));
        print(16);//#16

        System.out.println("3^4 = "+  //#17
            powerRecursively(5,4));
        print(17);

        System.out.println("is 1234321 palindrome "+ 
            isPalindrome(1234321));
        print(18);

        System.out.print("is true that 897557 has 1 ="+ //#19
            hasDigit(897557,1));
        print(19);

        System.out.println("are all digits decreasing (9275543) = " +areDigitsDecresing(9275543));
        print(20);//#20
    }

    public static boolean isPalindrome(int n){
        if(n==0){
            return true;
        }else{
            int first = n, count = 0;
            while(first>10){
                first/=10;
                count++;
            }
            if(n%10==first){
                n-=first*(int)Math.pow(10,count);
                return isPalindrome(n/10);
            }else{
                return false;
            }
        }
    }

    public static boolean areDigitsDecresing(int n){
        if(n<10){
            return true;
        }else{
            if((n%100/10)>n%10){
                return areDigitsDecresing(n/10);
            }else{
                return false;
            }
        }
    }

    public static int reverseNumRecursively(int n)
    {
        if(n==0)
        {
            return 0;
        }else
        {
            int count = 0, num = n;
            while(num>0)
            {               
                count++;
                num/=10;
            }
            return n%10*(int)Math.pow(10,count-1)+reverseNumRecursively(n/10);
        }
    }

    public static boolean areDigitsAllEvenRecursively(long n)
    {
        if(n==0)// base case if all the number is even  
        {
            return true; 
        }else
        {
            if(n%2==0){// if the remainder is even, then keep going to see others are even too
                return areDigitsAllEvenRecursively(n/10);
            }
            else{// if it is odd immediately return false 
                return false;
            }
        }
    }

    public static boolean hasDigit(long n ,int k)
    {
        if(n==0)// base case
        {
            return false;
        }else
        {
            if(n%10!=k){// if the remainder isn't k keep researching
                return hasDigit(n/10,k);
            }
            else{// if it is k, return true
                return true;
            }
        }
    }

    public static int powerRecursively(int base,int p)
    {
        if(p==0)
        {
            return 1;           
        }else{
            return base*powerRecursively(base,p-1);
        }
    }

    public static void printNumbersBackward(int n)
    {
        if(n==0){
            System.out.println();
        }else
        {
            System.out.print(n%10);
            printNumbersBackward(n/10);
        }
    }

    public static int countNumber_Of_Ks_Recursively(long n,int k)
    {
        if(n==0)//base case
        {
            return 0;
        }else           
        {
            if(n%10==k)//when the remainder is k return 1
            {
                return 1+countNumber_Of_Ks_Recursively(n/10,k);
            }//when the reminder isn't k return 0

            return countNumber_Of_Ks_Recursively(n/10,k);

        }
    }

    public static int numberOfDigitsRecursively(long n)
    {   
        if(n==0)//base case
        {
            return 0;
        }else{
            return 1+numberOfDigitsRecursively(n/10);
        }
    }

    public static void printTriangleRecursively(int n)
    {
        if(n>0){
            printTriangleRecursively(n-1);
            printTriangleRowRecursively(n);
            System.out.println();
        }
    }

    public static void printTriangleRowRecursively(int n){
        if(n>0){
            System.out.print("*");
            printTriangleRowRecursively(n-1);
        }
    }

    public static void countDownRecursively(int n){
        if(n==1){
            System.out.print(n);
        }else{
            System.out.print(n+",");
            countDownRecursively(n-1);
        }
    }

    public static void countUpRecursively(int n){
        if(n==1){
            System.out.print(n);
        }else{
            countUpRecursively(n-1);
            System.out.print(","+n);
        }
    }

    public static void printStrinRecursively(String s){
        if(s.length()>0){//s==null
            printStrinRecursively(s.substring(1));
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(0));
        }else{
            System.out.println("\n");
        }
    }

    public static void fractionCountUpRecusively(int n){
        if(n>1){
            fractionCountUpRecusively(n-1);
            System.out.print(1+"/"+n+" ");
        }else{
            System.out.println("\n");
        }
    }

    public static void printEvenNums(int n){
        if(n==0){
            System.out.println("\n");
        }else{           
            printEvenNums(n-1);
            System.out.print(2*n+" ");
        }
    }

    public static void printOddNums(int n){
        if(n==0){
            System.out.println("\n");
        }else{
            printOddNums(n-1);
            System.out.print(2*n-1+" ");
        }
    }

    public static void print10sRecursively(int n){
        if(n>=0){
            print10sRecursively(n-1);
            System.out.print((int)Math.pow(10,n)+" ");
        }else{
            System.out.println("\n");
        }
    }

    public static void printLettersRecursively(int n)
    {
        if(n>0){
            printLettersRecursively(n-1);
            System.out.print((char)(97+(n-1))+" ");
        }else{
            System.out.println("\n");
        }
    }

    public static void printLettersRecursivelyStartEnd(int start,int end)
    {
        if(start<=end){
            System.out.print(((char)(97+(start-1)))+" ");
            printLettersRecursivelyStartEnd(start+1,end);
        }else{
            System.out.println();
        }
    }

    public static void printRepetitiveNumber(int t,int n)
    {
        if(n>=1){
            System.out.print(t);
            printRepetitiveNumber(t,n-1);
        }else{
            System.out.println();
        }
    }

    public static void printParenthesesRecursively(int n)
    {
        if(n>=1){
            System.out.print("(");
            printParenthesesRecursively(n-1);
            System.out.print(")");
        }
    }

    public static void print(int a){
        System.out.println("\nThis is Exercise #"+a+"\n");
    }
}
