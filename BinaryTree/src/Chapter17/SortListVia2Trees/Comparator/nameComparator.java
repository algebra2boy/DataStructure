package Chapter17.SortListVia2Trees.Comparator;

import Chapter17.SortListVia2Trees.PersonNode;

import java.util.Comparator;

public class nameComparator implements Comparator<PersonNode> {
    @Override
    public int compare(PersonNode person1, PersonNode person2) {
        if (person1.getLastName().compareTo(person2.getLastName())== 0) { // same Last Name
            if(person1.getFirstName().compareTo(person2.getFirstName()) == 0){  // same FirstName
                return person1.getMiddleName().compareTo(person2.getMiddleName());
            }else{
                return person1.getFirstName().compareTo(person2.getFirstName());
            }
        }else{
            return person1.getLastName().compareTo(person2.getLastName());
        }
    }
}
