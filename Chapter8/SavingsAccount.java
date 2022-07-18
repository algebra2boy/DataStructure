/*
 * Deitel Java: #8.16 SavingsAccount
 */

import java.text.NumberFormat;
import java.util.Locale;

public class SavingsAccount  // take out the word "Shell"
{
private String myFirstName;
private String myLastName;
private final String mySSnum;        // Social Security #  - Answer these 3 questions: (1) Why is mySSnum a String?  
private double mySavingsBalance;     //                   (2) Why is it declared final? (3) Why doesn't it have to be initialized now?
 // >> Create a variable with the following:
 //             (1) Name it "myAnnualInterestRate"
 //             (2) Make it private
 //             (3) Make it of type 'double'
 //             (4) Make it be 'static' so that: 
 //                     "No body owns it. The Class actually owns it and All instances of the class share it
 //                      and even the class itself can see it."
private static double myAnnualInterestRate;
private Date myBirthDate;
private Date myStartDate;

    // ------------------------- Constructors --------------------------
    public SavingsAccount()
    {
        this("","","",0,0,0,0,0,0,0.0);
        
            myFirstName = myLastName = "";
            //mySSnum="";
            myBirthDate = new Date(0,0,0);
            myStartDate = new Date(0,0,0);        
            mySavingsBalance=0;
         
        myAnnualInterestRate = 0.0;
    }
    public SavingsAccount(String firstName, String lastName,String ss,
                          int bMonth,int bDay, int bYear,int sMonth, int sDay, int sYear, double sb)
    {  
          myFirstName = firstName; myLastName = lastName; mySSnum = ss;
          myBirthDate = new Date(bMonth,bDay,bYear);
          myStartDate = new Date(sMonth,sDay,sYear);
          mySavingsBalance = sb;
    }
    // ---------------------------------------------------------------------
    public void calculateMonthlyInterest()
    {
         mySavingsBalance = mySavingsBalance*(1+myAnnualInterestRate/12);
    }
    // ---------------------------------------------------------------------
    public static void modifyInterestRate(double apr) // (1) WHY is this method "static"? (2)Take out "static" and what happens?
    {
           myAnnualInterestRate = apr;
    }
    // ---------------------------------------------------------------------
    public static double getAnnualInterestRate() // (1) WHY is this method "static"? (2)Take out "static" and what happens?
    {
          return myAnnualInterestRate;
    }
    // ---------------------------------------------------------------------
    public double getSavingsBalance()
    {
          return mySavingsBalance;
    }    
    // ---------------------------------------------------------------------    
    public String printBalance()
    {
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);                      

           return moneyFormat.format(mySavingsBalance)+"\n";           
    }
    // ---------------------------------------------------------------------    
    public String toString()
    {  
          return "Name: "+ myFirstName+" "+myLastName+"\nSocial Security: "
          +mySSnum+"\nBirth Date:"+myBirthDate+"\n Start Data:"+myStartDate+"\nSavings Balance"+mySavingsBalance
          +"\nAnnual Interest Rate: "+myAnnualInterestRate;
    }
    
}

// ======================================================================================

/**
 * Mr Marques
 * 
 * Deitel: #8.16 SavingsAccountTest ... the CLIENT
 * 10/15/04
 * 
 * 

 Your expected output is as follows:

========================= Person 1 ================================
Output montly balances for one year at 0.03
 Name: Robert Smith
 Social Security: 012-34-5678
 Birth Date: 5/18/1986
 Start Date: 2/12/2004
 Savings Balance: $2,000.00
 Annual Interest Rate: 0.03

 -- Balance for one year --
   Month 1: 2005.0
   Month 2: 2010.0125
   Month 3: 2015.03753125
   Month 4: 2020.075125078125
   Month 5: 2025.1253128908204
   Month 6: 2030.1881261730475
   Month 7: 2035.26359648848
   Month 8: 2040.3517554797013
   Month 9: 2045.4526348684005
   Month 10: 2050.5662664555716
   Month 11: 2055.6926821217107
   Month 12: 2060.831913827015

After setting interest rate to 0.04 & 
 calculating another month: $2,067.70



========================= Person 2 ================================
Output montly balances for one year at 0.03
 Name: Mary Jones
 Social Security: 987-65-4321
 Birth Date: 3/17/1987
 Start Date: 7/28/2004
 Savings Balance: $3,000.00
 Annual Interest Rate: 0.03

 -- Balance for one year --
   Month 1: 3007.5
   Month 2: 3015.01875
   Month 3: 3022.556296875
   Month 4: 3030.1126876171875
   Month 5: 3037.6879693362303
   Month 6: 3045.2821892595707
   Month 7: 3052.8953947327195
   Month 8: 3060.5276332195513
   Month 9: 3068.1789523026
   Month 10: 3075.8493996833563
   Month 11: 3083.5390231825645
   Month 12: 3091.2478707405207

After setting interest rate to 0.04 & 
 calculating another month: $3,101.55
 
 */
