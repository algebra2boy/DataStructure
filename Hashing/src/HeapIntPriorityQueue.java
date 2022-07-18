import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapIntPriorityQueue
{
    private int[] elementData;
    private int size;

    public HeapIntPriorityQueue()
    {
        elementData = new int[10];
        size = 0;
    }
    // Adds the given element to the queue
    public void add(int value)
    {
       // ensuring the capacity
       if(size + 1 >= elementData.length)
       {
           elementData = Arrays.copyOf(elementData, elementData.length*2);
       }
       elementData[size+1] = value; // add as rightmost leaf

       // "bubble up" as necessary to fix ordering
       int index = size +1;
       boolean found = false;
       while(!found && hasParent(index))
       {
           int parent_index = parent(index);
           if(elementData[index] < elementData[parent_index]) {
                swap(elementData,index,parent(index));
                index = parent(index);
           }else{
                found = true; // found proper location; stop the loop
           }
       }
       size++;


    }

    public int remove()
    {
        int result = elementData[1];
        elementData[1] = elementData[size];
        size--;

        // "bubble down" as necessary to fix ordering
        int index = 1;
        boolean found = false;
        while(!found && hasLeftChild((index))){
            int left = leftChild(index);
            int right = rightChild(index);
            int child = left;
            if(hasRightChild(index) && elementData[right] < elementData[left])
            {
                child = right;
            }

            if(elementData[index] > elementData[child])
            {
                swap(elementData,index,child);
                index = child;
            }else {
                 found = true; // found proper location; stop the loop
            }
        }

        return result;
    }

    public int[] toArray()
    {
        int[] array = new int[size];
        for(int i = 0;i < size; i++)
        {
            array[i] = elementData[i+1];
        }
        return array;

    }

    public String toString()
    {
        String s = "[";
        if(size >= 1) {s+=elementData[1];}
        for(int i = 1;i < size;i++){
            s += ", " + elementData[i+1];
        }
        return s + "]";
    }

    public void merge(HeapIntPriorityQueue pq)
    {
        for(int i = 1; i <=pq.size;i++)
        {
            this.add(pq.elementData[i]);
        }
    }


    private int parent(int index)
    {
        return index / 2;
    }

    private int leftChild(int index)
    {
        return index *2;
    }

    private int rightChild(int index)
    {
        return index *2 + 1;
    }

    private boolean hasParent(int index)
    {
        return (index > 1);
    }

    private boolean hasLeftChild(int index)
    {
        return leftChild(index) <= size;
    }

    private boolean hasRightChild(int index)
    {
        return rightChild(index) <= size;
    }

    private void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public int[] getElementData() {
        return elementData;
    }

    public int getSize() {
        return size;
    }
}
