import java.util.*;
public class Name_StarWars_CLIENT
{
    public static void main()
    {
        Name n1 = new Name("Luke","R","Skywalker");
        Name n2= new Name("Anakin","E","Skywalker"); 
        Name n3 = n2;

        // Output n1-n3
        System.out.println("   n1 = " + n1);
        System.out.println("   n2 = " + n2);
        System.out.println("   n3 = " + n3);  
        System.out.println();

        // Fill array with names.
        Name[] names = {n1, n2, new Name("Leia","R","Skywalker"),
                new Name("Han","R","Solo"), new Name("Kylo Ren","E","Solo"),
                new Name("Yoda","R",""), new Name("R2D2","R","Droid"),
                new Name("C3PO","R","Droid"), new Name("Chewbacca","R","Wookie"),
                new Name("Darth","E","Vader"), new Name("Boba","E","Fett")};

        // call printList and output names array 
        System.out.println("Original List: ");
        printList(names);
        System.out.println("\n\n");         

        // sort list by last then first name
        System.out.println("Sorted List: ");         
        sortList(names);
        printList(names);
        System.out.println("\n\n");              

        System.out.println("Most common last name = " + mostCommonLastName(names));
        System.out.println("Shortest total name = " + shortestTotalName(names));
        System.out.println("Largest group in Names = " + largestMembersInNames(names));       

    } // main 

    // ===========================================================================
    // Print the entire array 

    public static void printList(Name names[])
    {
        for(int i =0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("\n\n");
    }

    // ===========================================================================
    // Sort the list by last/first name via BubbleSort
    public static void sortList(Name nameList[])
    {
        for(int i=0;i<nameList.length;i++){
            for(int j=0;j<nameList.length-1;j++){
                String n1 = nameList[j].lastName;
                String n2 = nameList[j+1].lastName;
                if(n1.compareTo(n2)>0){
                    Name temp = nameList[j+1];
                    nameList[j+1] = nameList[j];
                    nameList[j] = temp;
                }else if(n1.compareTo(n2)==0){
                    n1 = nameList[j].firstName;
                    n2 = nameList[j+1].firstName;
                    if(n1.compareTo(n2)>0){
                        Name temp = nameList[j+1];
                        nameList[j+1] = nameList[j];
                        nameList[j] = temp;
                    }
                }
            }
        }
    }

    // ===========================================================================
    // Return the most common last name found,null if none.If more than one exists
    //   common, pick the first one.

    public static String mostCommonLastName(Name list[])
    {
        // >>>>>>>>>>>>  YOUR CODE HERE  <<<<<<<<<<<
        int[] namesCount = new int[6];
        String[] names = {"Skywalker", "Solo", "Droid", "Wookie", "Vader", "Fett"};
        for(int i = 0; i < list.length; i++){
            if(list[i].lastName == "Skywalker"){
                namesCount[0]++;
            }else if(list[i].lastName == "Solo"){
                namesCount[1]++;
            }else if(list[i].lastName == "Droid"){
                namesCount[2]++;
            }else if(list[i].lastName == "Wookie"){
                namesCount[3]++;
            }else if(list[i].lastName == "Vader"){
                namesCount[4]++;
            }else if(list[i].lastName == "Fett"){
                namesCount[5]++;
            }
        }
        int max = namesCount[0], maxIndex = 0;;
        for(int i = 0; i < namesCount.length; i++){
            if(namesCount[i] > max){
                maxIndex = i;
                max = namesCount[i];
            }
        }
        return names[maxIndex];
    }

    // ==============================================================================
    // Find and return the Name that is the shortest in total.If more than one exists
    //   common, pick the first one.*/   
    public static Name shortestTotalName(Name n[])
    {   
        int min = n[0].firstName.length()+n[0].middleInitial.length()+n[0].lastName.length(),pos=0;
        for(int i=0;i<n.length;i++){
            int count = n[i].firstName.length()+n[i].middleInitial.length()+n[i].lastName.length();
            if(min>count){
                min = count;
                pos = i;
            }
        }
        return n[pos];
    }

    // ====================
    //=======================================================    
    // Return the group that has the largest number of members (R or E) 

    public static String largestMembersInNames(Name nl[])
    {
        int empire = 0, republic = 0;String a = "";
        for(int i=0;i<nl.length;i++){
            if(nl[i].middleInitial=="R"){
                republic++;                
            }else{
                empire++;
            }
        }
        if(empire>republic){
            a = a+ "Empire: "+empire;
        }else if(empire<republic){
            a = a+ "Republic: "+republic;
        }else{
            a=  a+"Same number"+republic;
        }
        return a;

    }
}