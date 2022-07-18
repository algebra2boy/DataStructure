
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    private int year,month,day;
    public Date(){
        this(0,0,0);
    }
    public Date(int month,int day, int year){
        this.year = year;
        this.month = month;
        this.day = day;      
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return month+"/"+day+"/"+year+"";
    }
}
