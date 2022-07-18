import java.util.*;
import java.util.Iterator;
import java.util.Arrays;
public class ArrayList<E>
{
    public static final int DEFAULT_CAPACITY = 100;
    private E[] elementData;
    private int size;

    public ArrayList()
    {
        this(DEFAULT_CAPACITY);
    }
    // pre: capacity >= 0 (throws IllegalArgumentException if not)
    // post: constructs an empty list with the given capacity
    @SuppressWarnings("unchecked") // warning for E[], usually it doesn't allow
    public ArrayList(int capacity)
    {
        if(capacity<0)
        {
            throw new IllegalArgumentException("capacity: "+ capacity);
        }
        //elementData = new int[capacity];
        elementData =  (E[]) new Object[capacity];
        size = 0;
    }
    // inner class always be private 

    public class ArrayListIterator<E> implements Iterator<E>
    {
        private ArrayList list;
        private int position;
        private boolean removeOk;
        
        public ArrayListIterator(ArrayList<E> list)
        {
            position = 0;
            this.list = list;
            removeOk = false;
        }

        public boolean hasNext()
        {
            return position < size();
        }

        public E next()
        {
            // if values run out 
            if(!hasNext())
            {
                throw new NoSuchElementException();
            }
            E result =  (E) list.get(position);
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
            //class.this.method
            ArrayList.this.remove(position-1);
            position--;
            removeOk = false;
        }

        public boolean hasPrevious()
        {
            return position > 0;
        }

        public int nextIndex()
        {
            return position+1;
        }

        public E previous()
        {
            //
            if(!hasPrevious())
            {
                throw new NoSuchElementException();
            }
            E value = (E) list.get(position-1);
            position--;
            removeOk = true;
            return value;
        }

        public int previousIndex()
        {
            return position-1;
        }
        /*
        public void add(E value)
        {
            ArrayList.this.add(position,value);
        }*/

        public void set(E value)       
        {

        }
    }

    public ArrayListIterator<E> listIterator()
    {
        return new ArrayListIterator<E>(this);
    }

