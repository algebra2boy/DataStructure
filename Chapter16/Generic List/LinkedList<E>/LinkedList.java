import java.util.*;
import java.util.Iterator;
import java.util.List;
public class LinkedList<E>
{    

    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public LinkedList(){ // default constructor: empty list
        head = tail = new ListNode<E>(null) ; 
        size = 0;    
        clear();
    }

    /*public class LinkedListIterator<E> implements Iterator<E>
    {
    private ListNode<E> current;
    private boolean removeOK;
    public LinkedListIterator(){
    current = head.getNext();
    removeOK = false;
    }

    public LinkedListIterator(LinkedList list){
    current = list.getHead().getNext();
    removeOK = false;
    }

    public boolean hasNext(){
    return current != tail;
    }

    public E next(){
    if(! hasNext()){ // no more elements
    throw new NoSuchElementException();
    }
    E result = current.getData();
    current = current.getNext();
    removeOK = true;
    return result;
    }

    public void remove(){
    if(!removeOK){
    throw new IllegalStateException();
    }
    ListNode<E> prev2 = current.getPrev().getPrev();
    prev2.setNext(current);
    current.setPrev(prev2);
    size--;
    removeOK = false;
    }
    }
    public LinkedListIterator<E> listIterator(){
    return new LinkedListIterator<E>(this);
    }*/
    // post: returns comma-separated, bracketed version of list
    public String toString(){
        if(head == null){ // empty or hasn't initialized
            return "[]";
        }else{ // empty is not empty
            String result = "[" + head.getNext().getData();
            ListNode current = head.getNext().getNext(); //next data for the first node
            while(current != null){
                result+= "," + current.getData();
                current = current.getNext(); // shifting to the next node repeatedly
            }
            return result+"]";//the end of the list
        }        
    }

    public ListNode getHead(){
        return head;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head.setNext(tail);
        tail.setPrev(tail);
        size = 0;
    }
    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list

    public E get(int index){
        return (E) nodeAt(index).getData();
    }
    // post: appends the given value to the end of the list
    public void add(E data){
        ListNode Node = new ListNode(data);
        if(head == null){ // empty list 
            head = tail = Node;
        }else{ // add to the back
            tail.setNext(Node);
            Node.setPrev(tail);
            tail = Node;
            tail.setNext(null);
        }
        size++;
    }
    // post: appends the given value to a specific index of the list
    public void add(int index, E value){ 
        if(index == 0){ // adding in the front the list
            head = new ListNode(null,value,head);
        }else{
            if(index < size){
                ListNode current = nodeAt(index-1);
                ListNode temp = new ListNode(current,value,current.getNext());
                current.setNext(temp);
                temp.getNext().setPrev(temp);
            }
        }
        size++;
    }

    public void addAll(int index, LinkedList<E> list){
        int start = index;
        ListNode curr = list.head;
        while(list != null){
            this.add(start,(E) curr.getData());
            start++;
            curr = curr.getNext();
        }
    }
    // pre : 0 <= index < size()
    // post: removes value at the given index

    public void remove(int index){
        if(index == 0){
            head = head.getNext();
        }else{
            ListNode current = nodeAt(index-1);
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    public void removeAll(LinkedList list){
        ListNode curr1 = head;
        ListNode curr2 = list.head;
        int index = 0;
        if(curr1 != null){
            while(curr1 != null && curr2 != null){
                if(curr1.getData().equals(curr2.getData())){
                    remove(index);
                }
                index++;
                curr1 = curr1.getNext();
                curr2 = curr2.getNext();
            }
        }

    }

    public boolean remove(Object o){
        if(o instanceof ListNode){
            ListNode find = (ListNode) o;
            ListNode curr = head;
            if(size == 1){
                head = head.getNext();
            }else if(size > 1)
                while(curr != null & curr.getNext() != null){
                    if(curr.getNext().getData().equals(find.getData())){
                        curr.setNext(curr.getNext().getNext());
                        return true;
                    }
                    curr = curr.getNext();
                }
        }        
        return false;
    }

    public boolean containsAll(LinkedList list){
        ListNode curr = list.head;
        while(curr != null){
            E value = (E) curr.getData();
            if(indexOf(value) == -1){
                return false;
            }
            curr = curr.getNext();
        }
        return true;
    }

    public void retainAll(LinkedList list)
    {
        LinkedList<E> copy = new LinkedList<E>();
        ListNode curr = list.head;
        for(int i = 0;i<list.size();i++){
            E listvalue = (E) curr.getData();
            if(this.indexOf(listvalue)>=0 && !(copy.indexOf(listvalue)>=0))
            {
                copy.add(listvalue);
            }
        }
        clear();
        addAll(0,copy);       
    }
    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index

    private ListNode<E> nodeAt(int index){
        ListNode<E> current;
        if(index < size / 2){ // start from the front
            current = head;
            for(int i=0; i< index+1; i++){
                current = current.getNext();
            }
        }else{
            current = tail;            
            for(int i = size;i>=index+1;i--){
                current = current.getPrev();
            }
        }
        return current;
    }
    // post: returns the position of the first occurrence of the
    // given value (-1 if not found)

    public int indexOf(E value){
        int index = 0;
        ListNode current = head.getNext(); // front is dummy node
        while(current != null){ // circular 
            if(current.getData().equals(value)){
                return index;
            }
            current = current.getNext();
            index++;
        }    
        return -1;
    }

    public void set(int index, E value){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Not a good index");
        }else{
            ListNode curr = head;
            int start = 0;
            while(curr != null){
                curr = curr.getNext();
                start++;
                if(start == index){
                    curr.setData(value);
                    return;
                }
            }           
        }
    }

    public boolean equals(Object o){
        if(o instanceof LinkedList){
            LinkedList list = (LinkedList) o;
            if(list.size() != this.size()){
                return false;
            }else{ // equal size
                ListNode curr1 = this.head;
                ListNode curr2 = list.head;
                while(curr1 != null)
                {
                    if(!curr1.getData().equals(curr2.getData())){
                        return false;
                    }
                    curr1 = curr1.getNext();
                    curr2 = curr2.getNext();
                }
            }            
        }       
        return true;
    }

    public int lastIndexOf(Object o){
        int index = -1,last = index; 
        if(o instanceof ListNode){
            ListNode node = (ListNode) o;
            ListNode curr = head;
            while(curr != null){
                index++;
                if(curr.getData().equals(node.getData())){ 
                    last = index;
                }
                curr = curr.getNext();
            }
        }
        return last;
    }

    public Object[] toArray(){
        Object[] array = new Object[size];
        ListNode curr = head;
        int index = 0;
        while(curr != null){
            array[index] = curr.getData();
            curr = curr.getNext();
        }
        return array;
    }

}