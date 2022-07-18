// this deals with a single node
public class CircularNode
{
    public int data;
    public CircularNode next;
    //public ListNode previous;  // Used for double-LinkedLists

    public CircularNode()
    {
        this(0,null); 
    }

    public CircularNode(int value)
    {
        this(value,null); 
    }

    public CircularNode(int data, CircularNode node)
    {
        this.data = data;
        this.next = node;
    }

    public int getData()
    {
        return data;   
    }

    public CircularNode getNext()
    {
        return next;   
    }    

    public void setData(int value)
    {
        data = value;
    }

    public void setNext(CircularNode node)
    {
        next = node;   
    }
}
