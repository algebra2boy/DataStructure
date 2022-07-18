// ===========================================================

/**
 * Building Java Programs 3rd Edition
 * Chapter 8
 * pg 571
 * Programming Project #3: Grocery
 */
import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class GroceryList
{
    int size, MAX_SIZE = 10;
    GroceryItemOrder[] gList;
    // -------------- Constructor ------------
    public GroceryList()
    {
        size=0;
        // Set gList to refer to a 'new' array of MAX_SIZE
        gList = new GroceryItemOrder[MAX_SIZE];

        // NOTE: We MUST fill each element with a GroceryItemOrder.
        for (int i=0; i<MAX_SIZE; i++)
        {
            gList[i] = new GroceryItemOrder();
        }
    }

    // ---------------- Helper Methods ---------
    public void add(GroceryItemOrder item)
    {
        if(size>MAX_SIZE-1){
            System.out.println("\t\t\tPROBLEM!! No more room left in the cart!!\n"+item);
        }else{
            gList[size] = new GroceryItemOrder(item.name,item.quantity,item.pricePerUnit); ;
            size++;        
        }   
    }           

    public String getTotalCost()
    {
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);                              
        double total = 0;

        for(int i=0;i<size;i++){
            total+=gList[i].getCost();
        }

        return moneyFormat.format(total);
    }

    // ------------------------ toString ----------------
    public String toString()
    {
        String a="";
        for(int i=0;i<size;i++){
            a = a+gList[i]+"\n";
        }
        return a;
    }
}

