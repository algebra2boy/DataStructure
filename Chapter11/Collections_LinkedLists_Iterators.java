/**
 * Collections: Java Defined LinkedLists & Iterators.
 */

import java.util.*;

public class Collections_LinkedLists_Iterators
{
   public static void main()
   {
   int i;
   int a[] = new int[5];
   LinkedList<Integer> LL1 = new LinkedList<Integer>();
   
        // Fill the array
        for (i=0;i<a.length;i++)
            a[i]=i;
        
        // Fill the LinkedList
        for (i=0;i<a.length;i++)
            LL1.add(i);

        printArray(a);
        printLinkedList(LL1);
        printList(LL1); // Rem: a Java-Defined LinkedList "isA" List
//        printCollection(LL1);
        printCollectionViaIterator(LL1);        
        
  
    } //  main
    
    // ====================================================
    public static void printArray(int a2[])
    {
        System.out.println("printArray: ");
        System.out.print(a2[0]);
        for (int j=1; j<a2.length; j++)
            System.out.print(", " + a2[j]);    
        System.out.println("\n\n");
    }  // printArray


    // ====================================================    
    public static void printLinkedList(LinkedList LL2)
    {
        System.out.println("printLinkedList:");
        System.out.print(LL2.get(0));
        for (int j=1; j<LL2.size(); j++)
            System.out.print(", " + LL2.get(j)); 
        System.out.println("\n\n");            
    }  // printLinkedList   
    // ====================================================    
    public static void printList(List<Integer> LL3)
    {
        System.out.println("printList:");
        System.out.print(LL3.get(0));
        for (int j=1; j<LL3.size(); j++)
            System.out.print(", " + LL3.get(j)); 
        System.out.println("\n\n");            
    }  // printList       
    
/* NOT allowed because calling get(i) in Collections class is 
 * not allowed. Reason: Collection is the superClass of Set and List
 * Set does not have a get(i) method 
*/
/*
    public static void printCollection(Collection LL4)
    {
        System.out.println("printColletion: \n");
        System.out.print(LL4.get(0));  // ERROR: get(i) NOT allowed
        for (int j=1; j<LL4.size(); j++)   // in Collection class
            System.out.print(", " + LL4.get(j));  // ERROR
        System.out.println("\n\n");            
    }  // printCollection      
*/
    
    // ====================================================
    public static void printCollectionViaIterator(Collection LL5)
    {
        System.out.println("printColletion2: ");
        Iterator<Iterator> itr = LL5.iterator();
        if (itr.hasNext())
            System.out.print(itr.next());
        while(itr.hasNext())
            System.out.print(", " + itr.next());  
        System.out.println("\n\n");            
    }  // printCollection2
    
    
}  // Collections_LinkedLists_Iterators



