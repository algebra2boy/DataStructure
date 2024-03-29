public class Line_Client
{
    public static void main(){
        // Ex 14
        System.out.println("    Line - Exercise #14:");
        Line line1 = new Line(new Point(1,1), new Point(7,5));
        System.out.println("line1.getP1() = " + line1.getP1());
        System.out.println("line1.getP2() = " + line1.getP2());
        System.out.println("line1 = " + line1.toString());
        System.out.println();
        
        // Ex 15
        System.out.println("    Line - Exercise #15:");        
        System.out.println("line1.getSlope() = " + line1.getSlope());
        System.out.println();
        
        // Ex 16
        System.out.println("    Line - Exercise #16:");        
        Line line2 = new Line(2,2,2,10);
        Line line3 = new Line(3,7,10,7);
        System.out.println("line2 = " + line2.toString());
        System.out.println("line2 = " + line3);      
        System.out.println();   
        
        // Ex 17
        System.out.println("    Line - Exercise #17:");        
        Point p1 = new Point(4,3);
        Point p2 = new Point(2,5);
        Point p3 = new Point(15,7);   
        Point p4 = new Point(10,10);       
        System.out.println("  These isCollinear ones SHOULD work:");
        System.out.println("line1.isCollinear(p1)) = " + line1.isCollinear(p1));
        System.out.println("line2.isCollinear(p2)) = " + line2.isCollinear(p2));
        System.out.println("line3.isCollinear(p3)) = " + line3.isCollinear(p3));               
        System.out.println("  These isCollinear ones should NOT work:");
        System.out.println("line1.isCollinear(p4)) = " + line1.isCollinear(p4));
        System.out.println("line2.isCollinear(p4)) = " + line2.isCollinear(p4));
        System.out.println("line3.isCollinear(p4)) = " + line3.isCollinear(p4));
        System.out.println();            
    }
}
