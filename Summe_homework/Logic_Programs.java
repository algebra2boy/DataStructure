import java.util.*;
public class Logic_Programs
{
    public static void main()
    {
        Temperature();//#1
        System.out.println("Problem#1\n");
        quadratic_Equation(1,0,-4);//#2
        System.out.println("Problem#2\n");
        gravity();//#3
        System.out.println("Problem#3\n");
        talk_Phone();//#4
        System.out.println("Problem#4\n");
        triangle(3,3,3);//#5
        System.out.println("Problem#5\n");
        Fraction(4,5,3,7);//#6
        System.out.println("Problem#6\n");
        slope(3,5,7,8);//#7
        System.out.println("Problem#7\n");
        biggest_Smallest(8,90,100,2,-9);//#8
        System.out.println("Problem#8\n");
        grade(78,66,86,92,77);//#9
        System.out.println("Problem#9\n");
        answer_Remainder(7,3);//#10
        System.out.println("Problem#10\n");
        Scientific_notation(987654);//#11
        System.out.println("Problem#11\n");
        number_Of_Digit(12324322,2);//#12
        System.out.println("Problem#12\n");
        great_Less(99999222,5);//#13
        System.out.println("Problem#13\n");
        even_Digit(22456);//#14
        System.out.println("Problem#14\n");
        tell_digit(844416666);//#15
        System.out.println("Problem#15\n");
        palindrome(98711789);//#16
        System.out.println("Problem#16\n");
        reverse(987654321);//#17
        System.out.println("Problem#17\n");
        decimal_Value("100011");//#18
        System.out.println("Problem#18\n");
        HEX_Value("10011101");//#19
        System.out.println("Problem#19\n");
        born(5,23,1983);//#20
        System.out.println("Problem#20\n");
        FirstFactorOfNumber(77);//#21
        System.out.println("Problem#21\n");
        prime_Number(20);//#22
        System.out.println("Problem#22\n");
        perfect(12);//#23
        System.out.println("Problem#23\n");
        starCount(2,18);//#24
        System.out.println("Problem#24\n");
        rowCount(5);//#25
    }

    public static void Temperature()//#1
    {
        fahrenheit_To_Celsius(212);
        celsius_To_Fahrenheit(100);
    }

    public static void fahrenheit_To_Celsius(double Temperature)
    {
        double Celsius = (Temperature-32)/1.8;
        System.out.println("Fahrenheit = "+Temperature+"\tCelsius = "+Celsius);
    }

    public static void celsius_To_Fahrenheit(double Temperature)
    {
        double Fahrenhit = Temperature*1.8+32;    
        System.out.println("Celsius = "+Temperature+"\tFahrenhit = "+Fahrenhit);
    }

    public static void quadratic_Equation(double a,double b, double c)//#2
    {
        double discriminant = Math.pow(b,2)-4*a*c;
        String root =" ";
        String Answer=" ";
        double root1 = (-b +Math.pow((b*b-4*a*c),0.5))/(2*a);
        double root2 = (-b -Math.pow((b*b-4*a*c),0.5))/(2*a);
        System.out.println("a: "+a+" b: "+b+" c: "+c);
        if(discriminant>0)
        {
            root="2";
            Answer = "x= "+root1+" x= "+root2;
        }else if(discriminant==0)
        {
            root="1";
            Answer = "x= "+root2;
        }else
        {
            root="0";
            Answer="N/A";
        }
        System.out.println("Number of roots:"+root+"\nRoots: "+Answer);
    } 

    public static void gravity()//#3
    {
        System.out.println("1=Mercury\n2=Venus\n3=Earth\n4=Mars\n5=Jupiter\n6=Saturn\n7=Uranus\n8=Neptune\n9=Pluto");
        Scanner console = new Scanner (System.in);
        System.out.print("Earth weight =");
        double weight = console.nextDouble();
        System.out.print("Plan Selection = ");
        String planet= console.next();
        String a=" ";
        if(planet.equals("1"))
        {
            weight=weight*0.38;
            a="Mercury";
        }else if(planet.equals("2")){
            weight=weight*0.78;
            a="Venus";
        }else if(planet.equals("3")){
            weight=weight*1.00;  
            a="Earth";
        }else if(planet.equals("4")){
            weight=weight*0.39;
            a="Mars";
        }else if(planet.equals("5")){
            weight=weight*2.65; 
            a="Jupiter";
        }else if(planet.equals("6")){
            weight=weight*1.17; 
            a="Saturn";
        }else if(planet.equals("7")){
            weight=weight*1.05;
            a="Uranus";
        }else if(planet.equals("8")){
            weight=weight*1.23; 
            a="Neptune";
        }else if(planet.equals("9")){
            weight=weight*0.05; 
            a="Pluto";
        }else{
            weight=0.0;
            a="the planet doesn't exist in our solar system";
        }
        System.out.println(a+":"+weight+" lbs");
    }

