
public class AdvanceTicket extends Ticket
{
    private int days;
    public AdvanceTicket()
    {
        this(0,0);
    }
    public AdvanceTicket(int ticket,int days)
    {
        super(ticket);
        this.days = days;
    }
    public int getPrice()
    {
        if(days>=10)
        {
            return 30;
        }else
        {
            return 40;
        }
    }
    public int getDays()
    {
        return days;
    }
}
