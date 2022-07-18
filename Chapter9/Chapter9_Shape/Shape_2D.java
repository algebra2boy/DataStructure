import java.text.DecimalFormat;

public abstract class Shape_2D implements Shape
{
    public abstract double getArea(); 
    public abstract double getPerimeter();
    public abstract String getName();
    public abstract int getSideCount();
    public void printInfo(){
        DecimalFormat df = new DecimalFormat("#######.#####");
        System.out.printf("%-9s\tArea = "+df.format(getArea())+", Perimeter = "
        +df.format(getPerimeter())+"\n",getName());
    }
}

