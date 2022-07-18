import java.util.*;
public class CalendarDate_Client
{
    public static void main()
    { 
        ArrayList<CalendarData> Date = new ArrayList<CalendarData>();
        Date.add(new CalendarData(4,9,2003));
        Date.add(new CalendarData(10,18,1977));
        Date.add(new CalendarData(4,24,2020));
        Date.add(new CalendarData(6,6,2020));
        Date.add(new CalendarData(12,31,2031));
        
        System.out.println("before sorting\t: "+Date);
        Collections.sort(Date);
        System.out.println("after sorting\t: "+Date);
    }
}
