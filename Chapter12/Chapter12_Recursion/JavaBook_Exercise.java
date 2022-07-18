
public class JavaBook_Exercise
{
    public static void main()
    {
        starString(4);
        print(1);

        writeNums(12);
        print(2);

        for(int i=1;i<=10;i++){
            writeSequence(i);
            System.out.println();
        }
        print(3);

        writeBinary(100);
        print(5);

        for(int i=1;i<=10;i++){
            writeSquares(i);
            System.out.println("\twriteSquares("+i+")");
        }    
        print(6);

        for(int i=1;i<=8;i++){
            writeChars(i);
            System.out.println();
        }
        print(7);

        System.out.println("The product of the first 5 even numbers are "+
            multiplyEvens(5));
        print(8);

        System.out.println("The sum of the sum of the first 6 reciprocals = "+
            sumTo(6));
        print(9);

        System.out.println("How many digits they are match 111222 v. 1111223\ndigits = "+
            digitMatch(111222,1111223));
        print(10);

        System.out.println(repeat("HelloWorld",10));
        print(11);

        System.out.println("Is \"banana\",\"ananab\" are the same = "+
            isReverse("banana","ananab"));
        print(12);

        System.out.println("evenDigits (24456)--->"+evenDigits(24456));
        print(14);
        
        for(int i=1;i<=3;i++){
            waysToClimb(i);
        }
        print(18);

        for(int i=1;i<=5;i++){
            printBinary(i);
        }
        print(19);
    }

    public static int evenDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }else
        {
            if(n%2==0)//even
            {
                return (n%10)+10*evenDigits(n/10);
            }else
            {
                return evenDigits(n/10);
            }
        }

    }

    public static void waysToClimb(int n){
        process(n,0,"[");//start at 0 
    }

    private static void process(int destination,int start,String print){
        if(start==destination){//dead end
            System.out.println(print+"]");
        }else if(start<=destination){//not dead end
            process(destination,start+1,print+" 1");//for one step
            process(destination,start+2,print+" 2");//for two step
        }
    }

    public static void printBinary(int n){
        run(n,0,"[");
    }

    private static void run(int count,int start,String print){
        if(count==start){
            System.out.println(print+"]");
        }else if(start<=count){
            run(count,start+1,print+" 0");
            run(count,start+1,print+" 1");
        }
    }

    public static String repeat(String a, int t){
        if(t==0){
            return "";
        }
        if(t%2==0){
            return repeat(a+a,t/2);
        }
        return a+repeat(a,t-1);
    }

    public static void writeSquares(int n){
        if(n==1){
            System.out.print("1");
        }
        if(n==2){
            System.out.print("1"+" "+ 4);
        }
        if(n>2){
            if(n%2!=0){//odd start
                System.out.print(n*n+" ");
                writeSquares(n-2);
                System.out.print(" "+(n-1)*(n-1));
            }else{// even start
                System.out.print((n-1)*(n-1)+" ");
                writeSquares(n-2);
                System.out.print(" "+n*n);
            }
        }
    }

    public static void writeChars(int n){

        if(n==1){
            System.out.print("*");
        }
        if(n==2){
            System.out.print("**");
        }
        if(n>2){
            System.out.print("<");
            writeChars(n-2);
            System.out.print(">");
        }
    }

    public static void writeSequence(int n){
        if(n==1){
            System.out.print("1");
        }
        if(n==2){
            System.out.print("1"+" "+"1");
        }
        if(n>2){
            System.out.print((n+1)/2+" ");
            writeSequence(n-2);
            System.out.print(" "+(n+1)/2);
        }
    }

    public static int multiplyEvens(int n)
    {
        if(n<=0){
            throw new IllegalArgumentException();
        }    
        if(n==1){
            return 2;
        }      
        return 2*n*multiplyEvens(n-1);        
    }

    public static double sumTo(int n)
    {
        if(n<0){
            throw new IllegalArgumentException();
        }
        if(n==0){
            return 0.0;
        }
        return 1.0 / n+sumTo(n-1);
    }

    public static int digitMatch(long a,long b)
    {
        if(a==0||b==0)
        {
            return 0;
        }else
        {
            if(a%10==b%10){
                return 1+digitMatch(a/10,b/10);
            }else{
                return 0+digitMatch(a/10,b/10);
            }
        }
    }

    public static boolean isReverse(String a, String b)
    {
        if(a.length()==0){
            return true;
        }else{
            if(a.charAt(0)!=b.charAt(b.length()-1)){//when one character of each are not the same
                return false;
            }else{//keep searching, cut the first letter of a, and keep the every letter of b except the last character of b
                return isReverse(a.substring(1),b.substring(0,b.length()-1));
            }         
        }

    }

    public static void starString(int n)
    {
        int stars = (int)Math.pow(2,n);
        printStarString(stars);
    }

    public static void printStarString(int n)
    {
        if(n>0)
        {
            System.out.print("*");
            printStarString(n-1);
        }
    }

    public static void writeNums(int n)
    {
        if(n<0){
            throw new IllegalArgumentException();
        }
        if(n==0){
            System.out.print(n);
        }else{
            writeNums(n-1);
            System.out.print(","+n);
        }
    }

    public static void writeBinary(int n)
    {
        if(n==0){
            System.out.println();
        }else
        {
            writeBinary(n/2);
            if(n%2==0){
                System.out.print(0);
            }else{
                System.out.print(1);
            }
        }
    }

    public static void print(int a){
        System.out.println("\nThis is Exercise #"+a);
    }

}
