import java.util.*;
import java.util.Iterator;
import java.util.Arrays;
public class ArrayIntList
{
    public static final int DEFAULT_CAPACITY = 100;
    private int[] elementData;
    private int size;
    
    public ArrayIntList()
    {
        this(DEFAULT_CAPACITY);
    }
    // pre: capacity >= 0 (throws IllegalArgumentException if not)
    // post: constructs an empty list with the given capacity
    public ArrayIntList(int capacity)
    {
        if(capacity<0)
        {
            throw new IllegalArgumentException("capacity: "+ capacity);
        }
        //elementData = new int[capacity];
        elementData =  new int[capacity];
        size = 0;
    }
    // pre: size()< capacity (throws IllegalStateException if not)
    // post: appends the given value to the end of the list
    public void add(int value)
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
    public int get(int index)
    {
        return elementData[index];
    }

    public int indexOf(int value)
    {
        for(int i=0;i<size;i++)
        {
            if(elementData[i]==value)
            {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int value)
    {
        for(int i=size-1;i>=0;i--)
        {
            if(elementData[i]==value)
            {
                return i;
            }
        }
        return -1;
    }

    public void replaceAll(int value,int change)
    {
        for(int i=0;i<size;i++)
        {
            if(elementData[i]==value)
            {
                this.set(i,change);
            }
        }
    }

    public void reverse()
    {
        int backward = size-1;
        for(int i=0;i<size/2;i++)
        {
            int temp = this.get(i);
            this.set(i,get(backward));
            this.set(backward,temp);
            backward--;
        }
    }

    public ArrayIntList runningTotal()
    {
        ArrayIntList list2 = new ArrayIntList(this.size);
        if(size>0)
        {
            list2.add(this.get(0));
            for(int i=1;i<this.size;i++)
            {
                list2.add(this.get(i)+list2.get(i-1));
            }
        }
        return list2;
    }

    public void fill(int value)
    {
        for(int i=0;i<size;i++)
        {
            this.set(i,value);
        }
    }

    public boolean isPairwiseSorted()
    {
        for(int i=0;i<size;i+=2)
        {
            if(!(get(i+1)>get(i)))
            {
                return false;
            }
        }
        return true;
    }

    public int count(int value)
    {
        int count = 0;
        for(int i=0;i<size;i++)
        {
            if(elementData[i]==value)
            {
                count++;
            }
        }
        return count;
    }

    public int removeLast()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("the list is empty");
        }
        int value = get(size-1);
        this.remove(size-1);
        return value;
    }

    public void printInversions()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(get(i)>get(j))
                {
                    System.out.println("("+get(i)+", "+get(j)+")");
                }
            }
        }
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
        int temp = get(size-1);
        this.remove(size-1);
        this.add(0,temp);
    }

    public void remove(int index)
    {
        for(int i=index;i<size-1;i++)
        {
            elementData[i] = elementData[i+1];
        }
        size--;
    }

    public void add(int index,int value)
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

    public boolean contains(int value)
    {
        return indexOf(value)>=0;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public void set(int index,int value)
    {
        checkIndex(index);
        elementData[index] = value;
    }

    public void clear()
    {
        size = 0;
    }

    public void addAll(ArrayIntList other)
    {
        checkCapacity(size+other.size);
        for(int i =0;i<other.size;i++)
        {
            this.add(other.elementData[i]);
        }
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

    public ArrayIntListIterator iterator()
    {
        return new ArrayIntListIterator(this);
    }

    public int min()
    {
        if(size == 0)
        {
            throw new IllegalStateException();
        }else
        {
            int min = elementData[0];
            for(int i=0;i<size;i++)
            {
                if(elementData[i]<min)
                {
                    min = elementData[i];
                }
            }
            return min;
        }
    }

    public int max()
    {
        if(size == 0)
        {
            throw new IllegalStateException();
        }else
        {
            int max = elementData[0];
            for(int i=0;i<size;i++)
            {
                if(elementData[i]>max)
                {
                    max = elementData[i];
                }
            }
            return max;
        }
    }

    public int sum()
    {
        int count = 0;
        for(int i = 0;i<size;i++)
        {
            count+=elementData[i];
        }
        return count; 
    }

    public double average()
    {
        return sum()/(double)size;
    }

    public int maxCount()
    {
        if(size==0)
        {
            return 0;
        }
        int maxCount = 1, count = 1, prev = -1, curr, biggest = 1;
        for(int i=0;i<size;i++)
        {
            curr = elementData[i];
            if(prev == curr)
            {
                count++;
            }else if(prev!=curr)
            {
                if(count>maxCount)
                {
                    maxCount = count;
                    biggest = prev;
                }
                count = 1;
            }
            prev = curr;
        }
        return maxCount;
    }

    public void removeFront(int num)
    {
        int[] list = new int[size-num];
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
        int[] list = new int[size*2];
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

    public void stretch(int factor)
    {
        int[] list = new int[size*factor];
        int pos = 0;
        for(int i=0;i<list.length;i+=factor)
        {
            for(int j=0;j<factor;j++){
                list[i+j]=elementData[pos];
            }
            pos++;
        }
        elementData = list;
        size = list.length;
    }

    public void switchPairs()
    {
        for(int i=0;i<size-1;i+=2)
        {
            int temp = elementData[i];
            set(i,elementData[i+1]);
            set(i+1,temp);
        }
    }

    public void compress()
    {
        int[] list = new int[(size+1)/2]; 
        int pos = 0;
        for(int i= 0;i<list.length-1;i++)
        {
            list[i] = elementData[pos] +elementData[pos+1];
            pos+=2;
        }
        if(size%2!=0)
        {
            list[list.length-1] = elementData[pos];
        }else
        {
            list[list.length-1] = elementData[pos] +elementData[pos+1];
        }

        elementData = list;
        size = list.length;
    }

    public void removeAll(int value)
    {
        int countIsValue = 0;
        for(int i=0;i<size;i++)
        {
            if(elementData[i]==value)
            {            
                countIsValue++;
            }
        }
        int[] list = new int[size-countIsValue];
        int pos = 0;
        for(int i=0;i<size;i++)
        {
            if(elementData[i]!=value)
            {
                list[pos] = elementData[i];
                pos++;
            }
        }
        elementData = list;
        size-=countIsValue;
    }

    public int indexOfSublist(int[] list)
    {
        int index = -1;
        for(int i=0;i<=size-list.length;i++){
            int pos = 0;
            if(elementData[i]==list[pos]){              
                for(int j = i+1 ; j <i+list.length;j++)
                {
                    pos++;
                    if(elementData[j]!=list[pos])
                    {
                        break;
                    }
                    if(j==i+list.length-1)//if the loop doesn't break all the way to the last one, then record the index
                    {
                        index = i;
                    }
                }
            }
        }
        return index;
    }

    public int longestSortedSequence()
    {
        if(size==0)
        {
            return 0;
        }
        int longest = 1,length = 1;
        for(int i =0;i<size;i++)
        {
            if(elementData[i]<elementData[i+1])
            {
                length++;
            }
            if(length>longest)
            {
                longest = length;
            }
            if(elementData[i]>elementData[i+1])
            {
                length = 1;
            }
        }
        return longest;
    }
}

