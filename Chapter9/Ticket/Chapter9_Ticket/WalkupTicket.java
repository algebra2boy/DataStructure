
public class WalkupTicket extends Ticket
{
    public WalkupTicket()
    {
        this(0);
    }
    public WalkupTicket(int n)
    {
        super(n);
    }
    public int getPrice()
    {
        return 50;
    }
}
