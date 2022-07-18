public class TimeSpan implements Comparable<TimeSpan>
{ 
    private int totalMinutes; 

    // -------------- Constructors ------------------
    public TimeSpan()
    {
        this(0,0);
    }
    // Constructs a time span with the given interval. 
    // pre: hours >= 0 && minutes >= 0 
    public TimeSpan(int hours, int minutes)
    { 
        totalMinutes = 0; 
        add(hours, minutes); 
    } 

    // Adds the given interval to this time span. 
    // pre: hours >= 0 && minutes >= 0 
    public void add(int hours, int minutes)
    { 
        if (hours < 0 || minutes < 0) { 
            throw new IllegalArgumentException(); 
        } 
        totalMinutes += 60 * hours + minutes; 
    } 

    // >>>>>>>>>>>>>>>>> YOU FILL IN THESE METHODS  <<<<<<<<<<<<<<<<<<<<<
    // Adds "span" amount of time to 'this' span object.
    public void add(TimeSpan span)
    {
        this.totalMinutes+=span.totalMinutes;      
    }
    
    // Subtracts "span" amount of time to 'this' span object.
    public void subtract(TimeSpan span)
    {
        //case 1: doesn't cross time zone
        if(this.totalMinutes-span.totalMinutes>0){
            this.totalMinutes-=span.totalMinutes;  
        }else{ //case 2: cross time zone
            this.totalMinutes = 1440-Math.abs(this.totalMinutes-span.totalMinutes);          
        }
    }    
    
    // Scales 'this' span by the given factor.  Basically, it multiplies 
    //   totalMinutes by factor.
    public void scale(int factor)
    {
        this.totalMinutes*= factor;
        if(this.totalMinutes>=1440){
            this.totalMinutes%=1440;
        }
    }

    // returns a String for this time span, such as "6h 15m" 
    public String toString() 
    { 
        return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m"; 
    } 

    public int getTotalMinutes(){
        return totalMinutes;
    }
    public boolean equals(Object that)
    {
        if(that instanceof TimeSpan)
        {
            TimeSpan other  = (TimeSpan) that;
            return this.totalMinutes == other.totalMinutes;
        }else
        {
            return false;
        }
    }
    public int compareTo(TimeSpan other)
    {
        return totalMinutes - other.totalMinutes;
    }
} 

