public class New
{
    public static void main()
    {
        evenDigits(221);
    }

    public static int evenDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }else
        {
            if(n%2==0)//even
            {
                return (n%10)+10*evenDigits(n/10);
            }else
            {
                return evenDigits(n/10);
            }
        }

    }

}