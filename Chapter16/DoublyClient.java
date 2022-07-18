
public class DoublyClient
{
    public static void main(){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addInOrder(new DblLLNode(78) );
        dll.addInOrder(new DblLLNode(-123));
        dll.addInOrder(new DblLLNode(-89));
        dll.addInOrder(new DblLLNode(82));  
        dll.addInOrder(new DblLLNode(0)); 
        dll.addInOrder(new DblLLNode(78)); 
        dll.addInOrder(new DblLLNode(78));
        dll.addInOrder(new DblLLNode(78));
        dll.addInOrder(new DblLLNode(79)); 
        dll.addInOrder(new DblLLNode(1)); 
        System.out.println(dll);        
        dll.removeAll(new DblLLNode(78));
        System.out.println(dll);
    }
}
