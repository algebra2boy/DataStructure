
/**
 * Building Java Programs
 * 3rd Edition
 * Chapter 16
 * 
 * LinkedIntList_CLIENT
 */
public class LinkedIntList_CLIENT
{
    public static void main()
    {
    // Create the LinkedIntList 
    System.out.println("  Create the LinkedIntList");
    LinkedIntList lil = new LinkedIntList();
    
        // SIZE of LinkedIntList
        System.out.println(" SIZE of Empty LinkedIntList: lil.size() = " + lil.size());
            
        // ADD to the LinkedIntList
        System.out.println(" ADD 10 - 50 to LinkedIntList lil");
        lil.add(10); 
        lil.add(20);     
        lil.add(30); 
        lil.add(40);
        lil.add(50); 
        
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");           
        
        // SIZE of newly filled LinkedIntList
        System.out.println(" SIZE of LinkedIntList: lil.size() = " + lil.size());        
        System.out.println("\n");     
        
        // ADD to the LinkedIntList
        System.out.println(" ADD 31 to LinkedIntList lil at 4th position");
        lil.add(4,31); 
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");                   
        // SIZE of newly filled LinkedIntList
        System.out.println(" SIZE of LinkedIntList lil = " + lil.size());        
        System.out.println("\n");  
        
        // INDEX in the LinkedIntList
        System.out.println("INDEX of 31 in LinkedIntListlil = " + lil.indexOf(31));
        System.out.println("\n");          

        // REMOVE to the LinkedIntList
        System.out.println(" REMOVE 31 to LinkedIntList lil at 4th position");
        lil.remove(4); 
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");                   
        // SIZE of newly filled LinkedIntList
        System.out.println(" SIZE of LinkedIntList lil = " + lil.size());        
        System.out.println("\n");          
        
        
        // ADD_SORTED to the LinkedIntList
        System.out.println(" ADD_SORTED 35, 5, 55, 25, 45 to LinkedIntList lil at 4th position");
        lil.addSorted(35); 
        lil.addSorted(5); 
        lil.addSorted(55); 
        lil.addSorted(25); 
        lil.addSorted(45);         
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");                   
        // SIZE of newly filled LinkedIntList
        System.out.println(" SIZE of LinkedIntList lil = " + lil.size());        
        System.out.println("\n");          
        
        // ==============================================================================
        //                                  EXERCISES
        // ==============================================================================
        System.out.println("EXERCISES: \n");
        
        System.out.println("Exercise #16.1 set(): ");
               // >>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<
        // PRINT out the LinkedIntList
        System.out.print(" PRINT of LinkedIntList: lil.toString() = " + lil.toString());
        System.out.println("\n");         
        
        // REPEAT the above for 
        //      (1) ALL Exercises!   #1-21 calling them with the input as stated in the book for each problem.
        //      (2) Programming Project #1  pg 1001
        
        int[] array1 = {1,18,2,7,18,39,18,40};
        LinkedIntList list1 = new LinkedIntList(array1);
        System.out.println(list1);
        System.out.println("list.min:"+list1.min());
        System.out.println("list.max:"+list1.max());
        //list.set(6,10);
        System.out.println("list.set(index,value) - " + "list.set(2,1)");
        System.out.println(list1);
        System.out.println("list.isSorted():"+list1.isSorted());
        System.out.println("list.lastIndexOf(6):"+list1.lastIndexOf(18)+"\n");
        
        int[] array2 = {1,1,1,3,3,6,9,15,15,23,23,23,40,40,40};
        LinkedIntList list2 = new LinkedIntList(array2);
        System.out.println("list2.countDuplicates():"+ list2.countDuplicates()+"\n");
        
        int[] array3 = {18,2,7,7,39,18,19};
        LinkedIntList list3 = new LinkedIntList(array3);
        System.out.println("list3.hasTwoConsecutive():"+list3.hasTwoConsecutive());
        System.out.println("list3.deleteBack():"+list3.deleteBack());
        System.out.println("list3.toString():"+list3+"\n");
        
       /* int[] array4 = {1,2};
        LinkedIntList list4 = new LinkedIntList(array4);
        System.out.println("list4:"+list4);
        list4.switchPairs();
        System.out.println("list4.switchPairs():"+list4+"\n");*/
        
        int[] array5 = {1,8,19,4,17};
        LinkedIntList list5 = new LinkedIntList(array5);
        System.out.println("list5:"+list5);
        list5.stutter();
        System.out.println("list5.stutter():"+list5+"\n");
        
        int[] array6 = {18,7,4,24,11};
        LinkedIntList list6 = new LinkedIntList(array6);
        System.out.println("list6:"+list6);
        list6.stretch(3);
        System.out.println("list6.stretch(3):"+list6+"\n");
        
        int[] array7 = {1,7,3,9,4,6};
        LinkedIntList list7 = new LinkedIntList(array7);
        System.out.println("list7:"+list7);
        list7.compress();
        System.out.println("list7.compress():"+list7+"\n");
        
        int[] array8 = {8,17,2,4};
        int[] array9 = {1,2,3};
        LinkedIntList list8 = new LinkedIntList(array8);
        LinkedIntList list9 = new LinkedIntList(array9);
        System.out.println("list8:"+list8);
        list9.transferForm(list8);
        System.out.println("list9.transferForm(list8):"+list8+"\n");
        
        int[] array10 = {3,3,9,4,3,8,3,3,3,4,3,3,7};
        LinkedIntList list10 = new LinkedIntList(array10);
        System.out.println("list10:"+list10);
        list10.removeAll(3);
        System.out.println("list10.removeAll(3):"+list10+"\n");
        
        int[] array11 = {1,2,3,4};
        int[] array12 = {1,2,3,4};
        LinkedIntList list11 = new LinkedIntList(array11);
        LinkedIntList list12 = new LinkedIntList(array12);
        System.out.println("list11:"+list11);
        System.out.println("list12:"+list12);
        System.out.println("list11.equals(list12):"+list11.equals(list12)+"\n");
        
        int[] array14 = {8,13,17,4,9,12,98,41,7,23,0,92};
        LinkedIntList list14 = new LinkedIntList(array14);
        System.out.println("list14:"+list14);
        list14.removeRange(3,8);
        System.out.println("list14.removeRange(3,8);:"+list14+"\n");
        
        int[] split = {8,7,-4,19,0,43,-8,-7,2,-45};
        LinkedIntList list15 = new LinkedIntList(split);
        System.out.println("list15"+list15);
        list15.split();
        System.out.println("list15.split():"+list15+"\n");
                 
        int[] doubleList = {1,2,3,4};
        LinkedIntList Double = new LinkedIntList(doubleList);
        System.out.println("Double"+Double);
        Double.doubleList();
        System.out.println("Double.doubleList()"+Double+"\n");
        
        int[] rotate = {8,23,19,7,45,98,102,4};
        LinkedIntList rotateList = new LinkedIntList(rotate);
        System.out.println("rotateList"+rotateList);
        rotateList.rotate();
        System.out.println("rotateList.rotate"+rotateList+"\n");
        
        int[] shift = {10,31,42,23,44,75,86};
        LinkedIntList shiftList = new LinkedIntList(shift);
        System.out.println("shift"+shiftList);
        shiftList.shift();
        System.out.println("shiftList.shift()"+shiftList+"\n");
        
        
    }  // main
   
}  //  LinkedIntList_CLIENT
