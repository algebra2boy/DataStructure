import java.util.*;
public class Shape_Main {
    public static void main() {
        ArrayList<Shape> ALL = new ArrayList<Shape>();
        
        ALL.add(new Circle(8,new Point(6,5)) );
        ALL.add(new Semicircle(6,new Point(3,4)) );
        ALL.add(new Square(2));
        ALL.add(new Rectangle(5,6) );
        ALL.add(new Triangle(7,4,6) );
        ALL.add(new Equilateral_Triangle(5));
        ALL.add(new Isosceles_Triangle(9,7));
        
        ALL.add(new Cube(5));
        ALL.add(new Rectangular(3,4,5));
        ALL.add(new Cylinder(9,10));
        ALL.add(new Cone(12,8));
        ALL.add(new sphere(5));
        
        for(Shape a : ALL){
            a.printInfo();
        }
        
        Shape cic = new Circle(3,1,4);
        /*
         * checkkkk
        ALL.add(new Square(2));
        ALL.add(new Square(2));
        System.out.println(ALL.get(0).equals(ALL.get(1)));*/
    }
}
