
public class CalendarData implements Comparable<CalendarData>
{
   private int year,month,day;
   public CalendarData(int month,int day,int year)
   {
       this.month = month;
       this.day  = day;
       this.year = year;
   }
   public int compareTo(CalendarData other)
   {
       if(year != other.year)
       {
           return year - other.year;
       }else
       {
           //check month
           if(month !=other.month)
           {
               return month - other.month;
           }else
           {
                   return day - other.day;              
           }
       }
   }
   public int getYear()
   {
       return year;
    }
   public int getMonth()
   {
       return month;
   }
   public int getDay()
   {
       return day;
   }
   public String toString()
   {
       return month+"/"+day+"/"+year;
   }
}