    public static void talk_Phone(){//#4
        Scanner console = new Scanner(System.in);
        System.out.print("Talk time:");
        int minutes = console.nextInt();
        double money=0;
        if(minutes<=3){
            money=1.25*minutes;
        }else if((minutes>3)&&(minutes<=6)){
            money=1.25*3+1.5*(minutes-3);
        }else if((minutes>6)&&(minutes<=9)){
            money=(1.25+1.5)*3+1.75*(minutes-6);
        }else if(minutes>=10){
            money=(1.25+1.5+1.75)*3+2*(minutes-9);
        }
        System.out.println("Cost =$"+money);
    }

    public static void triangle(int a, int b, int c)//#5
    {
        String result =" ";
        if((a==b)&&(a==c)&&(b==c))
        {
            result = "Equilateral";
        }else if((a!=b)&&(a!=c)&&(b!=c)){
            result = "Scalene";
        }else if((a==b)||(a==c)||(b==c)){
            result = "Isosceles";
        }
        System.out.println("s1="+a+" s2="+b+" s3="+c+"\nOutput:"+result);
    }

    public static void Fraction(int n1,int d1,int n2,int d2)//#6
    {
        int new_cd,new_n1,new_n2;//common denominator
        int Add_numerator,subtract_numerator,mulptily_numerator;
        int division_denominator,mulptily_denominator,division_numerator;
        System.out.println("Fraction1("+n1+"/"+d1+"):"+"n1="+n1+" d1="+d1+"\nFraction2("+n2+"/"+d2+"):"+"n2="+n2+" d2="+d2);
        if(d1==d2)
        {
            new_cd=d1;
            Add_numerator=n1+n2;
            subtract_numerator=n1-n2;
        }else{// if(d1!=d2)
            new_cd=d1*d2;
            new_n1=n1*d2;
            new_n2=n2*d1;
            Add_numerator=new_n1+new_n2;
            subtract_numerator=new_n1-new_n2;
        }
        mulptily_numerator=n1*n2;
        mulptily_denominator=d1*d2;
        division_numerator=n1*d2;
        division_denominator=n2*d1;
        System.out.println("Add:"+Add_numerator+"/"+new_cd);
        System.out.println("Subtract:"+subtract_numerator+"/"+new_cd);
        System.out.println("Multiply:"+mulptily_numerator+"/"+mulptily_denominator);
        System.out.println("Divide:"+division_numerator+"/"+division_denominator);
    }    

    public static void slope(int x1,int y1,int x2,int y2)//#7
    {
        System.out.println("x1="+x1+" y1="+y1+" x2="+x2+" y2="+y2);
        if(x1==x2){
            System.out.println("Slope = NOT POSSIBLE/NO SLOPE!");
        }else if(x1-x2<0&&y1-y2<0){ //if numerator and denominator are negative
            System.out.println("Slope = "+Math.abs(y1-y2)+"/"+Math.abs(x1-x2));
        }else{
            System.out.println("Slope = "+(y1-y2)+"/"+(x1-x2));
        }
    }

    public static void biggest_Smallest(int n1,int n2,int n3,int n4,int n5)//#8
    {
        int smallest,biggest;
        if(n1<n2&&n1<n3&&n1<n4&&n1<n5){
            smallest=n1;
        }else if(n2<n3&&n2<n4&&n2<n5){
            smallest=n2;
        }else if(n3<n4&&n3<n5){
            smallest=n3;
        }else if(n4<n5){
            smallest=n4;
        }else{
            smallest=n5;
        }
        if(n1>n2&&n1>n3&&n1>n4&&n1>n5){
            biggest=n1;
        }else if(n2>n3&&n2>n4&&n2>n5){
            biggest=n2;
        }else if(n3>n4&&n3>n5){
            biggest=n3;
        }else if(n4>n5){
            biggest=n4;
        }else{
            biggest=n5;
        }
        System.out.println("n1="+n1+" n2="+n2+" n3="+n3+" n4="+n4+" n5="+n5);
        System.out.println("smallest="+smallest+" biggest="+biggest);
    }

    public static void grade(int n1,int n2,int n3,int n4,int n5)//#9
    {
        int smallest;
        if(n1<n2&&n1<n3&&n1<n4&&n1<n5){
            smallest=n1;
        }else if(n2<n3&&n2<n4&&n2<n5){
            smallest=n2;
        }else if(n3<n4&&n3<n5){
            smallest=n3;
        }else if(n4<n5){
            smallest=n4;
        }else{
            smallest=n5;
        }
        System.out.println("grade1="+n1+" grade2="+n2+" grade3="+n3+" grade4="+n4+" grade5="+n5);
        System.out.println("Average of the 4 highest is:"+(((n1+n2+n3+n4+n5)-smallest)/4.0));    
    }
    //#10
    public static void answer_Remainder(int n1,int n2)
    {
        int biggest=n1,smallest=n1;
        if(n1>n2){
            biggest=n1;
            smallest=n2;
        }else{
            biggest=n2;
            smallest=n1;
        }
        System.out.println("n1="+n1+" n2="+n2+"\nOutput:"+biggest/smallest+" R "+biggest%smallest);

    }

