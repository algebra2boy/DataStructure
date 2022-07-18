
public class RandomIncrementer implements Incrementable
{
    private int num;
    
    public RandomIncrementer()
    {
        int n = (int)(Math.random()*100);
        this.num = n;
    }
    public int getValue()
    {
        return num;
    }
    public void increment()
    {
        int change = (int)(Math.random()*100);
        num = change;
    }
}
