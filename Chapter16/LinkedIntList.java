// this deals with an entire list
import java.util.*;
public class LinkedIntList
{
    private ListNode front;
     // post: returns the current number of elements in the list
    public LinkedIntList(){ // default constructor: empty list
        front = null; 
    }

    public LinkedIntList(int[] arrayInt){
        for(int i = 0;i< arrayInt.length; i++){
            add(arrayInt[i]);
        }
    }
    // post: returns comma-separated, bracketed version of list
    public String toString(){
        if(front == null){ // empty or hasn't initialized
            return "[]";
        }else{ // empty is not empty
            String result = "[" + front.data;
            ListNode current = front.next; //next data for the first node
            while(current != null){
                result+= "," + current.data;
                current = current.next; // shifting to the next node repeatedly
            }
            return result+"]";//the end of the list
        }        
    }
    public double sum(){
        ListNode curr = front;
        double sum = 0;
        while(curr != null){
            sum+=curr.data;
            curr = curr.next;
        }
        return sum;
    }
    public double average(){
        if(size()==0){return 0.0;}
        return sum() / size();
    }
     // post: returns the current number of elements in the list
    public int size(){
        int count = 0;
        ListNode current = front;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }
     // pre : 0 <= index < size()
     // post: returns the integer at the given index in the list

    public int get(int index){
        return nodeAt(index).data;
    }
    // post: appends the given value to the end of the list
    public void add(int data){
        if(front == null){ // empty list then create a new node for the head
            front = new ListNode(data);
        }else{
            ListNode current = front;
            while(current.next != null){
                current = current.next;
            }
            current.next = new ListNode(data);
        }
    }
    // post: appends the given value to a specific idnex of the list
    public void add(int index, int value){ 
        if(index == 0){ // adding in the front the list
            front = new ListNode(value,front);
        }else{
            /*
            ListNode current = front;
            for(int i = 0;i< index-1; i++){
            current = current.next;
            }*/
            ListNode current = nodeAt(index-1);
            ListNode temp = new ListNode(value,current.next);
            current.next = temp;
        }
    }
     // pre : 0 <= index < size()
     // post: removes value at the given index

    public void remove(int index){
        if(index == 0){
            front = front.next;
        }else{
            /*
            ListNode current = front;
            for(int i = 0;i< index-1; i++){
            current = current.next;
            }*/
            ListNode current = nodeAt(index-1);
            current.next = current.next.next;
        }
    }

    /*
    public int get(int index){
    ListNode current = front;
    for(int i = 0; i < index; i++){
    current = current.next;
    }
    return current.data;
    }*/
     // pre : 0 <= i < size()
     // post: returns a reference to the node at the given index

    private ListNode nodeAt(int index){
        ListNode current = front;
        for(int i = 0;i<index;i++){
            current = current.next;
        }
        return current;
    }
     // post: returns the position of the first occurrence of the
     // given value (-1 if not found)

    public int indexOf(int value){
        int index = 0;
        ListNode current = front;
        while(current != null){
            if(current.data == value){
                return index;
            }
            current = current.next;
            index++;
        }    
        return -1;
    }

    public void addSorted(int value)
    {
        ListNode prev = null;
        ListNode current = front;
        while (current != null && current.data < value) {
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            front = new ListNode(value, front);
        } else {
            prev.next = new ListNode(value, prev.next);
        }
    }     

