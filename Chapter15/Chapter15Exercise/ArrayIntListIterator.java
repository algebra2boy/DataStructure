import java.util.*;
public class ArrayIntListIterator
{
    private ArrayIntList list;
    private int position;
    private boolean removeOk;
    
    public ArrayIntListIterator(ArrayIntList list)
    {
        position = 0;
        this.list = list;
        removeOk = false;
    }
    public boolean hasNext()
    {
        return position < list.size();
    }
    public int next()
    {
        // if values run out 
        if(!hasNext())
        {
            throw new NoSuchElementException();
        }
        int result = list.get(position);
        position++;
        removeOk = true;
        return result;
    }
    public void remove()
    {
        if(!removeOk)
        {
            throw new IllegalStateException();
        }
        list.remove(position-1);
        position--;
        removeOk = false;
    }
}
