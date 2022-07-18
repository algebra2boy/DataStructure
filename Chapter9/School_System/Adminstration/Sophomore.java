
/**
 * Write a description of class Sophomire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sophomore extends Student
{
    public Sophomore(){
        this("","","",0,0,null);
    }

    public Sophomore(String FirstName,String LastName,
    String gender,int age, double GPA, Date DateOfBirth)
    {
        super(FirstName,LastName,gender,age,GPA,DateOfBirth);
    }

    public String getGrade(){
        return "Sophomore";
    }
}
