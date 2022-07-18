//   TaskThreadDemo pg 1100 Liang

public class TaskThreadDemo
{
    public static void main(String[] args)
    {
        final int N = 100;  // = 100;   // 1000;

        int threadCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Runtime.getRuntime().availableProcessors(); = " + threadCount);

        // Create Runnable Objects
        // Runnable is the super class
        Runnable printA = new PrintChar('a',N);
        Runnable printB = new PrintChar('b',N);          // Directions: Add in a few of your own letters
        Runnable printN = new PrintNum(N);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printN);

        // Start threads
        thread1.run(); // a
        thread2.run(); // b
        thread3.run(); // 100

    }// main
} // TaskThreadDemo

// ========================================================================
//The thread class for printing a specified character in specified times
class PrintChar implements Runnable
{
    private char charToPrint;  //the character to print
    private int times;  //the times to repeat

    //The thread class constructor
    public PrintChar(char c, int t)
    {
        charToPrint = c;
        times = t;
    }

    //override the run() method to tell the system what the thread will do
    public void run()
    {
        for (int i = 1; i < times; i++)
            System.out.print(charToPrint);
    }
}
// ========================================================================
//The thread class for printing number from 1 to n for a given n.
class PrintNum implements Runnable
{
    private int lastNum;

    public PrintNum(int i)
    {
        lastNum = i;
    }

    // Pg 1100 Sec 30.3: run()
    public void run()
    {
        for (int i = 1; i <= lastNum; i++)
        {
            System.out.print(" " + i);
        }
    }


//      Thread printSymbol = new PrintSymbol('*',1000);
//      printSymbol.start();

    // Pg 1102 Sec 30.4: Thread.yield()
/*    public void run()
    {
        for (int i = 1; i <= lastNum; i++)
        {
            System.out.print(" " + i);
            Thread.yield();
        }
    }
*/

/*
    // Pg 1102 Sec 30.4: Thread.sleep()
    public void run() {
        try {
            for (int i = 1; i <= lastNum; i++) {
                System.out.print(" " + i);
                if (i >= 50) Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex) {
        }
    }
*/

}  // PrintNum

