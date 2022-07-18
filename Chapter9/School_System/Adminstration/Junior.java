
/**
 * Write a description of class Junior here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Junior extends Student
{
    public Junior(){
        this("","","",0,0,null);
    }

    public Junior(String FirstName,String LastName,
    String gender,int age, double GPA, Date DateOfBirth)
    {
        super(FirstName,LastName,gender,age,GPA,DateOfBirth);
    }
    public String getGrade(){
        return "Junior";
    }
}
