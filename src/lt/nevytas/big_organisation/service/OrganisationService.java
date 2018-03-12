package lt.nevytas.big_organisation.service;

import lt.nevytas.big_organisation.comparator.ComparatorByHourlyRate;
import lt.nevytas.big_organisation.comparator.ComparatorBySurname;
import lt.nevytas.big_organisation.entity.employee.Employed;
import lt.nevytas.big_organisation.entity.employee.Employee;
import lt.nevytas.big_organisation.entity.employee.Freelancer;
import lt.nevytas.big_organisation.entity.employee.Intern;
import lt.nevytas.big_organisation.entity.organisation.Organisation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrganisationService {

    public List<Freelancer> getAndSortFreelancersByHourlyRate(List<Employee> employees) {
        List<Freelancer> sortedList = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp instanceof Freelancer) {
                sortedList.add((Freelancer) emp);
            }
        }
        Collections.sort(sortedList, new ComparatorByHourlyRate());
        for (Freelancer fl : sortedList) {
            System.out.println(fl.getHourlyRate());
        }
        return sortedList;
    }

    public int getInternCount(List<Employee> employees) {
        List<Intern> internList = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp instanceof Intern) {
                internList.add((Intern) emp);
            }
        }
        return internList.size();
    }

    public List<Employed> getAllEmployeesFromKaunasAndSortBySurname(List<Employee> employees) {
        List<Employed> resultList = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp instanceof Employed
                    && Organisation.KAUNAS_DEPARTAMENT_NAME.equals(((Employed)emp).getDepartament().getDepartamentName())) {
                Employed employed = (Employed) emp;
                resultList.add(employed);
                Collections.sort(resultList,new ComparatorBySurname());
            }
        }
        System.out.println("SORTED KAUNAS LIST SIZE : " + resultList.size());
        return resultList;
    }

    public List<Employed> sortEmployedBySurname(List<Employee> employees){
        List<Employed> resultList = new ArrayList<>();
        for (Employee e: employees){
            if(e instanceof Employed){

                Employed employed = (Employed) e;
                resultList.add(employed);
                Collections.sort(resultList, new ComparatorBySurname());
            }
        }

        return resultList;
    }

}
