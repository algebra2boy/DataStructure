
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private int id;
    private AirWallet wallet;
    private DataPlan Plan;
    private Apps app;
    public Student(String name,int id,AirWallet wallet)
    {
        super(name);
        this.id = id;
        this.wallet = wallet;
        System.out.println(toString()+" has "+ wallet);
    }
    public Student(String name,int id,DataPlan Plan)
    {
        super(name);
        this.id = id;
        this.Plan = Plan;       
    }
    public Student(String name,int id,Apps[] app)
    {
        super(name);
        this.id = id;
        System.out.println(toString()+" has the following apps");
        for(Apps a:app)
        {
            System.out.println(a);
        }
    }
    public DataPlan getDataPlan()
    {
        return Plan;
    }
    public AirWallet getAirWallet()
    {
        return wallet;
    }
    public Apps getApps()
    {
        return app;
    }
    public String toString()
    {
        return "UNM student named "+getName()+" (ID: "+id+")";
    }
    
}
