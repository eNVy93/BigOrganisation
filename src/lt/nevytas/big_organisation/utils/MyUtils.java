package lt.nevytas.big_organisation.utils;

import lt.nevytas.big_organisation.entity.employee.Employee;

import java.util.List;

public class MyUtils {
    public void printEmployeeList(List<Employee> employees){
        StringBuilder sb = new StringBuilder();
        for (Employee emp: employees){
            sb.append("Employee name: " + emp.getEmployeeName()+"\n");
            sb.append("Employee surname: " + emp.getEmployeeSurname() + "\n");
            sb.append("Employee id: " + emp.getPersonalIdNumber() + "\n");

        }
        System.out.println(sb);

    }
}
