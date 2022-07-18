import java.util.*;
public class LargestSmallest
{
    public static void main(){
        Scanner input = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("1st2ndLargestSmallest.java");
        System.out.print("Enter a number(exit = -1):");
        int number = input.nextInt();
        String op = number+"";
        do{
            list.addInOrder(new DblLLNode(number)); 
            output(list,op);
            System.out.print("Enter a number(exit = -1):");
            number = input.nextInt();
            if(number != -1){op+=","+number;}
        }while(number != -1);
        output(list,op);
        System.out.println("GOODBYE!!");
    }

    public static void output(DoublyLinkedList list,String op){
        if(list.getHead().equals(list.getTail())){ // only one node
            System.out.print("L1 = "+ list.getTail().getData() + ",L2 = " + list.getTail().getData()+",");
            System.out.println("S1 = "+ list.getHead().getData() + ",S2 = " + list.getHead().getData() );
        }else{
            System.out.print("L1 = "+ list.getTail().getData() + ",L2 = " + list.getTail().prev.getData()+",");
            System.out.println("S1 = "+ list.getHead().getData() + ",S2 = " + list.getHead().next.getData() );
        }
        System.out.println("List: "+ op +"\n");
    }
}
