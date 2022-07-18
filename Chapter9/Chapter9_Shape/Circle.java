public class Circle extends Shape_2D{
    private double radius;
    private int x,y;
    private static final double PI = Math.PI;
    private Point p;
    public Circle(){
        this(0,0,0);
    }

    public Circle(double radius,int x,int y)
    {
        this(radius,new Point(x,y));
    }

    public Circle(double radius,Point that)
    {
        this.radius = radius;
        p = that;
    }

    public double getArea()
    {
        return PI * radius * radius;

    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public String getName()
    {
        return "Circle";
    }

    public double getRadius()
    {
        return radius;
    }

    public int getSideCount()
    {
        return 0;
    }

    public boolean equals(Object that)
    {
        if(that instanceof Circle)
        {
            Circle other = (Circle)that;
            return this.radius == other.radius;
        }
        return false;
    }
}
