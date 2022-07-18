import java.util.*; 
public class Machine_Client
{
    public static void main(){
        Date date=java.util.Calendar.getInstance().getTime(); 
        System.out.println(date+"\n"); 
        Movie  morning = new Movie();
        Movie afternoon;
        
        ////Fill m   (Name, minutes,price, count)   Time 9h30
        morning.add(new MovieOptions("Star War",90,10.99,20,new Time(9,30)));
        morning.add(new MovieOptions("Pikacha",60,8.99,15,new Time(10,50)));
        morning.add(new MovieOptions("Iron man",110,12.99,7,new Time(11,20)));
        System.out.println(morning+"\n\n");
        
        //Fill the afternoon and night show
        afternoon = morning;
        afternoon.timeChange(new Time(3,30));
        System.out.println(afternoon+"\n");
    }
}
/*
String input; int select;
Movie.modifyTax_percent(1.065);


Scanner console = new Scanner(System.in);
System.out.println("Welcome to AMC, here are some movies we have\n");
System.out.print("Would you like to purchase tickets(Y/N)");
input = console.next();

if(input.equals("Y")){
System.out.println("\nWhich movie do you want to watch, \nplease select the number of the movie");
select = console.nextInt();

if(select>movie.size()||select<=0){
throw new IllegalArgumentException("the movie is out of bound");
}

System.out.println("How many tickets would you like/n a ticket is $12.99");
int tickets = console.nextInt();

if(tickets<0||tickets>movie.get(select-1).getCount()){
throw new IllegalArgumentException("not valid");
}
for(int i=1;i<=select;i++){
movie.get(select-1).count();
}

System.out.println("Please select seat");
for(int i = 1;i<=tickets;i++){
System.out.print("Row_number");
int row = console.nextInt();
System.out.print("column_number");
int column = console.nextInt();
Ticket t = new Ticket(row,column);
Ticket.add(t);
t.calculateCost();
}
}else{
System.out.println("Thank you please come back again");
}
}*/

