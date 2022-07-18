public class Cube extends Rectangular
{
    public Cube(){
        this(0);
    }
    public Cube(double side){
        super(side,side,side);
    }
     @Override
    public double getSurfaceArea(){
        return 6*(getSide()*getSide());
    }
     @Override
    public double getVolumn(){
        return getSide()*getSide()*getSide();
    }
    public String getName(){
        return "Cube";
    }
}
