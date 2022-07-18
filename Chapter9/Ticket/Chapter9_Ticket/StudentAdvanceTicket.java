
public class StudentAdvanceTicket extends AdvanceTicket
{
    public StudentAdvanceTicket()
    {
        this(0,0);
    }
    public StudentAdvanceTicket(int number,int days)
    {
        super(number,days);
    }
    public int getPrice()
    {
        return super.getPrice()/2;
    }
    public String toString()
    {
        return super.toString()+"  (ID required)\"";
    }
}
