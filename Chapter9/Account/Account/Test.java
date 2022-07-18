
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main()
    {
        Apps app[] = new Apps[2];
        app[0] = new DataPlan(100,50);
        app[1] = new AirWallet(100,50);
        Student a = new Student("Jack",1245,app);
        System.out.println();
        Student b = new Student("Peter",5678,new AirWallet(1000,550));
    }
}