    public int min(){
        if(front == null){
            throw new NoSuchElementException();
        }
        int min = front.data;
        ListNode current = front.next;
        while(current != null){
            if(min>current.data){
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public int max(){
        if(front == null){
            throw new IllegalStateException();
        }
        int max = front.data;
        ListNode current = front.next;
        while(current != null){
            if(max<current.data){
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public void set(int index, int value){
        if(index<0 || index>=size()){
            throw new IllegalArgumentException("Not a good index");
        }else{
            ListNode curr = front;
            int start = 0;
            while(curr != null){
                curr = curr.next;
                start++;
                if(start == index){
                    curr.setData(value);
                    return;
                }
            }           
        }
    }

    public boolean isSorted(){
        if(size() == 0){
            return true;
        }else{
            ListNode curr = front;
            while(curr != null ){
                if(curr.next != null && curr.data > curr.next.data){
                    return false;
                }
                curr = curr.next;
            }
            return true;
        }
    }

    public int lastIndexOf(int value){
        int index = -1,last = index; 
        ListNode curr = front;
        while(curr != null){
            index++;
            if(curr.data == value){ 
                last = index;
            }
            curr = curr.next;
        }
        return last;
    }

    public int countDuplicates(){
        int count = 0;
        ListNode curr = front;
        while(curr != null){
            if(curr.next != null && curr.next.data == curr.data){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }

    public boolean hasTwoConsecutive(){
        ListNode curr = front;
        while(curr != null){
            if(curr.next != null && curr.next.data == curr.data+1){
                return true;
            }
            curr = curr.next;
        }        
        return false;
    }

    public int deleteBack(){
        if(size() == 0){throw new NoSuchElementException();}
        int delete;
        if(front.next == null){ // for one node
            delete = front.data;
            front = null;           
        }else{ // for more than one node
            ListNode curr = front;
            while(curr.next.next != null){
                curr = curr.next;
            }
            delete = curr.next.data;
            curr.next = null;
        }
        return delete;
    }

    public void stutter(){
        ListNode curr = front;
        while(curr != null){
            curr.next = new ListNode(curr.data, curr.next);
            curr = curr.next.next;
        }                    
    }

    public void stretch(int value){
        if(value <= 0){
            front = null;
            return;
        }
        ListNode curr = front;
        while(curr != null){
            for(int i = 1; i < value; i++){
                curr.next = new ListNode(curr.data, curr.next);
                curr = curr.next;
            }
            curr = curr.next;
        }     
    }

    public void compress(){
        ListNode curr = front;
        while(curr != null && curr.next != null){
            curr.setData(curr.data + curr.next.data);
            curr.next = curr.next.next;
            curr = curr.next;
        }
    }



    public void removeAll(int value){
        ListNode curr = front;
        int index = 0;
        while(curr != null){
            if(curr.data == value){
                this.remove(index);
                index--;
            }
            index++;
            curr = curr.next;
        }
    }

    boolean equals(LinkedIntList list2){
        if(this.size() != list2.size()){ // different length
            return false;
        }
        ListNode curr1 = front;
        ListNode curr2 = list2.front;
        while(curr1 != null){ // same length
            if(curr1.data != curr2.data){
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }

    void removeRange(int start, int end){
        if(start<0 || end<0 ){throw new IllegalArgumentException("position is negative");}
        ListNode curr = front;
        int index = 0,num = end - start, count = 0;      
        while(curr != null){
            if(index>=start && count<=num ){
                this.remove(index);
                index--;
                count++;
            }
            index++;
            curr = curr.next;
        }
    }

    /*public void switchPairs(){
        if(front == null || front.next == null){ // empty or a single node
            return;
        }
        ListNode curr = front;
        ListNode first = curr;
        ListNode second = curr.next;
        first.next = second.next;
        second.next = first;
        curr = first;
        
        while(curr.next != null && curr.next.next != null){
            
        }
    }*/
    public void transferForm(LinkedIntList list2){
        ListNode curr1 = front;
        while(curr1.next != null){
            curr1 = curr1.next;
        }
        curr1.next = list2.front;
        list2 = null;
    }
    public void split(){
        if(front ==null ){return;}
        ListNode curr = front;
        while(curr.next != null){
            if(curr.next.data < 0){
                ListNode neg = curr.next;
                curr.next = curr.next.next;
                neg.next = front;
                front = neg;
            }else if(curr.next.data >=0){
                curr = curr.next;
            }
        }      
    }
    public void doubleList(){
        if(front == null){return;}
        int size = 1;
        ListNode back = front;
        while(back.next != null){
            back = back.next;
            size++;
        }
        ListNode curr = front;
        while(size!=0){
            back.next = new ListNode(curr.data,back.next);
            back = back.next;
            curr = curr.next;
            size--;
        }
    }
    public void rotate(){
        if(front == null || front.next == null){return;}
        ListNode curr = front;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = front;
        front = front.next;
        curr.next.next = null;
    }
    public void shift(){
        if(front == null || front.next == null){return;}
        ListNode back = front;
        while(back.next != null){back = back.next;}
        ListNode curr = front;
        int size = 0;
        while(size < size()-1){
              if(size %2 == 0){
                  back.next = curr.next;
                  curr.next = curr.next.next;
                  back.next.next = null;
                  back = back.next;
              }else{
                  curr = curr.next;
              }
              size++;
        }
    }
        
}
