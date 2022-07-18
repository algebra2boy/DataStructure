
public class Equilateral_Triangle extends Triangle
{
    public Equilateral_Triangle(){
        super();
    }
    public Equilateral_Triangle(double side){
        super(side,side,side);
    } 
    public String getName(){
        return "Equilateral";
    }
    public int getSideCount()
    {
        return super.getSideCount();
    }
}
