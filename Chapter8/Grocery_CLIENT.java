/**
 * Building Java Programs 3rd Edition
 * Chapter 8
 * pg 571
 * Programming Project #3: Grocery
 * 
 */

/*
OUTPUT:

Filling g1.
g1 list: 
Item Name: Apples	 Quantity: 5	 Price Per Unit: $0.49	 Cost: $2.45
Item Name: Bananas	 Quantity: 3	 Price Per Unit: $0.35	 Cost: $1.05
Item Name: Cantelope Quantity: 4	 Price Per Unit: $1.23	 Cost: $4.92
Item Name: Dates	 Quantity: 10	 Price Per Unit: $1.22	 Cost: $12.20
Item Name: Eggplant	 Quantity: 3	 Price Per Unit: $2.55	 Cost: $7.65

	 g1 total = $28.27



Filling g2.
 		 PROBLEM!! No more room left in the cart!!
Item: Item Name: M&M	 Quantity: 2	 Price Per Unit: $1.29	 Cost: $2.58 NOT added!!

g2 list: 
Item Name: Almond Joy	 Quantity: 10	 Price Per Unit: $0.25	 Cost: $2.50
Item Name: Babe Ruth	 Quantity: 2	 Price Per Unit: $0.4	 Cost: $0.80
Item Name: Crunch	     Quantity: 2	 Price Per Unit: $0.1	 Cost: $0.20
Item Name: Gummy Dots	 Quantity: 20	 Price Per Unit: $0.05	 Cost: $1.00
Item Name: Easter Egg	 Quantity: 1	 Price Per Unit: $1.99	 Cost: $1.99
Item Name: Fun Dip	     Quantity: 1	 Price Per Unit: $0.99	 Cost: $0.99
Item Name: Goa Bar	     Quantity: 2	 Price Per Unit: $0.39	 Cost: $0.78
Item Name: Hershey	     Quantity: 1	 Price Per Unit: $1.0	 Cost: $1.00
Item Name: Grand	     Quantity: 2	 Price Per Unit: $0.19	 Cost: $0.38
Item Name: Kit Kat	     Quantity: 3	 Price Per Unit: $2.0	 Cost: $6.00

	 g2 total = $15.64

*/

public class Grocery_CLIENT
{

   public static void main()
   {
    GroceryList g1 = new GroceryList();
    GroceryList g2 = new GroceryList();     
        
       System.out.println("Filling g1.");
       g1.add(new GroceryItemOrder("Apples",5,0.49));
       g1.add(new GroceryItemOrder("Bananas",3,0.35));
       g1.add(new GroceryItemOrder("Cantelope",4,1.23));
       g1.add(new GroceryItemOrder("Dates",10, 1.22));
       g1.add(new GroceryItemOrder("Eggplant",3, 2.55));
       System.out.println("g1 list: \n" + g1);
       System.out.println("\t g1 total = " + g1.getTotalCost());
       System.out.println("\n\n");
       
      System.out.println("Filling g2.");       
       g2.add(new GroceryItemOrder("Almond Joy",10,0.25));
       g2.add(new GroceryItemOrder("Babe Ruth",2,0.40));
       g2.add(new GroceryItemOrder("Crunch",2,0.10));
       g2.add(new GroceryItemOrder("Gummy Dots",20, 0.05));
       g2.add(new GroceryItemOrder("Easter Egg",1, 1.99));     
       g2.add(new GroceryItemOrder("Fun Dip",1,0.99));
       g2.add(new GroceryItemOrder("Goa Bar",2,0.39));
       g2.add(new GroceryItemOrder("Hershey",1,1.00));
       g2.add(new GroceryItemOrder("Grand",2,0.19));
       g2.add(new GroceryItemOrder("Kit Kat",3,2));
       g2.add(new GroceryItemOrder("M&M",2,1.29));       
       System.out.println("g2 list: \n" + g2);
       System.out.println("\t g2 total = " + g2.getTotalCost());   
    }
  
}

// ========================================================

