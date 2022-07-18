
//Doubly LinkedList is much better than single direction linkedlist 
// it is because it doesn't need to traverse the list
// instead it just needs to add the back of the tail instantly
public class DoublyLinkedList
{
    private DblLLNode head;
    private DblLLNode tail;
    public DoublyLinkedList(){
        head = tail = null;
    }

    public String toString(){ // print from the head to the end
        if(head == null){return "[]";}
        String result = "["+ head.data;
        DblLLNode curr = head.next;
        while(curr != null){
            result += ","+ curr.data;   
            curr = curr.next;
        }
        return result + "]";
    }

    /*public String toString(){ // print from the tail to the head
    if(tail == null){return "[]";}
    String result = "[" + tail.data;
    DblLLNode curr = tail.prev;
    while(curr != null){
    result += "," + curr.data;
    curr = curr.prev;
    }
    return result + "]";
    }*/
    // post-con: add the Node at the end of LinkedList 
    public void add(int data){
        DblLLNode Node = new DblLLNode(data);
        if(head == null){ // empty list 
            head = tail = Node;
        }else{ // add to the back
            tail.next = Node;
            Node.prev = tail;
            tail = Node;
            tail.next = null;
        }
    }

    /*public void add(int index, int data){
    DblLLNode Node = new DblLLNode(data);
    if(head == null){// empty
    head = tail = Node;
    }else{ // middle 
    DblLLNode curr = nodeAt(index-1);
    Node.next = curr.next;
    Node.next.prev = Node;
    curr.next = Node;
    Node.prev = curr;
    }
    }*/
    public void addInOrder(DblLLNode node){
        if(head == null){ //empty
            head = tail = node;
        }else if(node.data <= head.data){ // front 
            node.next = head;
            head.prev = node;
            head = node; 
            head.prev = null;
        }else if(node.data >= tail.data){ // add at the back 
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }else{ // add at the middle
            DblLLNode curr = head;
            while(curr.next != null && node.data > curr.next.data){
                curr = curr.next;
            }
            node.next = curr.next;
            node.next.prev = node;
            curr.next = node;
            node.prev = curr;
        }                   
    }

    public void removeAll(DblLLNode Node){
        DblLLNode curr = head;
        while(curr != null){
            if(curr.data == Node.data){ // match 
                if(curr.next == null){ // only one Node
                    head = tail = null;
                }else if(curr == head){ // front
                    head = curr.next;
                    head.prev.next = head.prev = null;
                }else if(curr == tail){ //back
                    tail = tail.prev;
                    tail.next.prev = tail.next = null;
                }else{ // middle
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                    curr = curr.next;
                }
            }else{
                 curr = curr.next;
            }
        }
    }

    private DblLLNode nodeAt(int index){
        DblLLNode current = head;
        for(int i = 0;i< index;i++){
            current = current.next;
        }
        return current;
    }
    public DblLLNode getHead(){
        return head;
    }
    public DblLLNode getTail(){
        return tail;
    }
}
