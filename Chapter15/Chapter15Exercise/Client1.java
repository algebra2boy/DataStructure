public class Client1
{
    public static void main()
    {
        ArrayIntList list1 = new ArrayIntList();
        ArrayIntList list2 = new ArrayIntList();
        
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        
        list2.add(5);
        list2.add(67);
        list2.add(29);
        
        System.out.println("list1 = "+ list1);
        System.out.println("list2 = "+ list2+"\n");
        
        list1.printInversions();
        System.out.println("list1 = "+ list1);
    }
}