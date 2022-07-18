import java.util.ArrayList;

public class Ap_exam1
{
    //655X6VY4
    //Y.T.


    //PART a
    public Bicycle[] getChoices(int n, String type,boolean assembled)
    {
        Bicycle[] bicycles = new Bicycle[n];
        int index = 0;
        int amount = 0;
        for(int i=0;i<bicycleList.size();i++)
        {

            if(bicycleList.get(i).getType().equals(type)
                    &&bicycleList.get(i).isAssembled().equals(assembled))
            {
                bicycles[index] = bicycleList.get(i);
                index++;
                amount++;
            }
        }
        if(amount<n)
        {
            for(int i=index;i<bicycles.length;i++)
            {
                bicycles[i] = null;
            }
        }
        return bicycles;
    }



    //Part b
    public Bicycle chooseOne(int n, String type,boolean assembled)
    {
        Bicycle[] bicycles = getChoices(n,type,assembled);
        int select = (int) Math.random()*bicycles.length;
        return bicycles[select];
    }



    //Part c
    Header: public Bicycle[] getBicyclesByWheelSize(double wheelSize)

    I would add a private instance variable for the wheelSize to keep track of the size
    in the Bicyle class, and have an accssor method called getwheelSize to return the instance variable
    WheelSize,also I would need to accept the parameter(wheelSize) in the constructor in the Bicycle class.




}
