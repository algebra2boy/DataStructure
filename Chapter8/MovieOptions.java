public class MovieOptions
{
    private String name;
    private double minutes,price;
    private int count;
    private Time time;
    //Constructors
    public MovieOptions(){
        this("",0,0,0,new Time());
    }
    public MovieOptions(String name,double minutes,double price,int count,Time t){
        this.name = name;
        this.minutes = minutes;
        this.price = price;
        this.count = count;
        time = new Time(t.getHour(),t.getMinutes());
    }
    
    //Accessors
    public String getName(){
        return name;
    }
    public double getMinutes(){
        return minutes;
    }
    public double getPrice(){
        return price;
    }
    public int getCount(){
        return count;
    }
    public Time getTime(){
        return time;
    }
    public void addTime(Time other){
        time.hour+=other.hour;
        time.minutes+=other.minutes; 
    }
    public String toString(){
        return "name:"+name+"\tminutes:"+minutes+"\tprice:"
        +price+"\tticket_Left:"+count+"\tShow Time:"+time;
    }
}
