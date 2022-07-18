public class ThreadDemo
{
    public static void main(String[] args)
    {
        Hello obj1 = new Hello();
        Hi ob2 = new Hi();

        obj1.start();
        ob2.start();
    }
}

class Hello extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 5; i++)
            System.out.println("hello");
        try {
            Thread.sleep(2000);
        }catch (Exception e){}
    }
}
class Hi extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 5; i++)
            System.out.println("hi");
        try {
            Thread.sleep(2000);
        }catch (Exception e){}
    }
}

