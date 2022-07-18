
public class Client
{
    public static void main(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("list:"+list);
        list.remove(0);
        System.out.println("list:"+list);
        list.remove(1);
        System.out.println("list:"+list);
    }
}
