import java.util.*;
public class studentLastNameComparator implements Comparator<Student>
{
    public int compare(Student s1,Student s2){
        return s1.lastName.compareTo(s2.lastName);
    }
}
