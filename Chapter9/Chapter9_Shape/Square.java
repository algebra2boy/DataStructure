
public class Square extends Rectangle
{
    public Square(){
        this(0);
    }
    public Square(int side){
        super(side,side);
    }

    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return 4*getLength();
    }
    public String getName(){
        return "Square";
    }
    public int getSideCount()
    {
        return super.getSideCount();
    }
}
