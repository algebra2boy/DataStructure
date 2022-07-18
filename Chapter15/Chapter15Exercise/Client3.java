public class Client3
{
    public static void main()
    {
        
        int[] data1 = {4,7,9,3,4,7,764};
        ArrayIntList list1 = new ArrayIntList();
        for(int n:data1)
        {
            list1.add(n);
        }
        System.out.println(list1.lastIndexOf(1));
        list1.replaceAll(7,100);
        System.out.println("list1 " + list1+"\n\n");

        ArrayIntList exe2 = new ArrayIntList();
        int[] input = {5,43,7,3,6,83,1};
        for(int n:input)
        {
            exe2.add(n);
        }
        int[] exe2AnotherList = {5,43};
        System.out.println("list"+exe2);
        System.out.println("list.indexOfSublist():"+exe2.indexOfSublist(exe2AnotherList)+"\n");

        int[] data2 = {2,3,5,4,7,15,20,7};
        ArrayIntList list2 = new ArrayIntList();
        for(int n:data2)
        {
            list2.add(n);
        }
        System.out.println("list2 " + list2+"\n\n");
        ArrayIntList list3 = list2.runningTotal();
        System.out.println("list2.runningTotal(): " + list3+"\n\n");

        list3.fill(88);
        System.out.println("list3 " + list3+"\n\n");

        System.out.println("list2 " + list2);
        list2.reverse();
        System.out.println("list2.reverse(): " + list2+"\n");
        list2.removeLast();
        System.out.println("list2.removeLast(): " + list2+"\n");

        int[] data4 = {1,2,3,4};
        ArrayIntList list4 = new ArrayIntList();
        for(int n:data4)
        {
            list4.add(n);
        }

        System.out.println("list4 " + list4);
        list4.mirror();
        System.out.println("list4.mirror(): " + list4+"\n");
        System.out.println("list4 " + list4);
        list4.rotate();
        System.out.println("list4.rotate(): " + list4+"\n");

        ArrayIntList exe9 = new ArrayIntList();
        int[] list9 = {1,3,4,7,7,7,7,9,9,11,13,14,14,14,16,16,18,19,19,19};
        for(int n:list9)
        {
            exe9.add(n);
        }
        System.out.println("exe9:"+exe9);
        System.out.println(exe9.maxCount()+"\n");

        ArrayIntList exe10 = new ArrayIntList();
        int[] list10 = {1,3,5,2,9,7,-3,0,42,308,17};
        for(int n:list10)
        {
            exe10.add(n);
        }
        System.out.println("exe10:"+exe10);
        System.out.println("exe10.longestSortedSequence:"+exe10.longestSortedSequence()+"\n");

        ArrayIntList exe12 = new ArrayIntList();
        int[] list12 = {8,17,9,24,42,3,8};
        for(int n:list12)
        {
            exe12.add(n);
        }
        System.out.println("exe12"+exe12);
        exe12.removeFront(4);
        System.out.println("exe12.removeFront(4):"+exe12+"\n");

        ArrayIntList exe13 = new ArrayIntList();
        int[] list13 = {3,4,3,5};
        for(int n:list13)
        {
            exe13.add(n);
        }
        System.out.println("exe13"+exe13);
        exe13.removeAll(3);
        System.out.println("exe13.removeAll(3):"+exe13+"\n");

        ArrayIntList exe16 = new ArrayIntList();
        int[] list16 = {42,7,0,-3,15};
        for(int n:list16)
        {
            exe16.add(n);
        }
        System.out.println("exe16"+exe16);
        exe16.stutter();
        System.out.println("exe16.stutter():"+exe16+"\n");

        ArrayIntList exe17 = new ArrayIntList();
        int[] list17 = {4,5,3,2};
        for(int n:list17)
        {
            exe17.add(n);
        }
        System.out.println("exe17"+exe17);
        exe17.stretch(5);
        System.out.println("exe17.stretch(5):"+exe17+"\n");

        ArrayIntList exe18 = new ArrayIntList();
        int[] list18 = {1,8,2,7};
        for(int n:list18)
        {
            exe18.add(n);
        }
        System.out.println("exe18"+exe18);
        exe18.doubleList();
        System.out.println("exe18.doubleList():"+exe18+"\n");

        ArrayIntList exe19 = new ArrayIntList();
        int[] list19 = {3,4,3};
        for(int n:list19)
        {
            exe19.add(n);
        }
        System.out.println("exe19"+exe19);
        exe19.compress();
        System.out.println("exe19.compress():"+exe19+"\n");

        ArrayIntList exe21 = new ArrayIntList();
        int[] list21 = {10,25,31,47,52,68,77,1};
        for(int n:list21)
        {
            exe21.add(n);
        }
        System.out.println("exe21"+exe21);
        exe21.switchPairs();
        System.out.println("exe21.switchPairs():"+exe21+"\n");
    }
}
