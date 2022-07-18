

/**
 * Abstract class Student - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Student
{
    private int age;
    private double GPA;
    private String FirstName,LastName,gender;
    private Date DateOfBirth;

    public abstract String getGrade();

    public Student(){
        this("","","",0,0,null);
    }

    public Student(String FirstName,String LastName,
    String gender,int age, double GPA, Date DateOfBirth)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.gender = gender;
        this.age = age;
        this.GPA = GPA;
        this.DateOfBirth = DateOfBirth;
    }
    public String toString(){
        return "FirstName:" +FirstName+"\n"
        + "LastName:" + LastName+"\n"
        +"Age:" + age+"\n"
        +"GPA:" + GPA+"\n"
        +"DateOfBirth: "+ DateOfBirth+"\n"        ;
    }
}
