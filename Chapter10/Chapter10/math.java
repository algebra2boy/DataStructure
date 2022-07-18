
public class math
{
    public static void main()
    {
        int[] Function = {0,1,3,6,9,10,16}; 
        double[] values = {(double)5/33,7,10,(double)-5/64,3,(double)4/5,(double)3/8};
        findSlope(Function,values);
    }

    public static void findSlope(int[] function,double[] values)
    {
        for(int i=0;i<function.length-1;i++){
            {
                for(int j=i+1;j<function.length;j++)
                {
                    System.out.println("x1 ="+function[i]+"\tf(x1) ="+ values[i]);
                    System.out.println("x2 ="+function[j]+"\tf(x2) ="+ values[j]);
                    System.out.println("slope is "+(
                    
                    (double)values[j]-values[i])/(function[j]-function[i])+"\n");
                }
            }
        }
    }
}