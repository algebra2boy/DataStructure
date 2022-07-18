
/**
 * Write a description of class Senior here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Senior extends Student
{
    public Senior(){
        this("","","",0,0,null);
    }

    public Senior(String FirstName,String LastName,
    String gender,int age, double GPA, Date DateOfBirth)
    {
        super(FirstName,LastName,gender,age,GPA,DateOfBirth);
    }
    public String getGrade(){
        return "Senior";
    }
}
