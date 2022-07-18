import java.util.*;
public class letterGradeComparator implements Comparator<Student>
{
    public int compare(Student s1,Student s2){
        return (int)s1.letterGrade - (int) s2.letterGrade;
    }
}