    public static void Scientific_notation(double num)//#11
    {
        double number=num;int count=0;
        if(num>1)
        {
            while(num>10)
            {
                num=num/10;
                count++;
            }
            number=number/Math.pow(10,count);
        }
        else if(num>0&&num<1){
            while(num<1)
            {
                num=num*10;
                count++;
            }
            number=number*Math.pow(10,count);
            count=-(count);
        }
        System.out.println(number+"x10^"+count);
    }

    public static void number_Of_Digit(int num,int k){//#12
        String a=""+num;
        String b=""+k;
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(0)){
                count++;
            }
        }
        System.out.println("number="+num+"\n"+k+" appears "+count+" times");
    }

    /*public static void number_Of_Digit(int num,int k){//#12
    int count=0;
    int number=num;
    while(number>0)
    {
    int last_Digit=number%10;
    number=number/10;
    if(last_Digit==k)
    {
    count++;
    }
    }
    System.out.println(k+" appears "+count+" times");
    }*/
    public static void great_Less(int num,int k){//#13
        String a=""+num;
        String b=""+k;
        int great=0;
        int less=0;
        System.out.println("k="+k);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>b.charAt(0)){
                great++;
            }
            if(a.charAt(i)<b.charAt(0)){
                less++;
            }
        }
        System.out.println("number="+num+"\n"+great+" numbers"+">k"+"\t"+less+" numbers<k");;
    }

    /*public static void great_Less(int num,int k){//#13
    int great=0,less=0;
    int number=num;
    while(number>0)
    {
    int last_Digit=number%10;
    number=number/10;
    if(last_Digit>k)
    {
    great++;
    }else{
    less++;
    }
    }
    System.out.println(less+" numbers<k "+great+" numbers>k");
    }*/
    public static void even_Digit(int number){//#14
        String a=""+number;
        int count=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            int result=(int)ch;
            if(result%2==0){
                count++;
            }
        }
        System.out.println("number="+number+"\neven digit count="+count);
    }

    /*public static void even_Digit(int num){//#14
    int number=num;
    int count=0;
    while(number>0)
    {
    int last_Digit=number%10;
    number=number/10;
    if(last_Digit%2==0){
    count++;
    }
    }
    System.out.println("number="+num+"\neven digit count="+count);
    }*/
    public static void tell_digit(int number){//#15
        String a=""+number;
        String b="";
        int count=0;
        System.out.println("number:"+number+"\nto tell if ALl of the digits are even");
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            int result=(int)ch;
            if(result%2==0){
                count++;
            }
        }
        if(count==a.length()){
            b="True";
        }else{
            b="False";
        } 
        System.out.println("Output:"+b);
    }

    /*public static void tell_digit(int num){//#15
    int number=num,count_digits=0,count_even=0;
    String a="";
    System.out.println("number:"+number+"\nto tell if ALl of the digits are even");
    while(number>0)
    {
    int last_digit=number%10;
    number=number/10;
    count_digits++;
    if(last_digit%2==0)
    {
    count_even++;
    }
    }
    if(count_digits==count_even)
    {
    a="True";
    }else{
    a="False";
    }
    System.out.println("Output:"+a);
    }*/
    public static void palindrome(int number){//#16
        String a=""+number;
        boolean judge=false;
        String b="";
        int count=0;
        System.out.println("number:"+number+"\nto tell whether it's a palindrome or not");
        for(int i=0;i<(a.length())/2;i++){
            if(a.charAt(i)==a.charAt((a.length()-1)-i)){
                judge=true;
            }
        }
        if(judge==true){
            b="Yes";
        }else if(judge==false){
            b="No";
        }
        System.out.println(b);
    }

    public static void reverse(int number)//#17
    {
        String a=""+number;
        String b="";
        System.out.println("Original:"+number);
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            b=ch+b;
        }
        System.out.println("After reverse:"+b);
    }

    public static void decimal_Value(String a){//#18
        int sum=0;
        int value=1;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='0'){
                sum=sum;
            }else if(a.charAt(i)=='1'){
                sum=sum+value;
            }
            value=value*2;
        }
        System.out.println("number:"+a+"="+sum);
    }

    public static void HEX_Value(String a)//#19
    {
        System.out.println("number="+a);
        String First_Four=a.substring(0,4);
        String Second_Four=a.substring(4,a.length());
        String First_Decimal=converted_decimal(First_Four);
        String Second_Decimal=converted_decimal(Second_Four);
        System.out.println(First_Four+"="+First_Decimal+"\n"+Second_Four+"="+Second_Decimal);
        System.out.println("HEX_value="+First_Decimal+Second_Decimal);      
    }

    public static String converted_decimal(String a)
    {
        int sum=0;
        int value=1;
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='0'){
                sum=sum;
            }else if(a.charAt(i)=='1'){
                sum=sum+value;
            }
            value=value*2;
        }
        if(sum<=9){
            b=""+sum;
        }else if(sum==10){
            b="A";
        }else if(sum==11){
            b="B";
        }else if(sum==12){
            b="C";
        }else if(sum==13){
            b="D";
        }else if(sum==14){
            b="E";
        }else{
            b="F";
        }
        return b;
    }

    public static void born(int Month,int Day,int Year)//#20
    {
        int last_two_digit=(Year%1000)%100;
        int total=last_two_digit/4;
        total=total+last_two_digit;
        total=total+Day;
        int number;
        if(Month==1){
            number=1;
        }else if(Month==2){
            number=4;
        }else if(Month==3){
            number=4;   
        }else if(Month==4){
            number=0; 
        }else if(Month==5){
            number=2;
        }else if(Month==6){
            number=5;    
        }else if(Month==7){
            number=0;    
        }else if(Month==8){
            number=3;   
        }else if(Month==9){
            number=6;    
        }else if(Month==10){
            number=1; 
        }else if(Month==11){
            number=4;    
        }else{
            number=6;   
        }
        total=total+number;
        //leap year is every 4 years include every 400 years, but not include every 100 years
        //only satifised leap year or January or February
        //if we statifised 4 year or 400 year, but without 100 year, 2000 year is a speical case
        if(((Year%4==0||Year%400==0)&&Year%100!=0)&&(Month==1||Month==2)){
            total=total-1;    
        }
        String a="";
        int remainder=total%7;
        if(remainder==1){
            a="Sunday";
        }else if(remainder==2){
            a="Monday";
        }else if(remainder==3){
            a="Tuesday";
        }else if(remainder==4){
            a="Wednesday";
        }else if(remainder==5){
            a="Thursday";
        }else if(remainder==6){
            a="Friday";
        }else if(remainder==0){
            a="Saturday";
        }
        System.out.println("So "+Month+"/"+Day+"/"+Year+" was on a "+a+"("+remainder+")");
    }

    public static void FirstFactorOfNumber(int number)//#21
    {
        System.out.println("number="+number+"  ");
        int count=0;
        String a="";
        String factor="";
        for(int i=1;i<=number;i++){
            if(number%i==0)
            {
                count++;
                if(count==2){
                    factor=""+i;
                }
            }
        }
        if(count==2||count==1){
            a="Yes!";
        }else if(count>2){
            a="No,factor="+factor;
        }
        System.out.println(a);
    }

    public static void prime_Number(int num)//#22
    {
        System.out.println("number:"+num+"\nPrime Number:");
        for(int i=1;i<=num;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }   
            if(count==2||count==1){
                System.out.print(i+",");
            }
        }
        System.out.println();
    }

    /*public static void prime_number_method2(int num)
    {
    for(int i=1;i<=num;i++)
    {
    //I found that the sum of factors of a prime number=number+1
    //ex.the factor of 7 is 1 and 7,(1+7)factor=7+1(number+1)
    int sum=0;
    for(int j=1;j<=i;j++){
    if(i%j==0){
    sum=sum+j;
    }
    }   
    if(sum==i+1||sum==1){
    System.out.print(i+",");
    }
    }
    }*/
    public static void perfect(int num)//#23
    {
        int sum=0;
        String a="";
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            a=sum+"="+num+" so Perfect!";
        }else if(sum>num){
            a=sum+">"+num+" so abundant!";
        }else if(sum<num){
            a=sum+"<"+num+" so deficient!";
        }
        System.out.println("sum="+sum+" num="+num);
        System.out.println(a);
    }

    public static void starCount(int starCount,int rowCount)//#24
    {
        for(int i=1;i<=rowCount;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=starCount;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rowCount(int rowCount){//#25
        Pro_a(rowCount);
        System.out.println("Problem#25a\n");
        Pro_b(rowCount);
        System.out.println("Problem#25b\n");
        Pro_c(rowCount);
        System.out.println("Problem#25c\n");
    }

    public static void Pro_a(int rowCount){//#25a
        for(int i=1;i<=rowCount;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Pro_b(int rowCount){//#25b
        for(int i=1;i<=rowCount;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Pro_c(int rowCount){//#25c
        for(int i=1;i<=rowCount;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=11-2*i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
