public class Ticket
{
    private int row, column;
    private double cost;
    public Ticket(int row,int column){
        this.row = row; 
        this.column = column;
    }
    public void printTicket(){
        
    }
    public void calculateCost(){
        cost+=12.99;
    }
    
}
