
public abstract class Ticket
{
    private int number;
    public Ticket()
    {
        this(0);
    }
    public Ticket(int n)
    {
        this.number = n;
    }
    public abstract int getPrice();
    public String toString()
    {
        return "Number: "+number+", Price: "+getPrice();
    }
    
}

