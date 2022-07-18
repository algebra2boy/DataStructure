
public class Hexagon extends Shape_2D
{
    private double side;
    public  double getArea()
    {
        return (side*side)*((3*Math.sqrt(3))/2);
    }
    public  double getPerimeter()
    {
        return getSideCount()*side;
    }
    public String getName()
    {
        return "Hexagon";
    }
    public int getSideCount()
    {
        return 6;
    }
    public double getSide()
    {
        return side;
    }
}
