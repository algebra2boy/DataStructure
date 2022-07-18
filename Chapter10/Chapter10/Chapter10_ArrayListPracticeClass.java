// 3rd Edition Building Java Programs
// Chapter 10 ArrayLists

import java.util.*;

public class Chapter10_ArrayListPracticeClass
{

    public static void main()
    {
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("list = " + list);
        System.out.println("list.size(): " + list.size());         
        System.out.println();          

        list.add("A");
        list.add("B");
        list.add("C");        
        System.out.println("list: " + list);  
        System.out.println("list.size(): " + list.size());          
        System.out.println();  

        list.add("D");
        System.out.println("list: " + list);  
        System.out.println("list.size(): " + list.size());          
        System.out.println();     

        list.add(1,"E");
        System.out.println("list: " + list);  
        System.out.println("list.size(): " + list.size());          
        System.out.println();  

        list.remove(1);
        System.out.println("list: " + list);  
        System.out.println("list.size(): " + list.size());          
        System.out.println();    

        list.set(2,"E");
        System.out.println("list: " + list);  
        System.out.println("list.size(): " + list.size());          
        System.out.println();        

        System.out.println("list.contains(\"A\"): " + list.contains("A"));
        System.out.println(); 
        System.out.println("list.contains(\"Z\"): " + list.contains("Z"));
        System.out.println();       
        System.out.println("!list.contains(\"Z\"): " + !list.contains("Z"));
        System.out.println();          

        // Pg 656
        System.out.println("list.indexOf(\"B\"): " + list.indexOf("B"));
        System.out.println("list.indexOf(\"Z\"): " + list.indexOf("Z"));    
        System.out.println("list: " + list);  
        System.out.println();          

        list.add(1,"B");
        list.add(1,"B");
        System.out.println("list: " + list);  
        System.out.println("list.size(): " + list.size());          
        System.out.println();          

        System.out.println("list.lastIndexOf(\"B\"): " + list.lastIndexOf("B"));

        // ArrayList setup for SelfCheck 3 - 6 + 10    
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("It");
        list2.add("was");
        list2.add("a"); 
        list2.add("stormy"); 
        list2.add("night");

        // SelfCheck 3 - 6 + 10
        // >>>>  YOUR CODE HERE!!!! <<<<<

    } // main

}  // Chapter10_ArrayListPracticeClass
