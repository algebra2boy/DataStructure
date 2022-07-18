// Rational:  Chap 8
//             - BuildingJavaPrograms 3rd Edition Programming Problem #1
//             - Deitel Book Chap 8.3

// YOUR TASK:
//      Write ALL of the methods below.

// Get rid of the word "SHELL"
import java.util.*;
public class Rational
{ 
    private int nums;
    private int deno;

    public Rational()
    {
        this(1,1);
    }
    // initialize numerator part to n and denominator part to d
    public Rational( int n, int d )
    {   
        if(d == 0){
            throw new IllegalArgumentException("Denominator can't be zero");
        }
        this.nums = n;
        this.deno = d;
    }

    // Use GET and SET methods!
    // Set the numerator
    public void setNumerator(int n)
    {
        nums = n;
    }
    // Set the denominator
    public void setDenominator(int d)
    {
        deno = d;
    }

    // Get the numerator
    public int getNumerator()
    {
        return nums;
    }
    // Get the denominator
    public int getDenominator()
    {
        return deno;
    }   
    // add two Rational numbers
    public Rational add(Rational that)
    {
        int Final_nums = this.nums * that.deno +this.deno * that.nums;
        int Final_deno = this.deno * that.deno;
        Rational rational = new Rational(Final_nums,Final_deno);
        rational.reduce();
        return rational;
    }

    // subtract two Rational numbers
    public Rational subtract( Rational that )
    {
        int Final_nums = this.nums * that.deno -this.deno * that.nums;
        int Final_deno = this.deno * that.deno;
        Rational rational = new Rational(Final_nums,Final_deno);
        rational.reduce();
        return rational;
    }

    // multiply two Rational numbers
    public Rational multiply( Rational that )
    {
        int Final_nums = this.nums * that.nums;
        int Final_deno = this.deno * that.deno;
        Rational rational = new Rational(Final_nums,Final_deno);
        rational.reduce();
        return rational;
    }

    
    // divide two Rational numbers
    public Rational divide( Rational that )
    {
    int Final_nums = this.nums * that.deno;
    int Final_deno = this.deno * that.nums;
    Rational rational = new Rational(Final_nums,Final_deno);
    rational.reduce();
    return rational;
    }
  
    // reduce the fraction
    private void reduce()  // BONUS!!!
    {
      /* 
      int pos = 0;
      ArrayList<Integer> al = new ArrayList<>();
      //Create a arraylist to store all the variable of numerator
      for(int i=2;i<=Math.abs(nums);i++){
        if(nums%i==0){
         al.add(i);
        }
      }
      while(pos<al.size()){
        if((nums%al.get(pos)==0)&&deno%al.get(pos)==0){
          nums/=al.get(pos);
          deno/=al.get(pos);
          pos = -1;

          al.clear();
          for(int i=2;i<=Math.abs(nums);i++){
        if(nums%i==0){
         al.add(i);
        }
        }
        }
        pos++;
      }*/ 
      // this method is much better combined looking for factors 
      for(int factors = Math.abs(nums);factors>=2;factors--){
        if(nums%factors==0&&deno%factors==0){
          nums/=factors;
          deno/=factors;
        }
      }


    }
     
    // return String representation of a Rational number
    public String toString()
    {
        return "("+nums+"/"+deno+")";
     }

    // return floating-point String representation of
    // a Rational number
    public String toFloatString()
    {
        return (double)nums/deno+"";
    }
}
/*
// return greaterThan, lessThan, or equalTo
public boolean greaterThan(Rational right)
{
// >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
}

public boolean lessThan(Rational right)
{
// >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
}   

public boolean equalTo(Rational right)
{
// >>>>>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<<<<<<<<<<
}   
}  // Rational

// =====================================================
// Rational:  Chap 8
//             - BuildingJavaPrograms 3rd Edition Programming Problem #1
//             - Deitel Book Chap 8.3

/*
NOTE: 
(1) You will have to return a Rational from each method, because neither r1 nor r2
should change when you add them together, or so.  Instead, another Rational is
created and returned to 'result'.
(2) The call to "toString()" is NOT really needed. It gets called implicitly,
anyway, remember!!
(3) You can NOT divide by 0!  Make sure that this does NOT happen!!
(4) ALL rationals MUST be in lowest terms!
(5) Improper fractions are OK!

OUTPUT:      
1/2 + 3/4 = 5/4 OR as a decimal: 1.25

1/2 - 3/4 = -2/8 OR as a decimal: -0.25

1/2 * 3/4 = 3/8 OR as a decimal: 0.375

1/2 / 3/4 = 2/3 
OR as a decimal: 0.6666666666666666

ArrayList 'rationals': [1/2, 3/4, 5/4, -2/8, 3/8, 2/3]
r.toString() = 1/2  r.toFloatString() = 0.5
r.toString() = 3/4  r.toFloatString() = 0.75
r.toString() = 5/4  r.toFloatString() = 1.25
r.toString() = -2/8  r.toFloatString() = -0.25
r.toString() = 3/8  r.toFloatString() = 0.375
r.toString() = 2/3  r.toFloatString() = 0.6666666666666666

largest rational = 5/4
smallest rational = -2/8

Are any Rationals equalTo each other = false        
 */

// Java extension packages


