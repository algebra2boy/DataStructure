
// =========================================================
/**
 * Liang Java
 * pg 1102  Chap 30.4
 */
public class printSymbolJOIN_MAIN
{
    public static void main(String[] args)
    {
        PrintSymbol_JOIN printSymbolJoin = new PrintSymbol_JOIN('*',10);
        printSymbolJoin.start();
    }
}



class PrintSymbol_JOIN extends Thread
{
    private char charToPrint;  //the character to print
    private int times;  //the times to repeat

    //The thread class constructor
    public PrintSymbol_JOIN(char c, int t) {
        charToPrint = c;
        times = t;
    }

    //override the run() method to tell the system what the thread will do
    public void run()
    {
        System.out.println("\n\t PrintSymbol");
        Thread thread4 = new Thread(new PrintChar('c',10));
        thread4.start();
        try {
            for (int i=1; i < times; i++) {
                System.out.print(i);
                if (i==5) thread4.join();
            }
        } catch (InterruptedException ex) { }
    }  // PrintSymbol

}  // PrintSymbol

// ========================================================================
//The thread class for printing a specified character in specified times
/*class PrintChar implements Runnable
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
}*/
