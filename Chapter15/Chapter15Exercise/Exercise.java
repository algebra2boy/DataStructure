
public class Exercise
{
    public static void main()
    {       
        ArrayList exe10 = new ArrayList();
        int[] list10 = {1,3,5,2,9,7,-3,0,42,308,17};
        for(int n:list10)
        {
            exe10.add(n);
        }
        System.out.println("exe10:"+exe10);
        System.out.println("exe10.longestSortedSequence:"+exe10.longestSortedSequence());
    }
}
