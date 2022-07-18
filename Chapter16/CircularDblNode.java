// this deals with a single node
public class CircularDblNode
{
    private int data;
    private CircularDblNode prev;
    private CircularDblNode next; 

    public CircularDblNode()
    {
        this(null,0,null); 
    }

    public CircularDblNode(int value)
    {
        this(null,value,null); 
    }

    public CircularDblNode(CircularDblNode prev, int data, CircularDblNode next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public int getData()
    {
        return data;   
    }

    public CircularDblNode getNext()
    {
        return next;   
    }    

    public CircularDblNode getPrev()
    {
        return prev;   
    }  
    public void setData(int value)
    {
        data = value;
    }

    public void setNext(CircularDblNode node)
    {
        next = node;   
    }
    
    public void setPrev(CircularDblNode node)
    {
        prev = node;   
    }
}
