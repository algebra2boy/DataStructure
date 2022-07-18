public class Triangle extends Shape_2D {
    private double a,b,c;
    public Triangle(){
        this(0,0,0);
    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public String getName(){
        return "Triangle";
    }

    public int getSideCount()
    {
        return 3;
    }

    public boolean equals(Object that)
    {
        if(that instanceof Triangle)
        {
            Triangle other = (Triangle)that;
            return this.a == other.a && this.b == other.b && this.c == other.c;
        }
        return false;
    }
}