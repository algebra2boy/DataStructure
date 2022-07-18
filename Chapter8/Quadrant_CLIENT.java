public class Quadrant_CLIENT
{
    public static void main(){
        Point pt = new Point(1,-3);
        Point p2 = new Point(10,2);
        System.out.println("p2:"+p2.toString());
        System.out.println("pt:"+pt.toString()+"\tThis is in Quadrant "+pt.getQuadrant());
        pt.flip();
        System.out.println("After flip:"+pt.toString());
        System.out.println("ManhattanDistance is "+pt.ManhattanDistance(p2));
        System.out.println("isVertical:" +pt.isVertical(p2));
        System.out.println("slope:"+pt.getSlope(p2));
        Point p3 = new Point(5,3);
        System.out.println("pt.isCollinear(p2,p3):"+pt.isCollinear(p2,p3)+"\n");
    }
  
}
