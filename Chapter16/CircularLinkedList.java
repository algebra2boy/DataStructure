public class CircularLinkedList {    
    //A ListCircularNode class for doubly linked list
    public int data;
    public CircularNode head, tail;
    public CircularLinkedList(){
        head = tail = null;
    }

    public void add(int data){  
        //Create new node  
        CircularNode node = new CircularNode(data);  
        //Checks if the list is empty.  
        if(head == null) {  
            head = tail = node;  
            node.next = head;  // tail point to head
        }  
        else {  // more than one node
            //tail will point to new node.  
            tail.next = node;  
            //New node will become new tail.  
            tail = node;  
            // circular linked list tail will point to head.  
            tail.next = head;  
        }  
        System.out.println(this);
    }  

    public String toString(){
        if(head == null){ return "[]";}
        CircularNode curr = head;
        String result = "["+head.data;
        curr = head.next;
        while(curr != head){
            result+=","+curr.data;
            curr = curr.next;
        }
        result +="]\n";
        return result;
    }

    public void rotate(char sign, int shift){
        if(sign == '+'){ // rotate the list to the right
            for(int i = 1;i <= shift;i++){
                tail = head;
                head = head.next;
            }
        }else if(sign == '-'){ // rotate the list to the left
            for(int i = 1; i <= shift;i++){
                CircularNode curr = head;
                while(curr.next.next != head){
                    curr = curr.next;
                }
                head = tail;
                tail = curr;
            }
        }
    }
}