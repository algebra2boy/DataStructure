import java.util.*;
public class Sieve
{
    public static void main()
    {
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a given max");
        System.out.println();
        
        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();
        
        List<Integer> primes = sieve(max);
        System.out.println("Prime numbers up to "+ max+":");
        System.out.println(primes);
    }
    public static List<Integer> sieve(int max)
    {
        List<Integer> primes = new LinkedList<Integer>();
        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(2);
        for(int i = 3;i<=max;i+=2)
        {
            numbers.add(i);
        }
        if(numbers.get(0)>Math.sqrt(Collections.max(numbers)))
        {
            return numbers;
        }
        while(!numbers.isEmpty())
        {
            int front = numbers.get(0);
            primes.add(front);
                      
            Iterator<Integer> itr = numbers.iterator();
            while(itr.hasNext())
            {
                int current = itr.next();
                if(current%front==0)
                {
                    itr.remove();
                }
            }
        }        
        return primes;
    }
    
}
