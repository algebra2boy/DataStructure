
/**
 * Abstract class Apps - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Apps implements Account
{
    private double topUp;
    private double usages;
   public Apps(double topUp,double usages)
   {
       this.topUp = topUp;
       this.usages = usages;
   }
   
   public abstract String AppsDetails();
}
