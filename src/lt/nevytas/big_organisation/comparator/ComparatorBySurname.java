package lt.nevytas.big_organisation.comparator;

import lt.nevytas.big_organisation.entity.employee.Employed;

import java.util.Comparator;

public class ComparatorBySurname implements Comparator<Employed> {
    @Override
    public int compare(Employed o1, Employed o2) {
        return  o1.compareTo(o2);

    }
}
