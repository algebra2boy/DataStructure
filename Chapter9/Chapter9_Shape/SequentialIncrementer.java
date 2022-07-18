
public class SequentialIncrementer implements Incrementable
{
    private int num;
    public SequentialIncrementer()
    {
        this.num = 0;
    }
    public int getValue()
    {
        return num;
    }
    public void increment()
    {
        num++;
    }
}
