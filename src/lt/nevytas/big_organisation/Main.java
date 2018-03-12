package lt.nevytas.big_organisation;

import lt.nevytas.big_organisation.entity.employee.Employed;
import lt.nevytas.big_organisation.entity.employee.Employee;
import lt.nevytas.big_organisation.entity.employee.Freelancer;
import lt.nevytas.big_organisation.preloader.DataPreloader;
import lt.nevytas.big_organisation.service.OrganisationService;
import lt.nevytas.big_organisation.utils.MyUtils;

import java.util.List;

public class Main {

    static MyUtils utils = new MyUtils();
    static DataPreloader preloader = new DataPreloader();
    static OrganisationService service = new OrganisationService();
    public static void main(String[] args) {
        List<Employee> fullList = preloader.generateAllEmployeesList();
        service.getAndSortFreelancersByHourlyRate(fullList);
        System.out.println("Intern count: " + service.getInternCount(fullList));
        List<Employed> sortedEmployeedListFromKaunas = service.getAllEmployeesFromKaunasAndSortBySurname(fullList);
        List<Employed> sortedEmployedList = service.sortEmployedBySurname(fullList);
//        for (Employee emp :
//                sortedEmployedList){
//            System.out.println(emp);
//        }
        System.out.print(sortedEmployedList);
    }
}
