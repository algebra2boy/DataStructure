
public class Octagon extends Shape_2D
{
    private double side;
    public  double getArea()
    {
        return 2*(1+Math.sqrt(2))*(side*side);
    }
    public  double getPerimeter()
    {
        return getSideCount()*side;
    }
    public String getName()
    {
        return "Octagon";
    }
    public int getSideCount()
    {
        return 8;
    }
    public double getSide()
    {
        return side;
    }
}
