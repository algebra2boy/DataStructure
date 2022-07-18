// this deals with a single node
public class ListNode
{
    public int data;
    public ListNode next;
    //public ListNode previous;  // Used for double-LinkedLists

    public ListNode()
    {
        this(0,null); 
    }

    public ListNode(int value)
    {
        this(value,null); 
    }

    public ListNode(int data, ListNode node)
    {
        this.data = data;
        this.next = node;
    }

    public int getData()
    {
        return data;   
    }

    public ListNode getNext()
    {
        return next;   
    }    

    public void setData(int value)
    {
        data = value;
    }

    public void setNext(ListNode node)
    {
        next = node;   
    }
}
