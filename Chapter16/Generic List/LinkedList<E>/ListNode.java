public class ListNode<E>
{
    private E data; 
    private ListNode prev;
    private ListNode next;
    /*** Constructor for objects of class Node */
    public ListNode()
    {
        prev = null;
        data = null; // set default values
        next = null;
    }

    public ListNode(E value)
    {
        prev = null;        
        data = value;
        next = null;
    }
    
    public ListNode(ListNode prev, E value, ListNode next){
        this.prev = prev;
        this.data = value;
        this.next = next;
    }
        
    public void setPrev(ListNode node){
        prev = node;
    }
    
    public void setNext(ListNode node)
    {
        next = node;
    }

    public void setData(E value)
    {
        data = value;
    }
    public ListNode getPrev()
    {
        return prev;
    }
    public ListNode getNext()
    {
        return next;
    }

    public String toString()
    {
        return data.toString();
    }

    public E getData()
    {
        return data;
    }
}