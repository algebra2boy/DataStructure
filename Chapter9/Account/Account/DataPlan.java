
/**
 * Write a description of class DataPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataPlan extends Apps 
{
    private double balance;
    public DataPlan(double topUp,double usages)
    {
        super(topUp,usages);
        this.balance = 10;
    }
    public double getBalance()
    {
        return balance;
    }
    public void topUp(double input)
    {
        this.balance+=input;
    }
    public void Usages(double input)
    {
        this.balance-=input;
    }
    public String AppsDetails()
    {
        return "Data Plan Apps";
    }
}