    public boolean containsAll(ArrayList<E> list)
    {
        for(int i = 0;i<list.size;i++)
        {
            E value = list.get(i);
            if(!contains(value))
            {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object O)
    {
        if(O instanceof ArrayList)
        {
            // convert O to ArrayList<E>
            ArrayList other = (ArrayList) O;
            for(int i = 0;i<other.size;i++)
            {
                if(!(other.get(i).equals(this.get(i))))
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int lastIndexOf(Object O)
    {
        E other = (E) O;
        for(int i=size-1;i>=0;i--)
        {
            if(elementData[i].equals(other))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(Object O)
    {
        E other = (E) O;
        for(int i = 0;i<this.size;i++)
        {
            if(elementData[i].equals(other))
            {
                this.remove(i);
                return true;
            }
        }
        return false;
    }

    public void removeAll(ArrayList<E> List)
    {
        for(int i = 0; i<List.size;i++)
        {
            E value =  List.get(i);
            for(int j = 0; j <this.size;j++)
            {
                E listvalue = this.get(j);
                if(value.equals(listvalue))
                {
                    this.remove(j);
                }
            }
        }
    }

    public void addAll(int index, ArrayList<E> list)
    {
        if(index<0)
        {
            throw new IllegalArgumentException();
        }

        int start = index;
        for(int i = 0;i<list.size;i++)
        {
            this.add(start,list.get(i));
            start++;
        }
    }

    // pre: size()< capacity (throws IllegalStateException if not)
    // post: appends the given value to the end of the list
    public void add(E value)
    {
        checkCapacity(size+1);
        elementData[size] = value;
        size++;
    }

    public String toString()
    {
        if(size==0)
        {
            return "[]";
        }else
        {
            String result = "["+elementData[0];
            for(int i=1;i<size;i++)
            {
                result+=","+elementData[i];
            }
            result+="]";
            return result;
        }      
    }

    public int size()
    {
        return size;
    }
    // pre : 0<= index <size()
    // post: returns the integer at the given index in the list
    public E get(int index)
    {
        return elementData[index];
    }

    public int indexOf(E value)
    {
        for(int i=0;i<size;i++)
        {
            if(elementData[i].equals(value))
            {
                return i;
            }
        }
        return -1;
    }

    public void replaceAll(E value,E change)
    {
        for(int i=0;i<size;i++)
        {
            if(elementData[i].equals(value))
            {
                this.set(i,change);
            }
        }
    }

    public Object[] toArray()
    {       
        Object[] o =  new Object[size];
        for(int i = 0; i <size;i++)
        {
            o[i] = elementData[i];
        }
        return o;
    }
    public void retainAll(ArrayList<E> list)
    {
        ArrayList<E> copy = new ArrayList<E>();
        for(int i = 0;i<list.size;i++){
            E listvalue = list.get(i);
            if(this.contains(listvalue) && !copy.contains(listvalue))
            {
                copy.add(listvalue);
            }
        }
        clear();
        addAll(0,copy);       
    }
    public void reverse()
    {
        int backward = size-1;
        for(int i=0;i<size/2;i++)
        {
            E temp = this.get(i);
            this.set(i,get(backward));
            this.set(backward,temp);
            backward--;
        }
    }

    public void fill(E value)
    {
        for(int i=0;i<size;i++)
        {
            this.set(i,value);
        }
    }

    public int count(E value)
    {
        int count = 0;
        for(int i=0;i<size;i++)
        {
            if(elementData[i].equals(value))
            {
                count++;
            }
        }
        return count;
    }

    public E removeLast()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("the list is empty");
        }
        E value = get(size-1);
        this.remove(size-1);
        return value;
    }

    public void mirror()
    {
        checkCapacity(size*2);//incase not enough space
        int backward = size-1;
        for(int i=backward;i>=0;i--)
        {
            this.add(get(i));
        }
    }

    public void rotate()
    {
        E temp = get(size-1);
        this.remove(size-1);
        this.add(0,temp);
    }

    public void remove(int index)
    {
        for(int i=index;i<size-1;i++)
        {
            elementData[i] = elementData[i+1];
        }
        elementData[size-1] = null;
        size--;
    }

    public void add(int index,E value)
    {
        for(int i=size;i>=index+1;i--)
        {
            elementData[i] = elementData[i-1];
        }
        elementData[index] = value;
        size++;
    }
    //post: checks that the underly array has the given capacity,
    //      throwing an IllegalStateException if it does not
    private void checkCapacity(int capacity)
    {
        if(capacity>elementData.length)
        {
            throw new IllegalStateException("exceeds list capacity");
        }
    }
    //post: throws an indexOutOfBoundsException if the given index is
    // not a legal index of the current list
    private void checkIndex(int index)
    {
        if(index<0||index>=size)
        {
            throw new IndexOutOfBoundsException("index: "+ index);
        }
    }

    public boolean contains(E value)
    {
        return indexOf(value)>=0;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public void set(int index,E value)
    {
        checkIndex(index);
        elementData[index] = value;
    }

    public void clear()
    {
        for(int i = 0; i<size;i++)
        {
            elementData[i] = null;
        }
        size = 0;
    }

    public void ensureCapacity(int capacity)
    {
        if(capacity>elementData.length)
        {
            int newCapacity = elementData.length*2+1;
            if(capacity>newCapacity)
            {
                newCapacity = capacity;
            }
            elementData = Arrays.copyOf(elementData,newCapacity);
        }
    }

    public void removeFront(int num)
    {
        E[] list = (E[]) new Object[size-num];
        int pos = 0;
        for(int i=num;i<size;i++)
        {
            list[pos] = elementData[i];
            pos++;
        }
        elementData = list;
        size = num-1;
    }

    public void stutter()
    {
        E[] list = (E[]) new Object[size*2];
        int pos = 0;
        for(int i=0;i<list.length;i+=2)
        {
            list[i]=elementData[pos];
            list[i+1]=elementData[pos];
            pos++;
        }
        elementData = list;
        size = list.length;
    }

    public void doubleList()
    {       
        int updataLength = size;
        for(int i = 0;i<updataLength;i++)
        {
            ensureCapacity(size*2);
            this.add(elementData[i]);
        }
    }

    public void switchPairs()
    {
        for(int i=0;i<size-1;i+=2)
        {
            E temp = elementData[i];
            set(i,elementData[i+1]);
            set(i+1,temp);
        }
    }

}

