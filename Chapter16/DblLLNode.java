// ListNode is for Doubly LinkedList Class
public class DblLLNode {    
    //A ListNode class for doubly linked list
    public int data;
    public DblLLNode next;
    public DblLLNode prev;  // Used for double-LinkedLists
    public DblLLNode(){ // default constructor
        this(null,0,null);
    }

    public DblLLNode(int data) {  // only one node
        this(null,data,null);      
    }  
    
    public DblLLNode(DblLLNode prev, int data, DblLLNode next){
        this.prev = prev;
        this.data = data;
        this.next = next;        
    }
    
    // Accessor method
    public int getData(){
        return data;
    }
    public DblLLNode getNext(){
        return next;
    }
    public DblLLNode getPrev(){
        return prev;
    }  
    public void setData(int data){
        this.data = data;
    }
    public void setNext(DblLLNode next){
        this.next = next;        
    }
    public void setPrev(DblLLNode prev){
        this.prev = prev;
    }
        
}