import java.util.*;
public class studentAverageComparator implements Comparator<Student>
{
    public int compare(Student s1,Student s2){
        return (int)(s1.average - s2.average);
    }
}
