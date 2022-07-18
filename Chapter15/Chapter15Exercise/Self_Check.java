
public class Self_Check
{
    public static void main()
    {
        ArrayList self8 = new ArrayList();
        self8.add(11);
        self8.add(-7);
        self8.add(3);
        self8.add(42);
        self8.add(0);
        self8.add(14);
        System.out.println(self8);
        System.out.println("list.max():"+self8.max());
        System.out.println("list.min():"+self8.min());
        
        ArrayList self19 = new ArrayList();
        self19.addAll(self8);
        System.out.println("self19.sum():"+self19.sum());
        System.out.println("self20.average():"+self19.average());
    }
}
