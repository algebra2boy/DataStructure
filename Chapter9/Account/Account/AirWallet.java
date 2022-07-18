
/**
 * Write a description of class AirWallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirWallet extends Apps 
{
    private double balance;
    
    public AirWallet(double topUp,double usages)
    {
        super(topUp,usages);
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
        return "AirWallet Apps";
    }
}
