import java.util.*;
public class studentIDComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2){
        return s1.idNum.compareTo(s2.idNum);
    }
}
