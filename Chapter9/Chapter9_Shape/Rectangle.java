public class Rectangle extends Shape_2D{
    private double length;
    private double width;

    public Rectangle(){
        this(0,0);
    }
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
     @Override
    public String getName(){
        return "Rectangle";
    }
    public int getSideCount()
    {
        return 4;
    }
    public boolean equals(Object that)
    {
        if(that instanceof Rectangle)
        {
            Rectangle other = (Rectangle)that;
            return this.length == other.width && this.length == other.width;
        }
        return false;
    }
}
