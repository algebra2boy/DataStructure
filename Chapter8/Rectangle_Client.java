public class Rectangle_Client{
    public static void main(){
        Rectangle r1, r2,r3,r4;
        Point p1, p2;
        
        r1 = new Rectangle(3,15,5,10);        
        System.out.println("r1.getHeight() = " + r1.getHeight());
        System.out.println("r1.getWidth() = " + r1.getWidth());        
        System.out.println("r1.getX() = " + r1.getX());
        System.out.println("r1.getY() = " + r1.getY());        
        System.out.println("r1.toString() = " + r1.toString());
        System.out.println("r1.contians() = " + r1.contains(7,15));
        
        r2 = new Rectangle(new Point(2,7),1,2);        
        System.out.println("\nr2.getHeight() = " + r2.getHeight());
        System.out.println("r2.getWidth() = " + r2.getWidth());        
        System.out.println("r2.getX() = " + r2.getX());
        System.out.println("r2.getY() = " + r2.getY());        
        System.out.println("r2.toString() = " + r2.toString());
        System.out.println("r2.contians() = " + r2.contains(new Point(1,2)));
        
        r3 = new Rectangle(7,7,1,1);
        r4 = new Rectangle(9,12,3,8);
        System.out.println("r1.getHeight() = " + r3.getHeight());
        System.out.println("r1.getWidth() = " + r3.getWidth());        
        System.out.println("r1.getX() = " + r3.getX());
        System.out.println("r1.getY() = " + r3.getY());        
        System.out.println("r1.toString() = " + r3.toString());
        System.out.println("r1.contians() = " + r3.contains(1,2));
        System.out.println("r4 union+"+r2.union(r1));
    }
}