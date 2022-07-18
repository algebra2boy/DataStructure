/**
 * Building Java Programs 3rd Edition
 * Chapter 8
 * pg 571
 * Programming Project #3: Grocery
 */

import java.text.NumberFormat;
import java.util.Locale;

public class GroceryItemOrder
{
    String name;
    int quantity;
    double pricePerUnit;

    // -------------- Constructors ---------------
    public GroceryItemOrder()
    {
        this("",0,0);
    }
    public GroceryItemOrder(String name,int quantity,double pricePerUnit)
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }    
    // ----------------- Helper Methods -------------
    public double getCost()
    {
        return quantity*pricePerUnit;
    }
    public void setQuantity(int q)
    {
        quantity = q;
    }
    
    // ----------------- toString ----------------
    public String toString()
    {
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);                      
    
       return "Item Name: " + name +
              "\t Quantity: " + quantity +
              "\t Price Per Unit: $" + pricePerUnit +
              "\t Cost: " + moneyFormat.format(getCost());
    }
   
}
