public class Marketer extends Employee
{
    // instance variables - replace the example below with your own
    private int day,month,year;

    public Marketer(String name)
    {
        super(name);
    }
    public Marketer()
    {
        this(0,0,0);
    }
    public Marketer(int m,int d,int y)
    {
        super("");
        this.month = m;
        this.day = d;
        this.year = y;
    }
    public double getSalary() { 
        return super.getSalary()+1000; 
    } 
    public void advertise()
    {
        System.out.println("Act now, while supplies last!");
    }
    
}
