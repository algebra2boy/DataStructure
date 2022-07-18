import java.util.*;
public class RomanNumbers
{
    public static void main(){
        printResult();
    }

    public static void printResult(){
        Scanner console = new Scanner(System.in);
        System.out.println("put a year between 1000 and 3000\n");
        System.out.print("What is the year:");
        int year = console.nextInt();
        while(year!=-1){
            String romanYears = getRoman(year);
            System.out.println("In Roman years:"+romanYears+"\n");
            System.out.print("What is the year:");
            year = console.nextInt();
        }
        if(year==-1){
            System.out.println("Thank you for playing with the Romans!!!\nGood Bye!!!");
        }
    }

    public static String getRoman(int year){
        int last_Digit = 0,count = 0;
        String first_Digit = "",second_Digit ="",third_Digit ="",fourth_Digit="",combination="";
        for(int i=1;i<=4;i++){
            last_Digit = year%10;
            count++;
            year = year/10;
            if(count ==1){
                fourth_Digit = getLastDigit(last_Digit);
            }else if(count ==2){
                third_Digit =getThirdDigit(last_Digit);
            }else if(count ==3){
                second_Digit = getSecondDigit(last_Digit);
            }else{
                first_Digit = getFirstDigit(last_Digit);
            }
            combination = first_Digit+second_Digit+third_Digit+fourth_Digit;
        }   
        return combination;
    }

    public static String getLastDigit(int number)
    {
        String a="",b="";
        if(number>=1&&number<=3){
            for(int i=1;i<=number;i++){
                a=a+"I";
            }
        }else if(number==4){
            a="IV";
        }else if(number>=5&&number<=8){
            b="V";
            for(int i=1;i<=number-5;i++){
                a=a+"I";
            }
            a=b+a;
        }else if(number==9){
            a="IX";
        }
        return a;
    } 

    public static String getThirdDigit(int number){
        String a="",b="";
        if(number>=1&&number<=3){
            for(int i=1;i<=number;i++){
                a=a+"X";
            }
        }else if(number==4){
            a="XL";
        }else if(number>=5&&number<=8){
            b="L";
            for(int i=1;i<=number-5;i++){
                a=a+"X";
            }
            a=b+a;
        }else if(number==9){
            a="XC";
        }
        return a;
    }

    public static String getSecondDigit(int number){
        String a="",b="";
        if(number>=1&&number<=3){
            for(int i=1;i<=number;i++){
                a=a+"C";
            }
        }else if(number==4){
            a="CD";
        }else if(number>=5&&number<=8){
            b="D";
            for(int i=1;i<=number-5;i++){
                a=a+"C";
            }
            a=b+a;
        }else if(number==9){
            a="CM";
        }
        return a;
    }

    public static String getFirstDigit(int number){
        String a="";
        for(int i=1;i<=number;i++){
            a=a+"M";
        }
        return a;
    }
}
