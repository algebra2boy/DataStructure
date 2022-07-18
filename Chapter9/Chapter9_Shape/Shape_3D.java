import java.text.DecimalFormat;
public abstract class Shape_3D implements Shape
{
    public abstract double getSurfaceArea(); 
    public abstract double getVolumn();
    public abstract String getName();
    public void printInfo(){
        DecimalFormat df = new DecimalFormat("#######.#####");
        System.out.printf("%-9s\tSurfaceArea = "+df.format(getSurfaceArea())+", Volumn = "
        +df.format(getVolumn())+"\n",getName());
    }
}
