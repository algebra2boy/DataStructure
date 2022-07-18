public class CircularDblLinkedList {    
    //A ListCircularDblNode class for doubly linked list
    public int data;
    public CircularDblNode head, tail;
    public CircularDblLinkedList(){
        head = tail = null;
    }

    public void add(int data){  
        //Create new node  
        CircularDblNode node = new CircularDblNode(data);   
        if(head == null){ // empty list 
            head = tail = node;
        }else{ // add to the back
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
        head.setPrev(tail);
        tail.setNext(head);

    }  

    public String toString(){
        if(head == null){ return "[]";}
        CircularDblNode curr = head;
        String result = "["+head.getData();
        curr = head.getNext();
        while(curr != null && curr != head){
            result+=","+curr.getData();
            curr = curr.getNext();
        }
        result +="]\n";
        return result;
    }

    public void rotate(char sign, int shift){
        if(sign == '+'){ // rotate the list to the right
            for(int i = 1;i <= shift;i++){
                tail = head;
                head = head.getNext();
                head.setPrev(tail);
                tail.setNext(head);
            }
        }else if(sign == '-'){ // rotate the list to the left
            for(int i = 1; i <= shift;i++){
                head = tail;
                tail = tail.getPrev();
                head.setPrev(tail);
                tail.setNext(head);
            }
        }
    }
}