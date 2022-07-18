package Chapter17.SortListVia2Trees.Comparator;

import Chapter17.SortListVia2Trees.PersonNode;

import java.util.Comparator;

public class idComparator implements Comparator<PersonNode> {

    @Override
    public int compare(PersonNode person1, PersonNode person2) {
        return person1.getIdNum().compareTo(person2.getIdNum());
    }
}
