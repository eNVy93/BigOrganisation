package lt.nevytas.big_organisation.comparator;

import lt.nevytas.big_organisation.entity.employee.Employee;
import lt.nevytas.big_organisation.entity.employee.Freelancer;

import java.util.Comparator;

public class ComparatorByHourlyRate implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1 instanceof Freelancer && o2 instanceof  Freelancer){
            Freelancer f1 = (Freelancer) o1;
            Freelancer f2 = (Freelancer) o2;
            if(f1.getHourlyRate()>f2.getHourlyRate()){
                return 1;
            } else if (f1.getHourlyRate()<f2.getHourlyRate()){
                return -1;
            }
        }
        return 0;
    }
}
