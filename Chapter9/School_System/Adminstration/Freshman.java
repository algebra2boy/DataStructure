
/**
 * Write a description of class Freshman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Freshman extends Student
{
    public Freshman(){
        this("","","",0,0,null);
    }
    public Freshman(String FirstName,String LastName,
    String gender,int age, double GPA, Date DateOfBirth)
    {
        super(FirstName,LastName,gender,age,GPA,DateOfBirth);
    }
    public String getGrade(){
        return "Freshman";
    }
}
