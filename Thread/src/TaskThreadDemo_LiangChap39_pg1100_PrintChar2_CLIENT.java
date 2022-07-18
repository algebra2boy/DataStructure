// Given the below main(), complete PrintChar2_SHELL run() as specified below:


public class TaskThreadDemo_LiangChap39_pg1100_PrintChar2_CLIENT
{
  public static void main(String[] args)
  {
   final int N = 100;

        // Create tasks
        Runnable printA = new PrintChar2("a1",N);
        Runnable printB = new PrintChar2("b1",N);
        Runnable printC = new PrintChar2("c1",N);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printC);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

  }// main

} //  TaskThreadDemo_LiangChap39_pg1100_PrintChar2_CLIENT

  //The thread class for printing specific characters in specified times
  class PrintChar2 implements Runnable
  {
    private String charsToPrint;   // the character(s) to print
    private int times;                    // the times to repeat

    // thread class constructor
    public PrintChar2(String s,int t) {
        charsToPrint = s;
        times = t;
    }
    @Override
    public String toString()
    {
        return "\\" + charsToPrint + Thread.currentThread().getName();
    }
    public void run ()
    {
      for (int i=1; i <= times; i++) {
        System.out.print(charsToPrint);
        if ((i>=times/2) && (times%2 == 0)) {
            int r1 = (int) (Math.random()*10+1);
            switch (r1) {

    // Random number r1 (1-10) results as follows:
    /* (1)-(5) [50% of the time] generate an r2 such that 1 <= r2 <= 3 resulting as follows:
     .(1) Print the current Thread path and name and set the Priority to MIN.
     .(2) Print the current Thread path and name and set the Priority to NORMAL.
     .(3) Print the current Thread path and name and set the Priority to MAX. */
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                int r2 = (int) (Math.random()*3 +1);
                switch (r2)
                {
                    case 1:Thread.currentThread().setPriority(Thread.MIN_PRIORITY); break;
                    case 2:Thread.currentThread().setPriority(Thread.NORM_PRIORITY); break;
                    case 3:Thread.currentThread().setPriority(Thread.MAX_PRIORITY); break;
                }
                break;
       //(6) Create a new thread off of the current one and “start” it.
            case 6:
                System.out.println(this + ".start()");
                char ch = charsToPrint.charAt(0); // get the thread a or b or c
                int intCh = Integer.parseInt(charsToPrint.substring(charsToPrint.length()-1)) +1;
                charsToPrint = charsToPrint + ch + intCh;
                if(intCh ==3 )
                    continue;
                PrintChar2 print = new PrintChar2(charsToPrint,times);
                Thread thread = new Thread(print);
                thread.start();
                break;
                /*Ex.  current thread = a1  new thread = a1a2  and a thread off of that would be a1a2a3
                        NOTE1: there most likely will be more than one time that a1 spons a new a1a2
                                      thread and that is ok.  Same with the others.
                        NOTE2:  Make sure to STOP the Thread when it reaches its 3rd generation,
                                       Otherwise it may go on forever!
                        Ex  a1a2a3  STOP it at this point!  So NO a1a2a3a4! */
       //(7) Create a new thread off of the current one and “join” it.
            case 7:
                System.out.println(this + ".join()");
                ch = charsToPrint.charAt(0); // get the thread a or b or c
                intCh = Integer.parseInt(charsToPrint.substring(charsToPrint.length()-1)) +1;
                if(intCh ==3 )
                    continue;
                charsToPrint = charsToPrint + ch + intCh;
                print = new PrintChar2(charsToPrint,times);
                thread = new Thread(print);
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
       //(8) Yield the current thread.
            case 8:
                System.out.println(this + ".yield()");
                Thread.currentThread().yield();
                break;
       //(9) Sleep the current thread for 500 milliseconds.
            case 9:
                try {
                    System.out.println(this + ".sleep(500)");
                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
                //(10) Stop the current thread.
            case 10:
              System.out.println(this + ".stop()");
              Thread.currentThread().stop();
              break;

       /*(Bonus): Add in a few of your own.
       NOTE: you will have to look through the book, online, etc in order to accomplish this.  There
                are various places that will need to be in a try-catch Exception Handler. */


           } // switch r1
       }// if
      } // for loop
     }  // run()
  } // PrintChar2


/*
Example output:
a1a1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1b1a1a1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1c1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1a1\NewThread Starting:b1b2
\a1Thread-1setPriority(Thread.MAX_PRIORITY)
\c1Thread-3.stop()
b1a1\a1Thread-1setPriority(Thread.MIN_PRIORITY)
\b1Thread-2.sleep(500)
b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2b1b2a1\b1b2Thread-4.yield()
b1b2\b1b2Thread-4.stop()
\a1Thread-1setPriority(Thread.MAX_PRIORITY)
a1\NewThread Starting:a1a2
a1\a1Thread-1.stop()
a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2a1a2\a1a2Thread-5setPriority(Thread.MAX_PRIORITY)
a1a2\a1a2Thread-5setPriority(Thread.MIN_PRIORITY)
a1a2\a1a2Thread-5.setPriority(Thread.NORM_PRIORITY)
a1a2\a1a2Thread-5.setPriority(Thread.NORM_PRIORITY)
a1a2\a1a2Thread-5setPriority(Thread.MIN_PRIORITY)
a1a2\NewThread Starting:a1a2a3
a1a2\NewThread Starting and JOINed:a1a2a3
a1a2\a1a2Thread-5setPriority(Thread.MIN_PRIORITY)
a1a2\a1a2Thread-5.setPriority(Thread.NORM_PRIORITY)
a1a2\a1a2Thread-5.yield()
a1a2\a1a2Thread-5setPriority(Thread.MAX_PRIORITY)
a1a2\NewThread Starting:a1a2a3
a1a2\a1a2Thread-5.setPriority(Thread.NORM_PRIORITY)
a1a2\a1a2Thread-5setPriority(Thread.MIN_PRIORITY)
a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3\a1a2a3Thread-8setPriority(Thread.MIN_PRIORITY)
a1a2\a1a2Thread-5.yield()
a1a2a3\TooLongStopAt3:a1a2a3Thread-8.stop()
a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3\TooLongStopAt3:a1a2a3Thread-6.stop()
a1a2\a1a2Thread-5setPriority(Thread.MAX_PRIORITY)
a1a2\NewThread Starting:a1a2a3
a1a2\a1a2Thread-5.yield()
a1a2\a1a2Thread-5.yield()
a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2a3a1a2\a1a2a3Thread-9setPriority(Thread.MIN_PRIORITY)
\a1a2Thread-5setPriority(Thread.MIN_PRIORITY)
a1a2\a1a2Thread-5.yield()
a1a2a3\a1a2a3Thread-9.setPriority(Thread.NORM_PRIORITY)
a1a2a1a2a3\a1a2Thread-5setPriority(Thread.MAX_PRIORITY)
\a1a2a3Thread-9.yield()
a1a2a3a1a2\a1a2a3Thread-9.yield()
a1a2a3\a1a2Thread-5setPriority(Thread.MAX_PRIORITY)
\TooLongStopAt3:a1a2a3Thread-9.stop()
a1a2\a1a2Thread-5.sleep(500)
b1\b1Thread-2.setPriority(Thread.NORM_PRIORITY)
b1\b1Thread-2setPriority(Thread.MAX_PRIORITY)
b1\b1Thread-2setPriority(Thread.MAX_PRIORITY)
b1\NewThread Starting and JOINed:b1b2
b1\b1Thread-2.yield()
b1\b1Thread-2setPriority(Thread.MIN_PRIORITY)
b1\b1Thread-2.stop()
a1a2\a1a2Thread-5setPriority(Thread.MIN_PRIORITY)
a1a2\a1a2Thread-5.setPriority(Thread.NORM_PRIORITY)
a1a2\a1a2Thread-5.sleep(500)
a1a2\a1a2Thread-5.sleep(500)
a1a2\a1a2Thread-5setPriority(a2)
a1a2\a1a2Thread-5setPriority(Thread.MAX_PRIORITY)
a1a2\a1a2Thread-5setPriority(Thread.MAX_PRIORITY)
a1a2\a1a2Thread-5.sleep(500)
a1a2\a1a2Thread-5.stop() */




