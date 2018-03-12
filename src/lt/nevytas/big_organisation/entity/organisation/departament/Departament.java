package lt.nevytas.big_organisation.entity.organisation.departament;

import lt.nevytas.big_organisation.entity.employee.Employee;
import lt.nevytas.big_organisation.entity.organisation.Organisation;

import java.util.ArrayList;
import java.util.List;

public class Departament extends Organisation {

    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Departament(String departamentName) {
        super(departamentName);
    }
}
