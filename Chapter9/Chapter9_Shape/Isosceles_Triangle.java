
/**
 * Write a description of class d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Isosceles_Triangle extends Triangle
{
    public Isosceles_Triangle(){
        super();
    }
    public Isosceles_Triangle(double equalSide,double side){
        super(equalSide,equalSide,side);
    }
    public String getName(){
        return "Isosceles";
    }
    public int getSideCount()
    {
        return super.getSideCount();
    }
}
