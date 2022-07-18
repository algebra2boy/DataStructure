
public class Time
{
    public int hour, minutes;
    public Time(){
        this(0,0);
    }
    public Time(int hour,int minutes){
        this.hour = hour;
        this.minutes = minutes;        
    }
    public String toString(){
        int totalMinutes = hour*60+minutes;
        return totalMinutes/60+"h"+totalMinutes%60+"m";
    }
    public int getHour(){
        return hour;
    }
    public int getMinutes(){
        return minutes;
    }
}
