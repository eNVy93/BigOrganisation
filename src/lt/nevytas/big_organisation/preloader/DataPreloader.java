package lt.nevytas.big_organisation.preloader;

import lt.nevytas.big_organisation.entity.employee.Employed;
import lt.nevytas.big_organisation.entity.employee.Employee;
import lt.nevytas.big_organisation.entity.employee.Freelancer;
import lt.nevytas.big_organisation.entity.employee.Intern;
import lt.nevytas.big_organisation.entity.organisation.Organisation;
import lt.nevytas.big_organisation.entity.organisation.departament.Departament;
import lt.nevytas.big_organisation.factory.DepartamentFactory;
import lt.nevytas.big_organisation.factory.EmployeeFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataPreloader {

    private DepartamentFactory departamentFactory = new DepartamentFactory();
    private EmployeeFactory employeeFactory = new EmployeeFactory();

    public List<Departament> generateDepartamentList() {
        List<Departament> departaments = new ArrayList<>();

        Departament vilniusDepartament = (Departament) departamentFactory.generateDepartament(Organisation.VILNIUS_DEPARTAMENT_NAME);
        Departament kaunasDepartament = (Departament) departamentFactory.generateDepartament(Organisation.KAUNAS_DEPARTAMENT_NAME);
        Departament klaipedaDepartament = (Departament) departamentFactory.generateDepartament(Organisation.KLAIPEDA_DEPARTAMENT_NAME);
        Departament birzaiDepartament = (Departament) departamentFactory.generateDepartament(Organisation.BIRZAI_DEPARTAMENT_NAME);
        Departament panevezysDepartament = (Departament) departamentFactory.generateDepartament(Organisation.PANEVEZYS_DEPARTAMENT_NAME);

        departaments.add(vilniusDepartament);
        departaments.add(kaunasDepartament);
        departaments.add(klaipedaDepartament);
        departaments.add(birzaiDepartament);
        departaments.add(panevezysDepartament);

        return departaments;

    }

    private List<Employed> generateDepartamentWorkers(List<Departament> departaments) {
        List<Employed> employedEmployees = new ArrayList<>();
        for (Departament departament : departaments) {
            if (Organisation.VILNIUS_DEPARTAMENT_NAME.equals(departament.getDepartamentName())) {
                Employed v1 = employeeFactory.generateEmployed("Jonas", "Jonaitis", 9846546, departament, 12345, new Date(2008, 3, 8));
                Employed v2 = employeeFactory.generateEmployed("Petras", "Jonaitis", 5231526, departament, 14556, new Date(2010, 12, 11));
                Employed v3 = employeeFactory.generateEmployed("Jonas", "Petraitis", 5261216, departament, 22225, new Date(2003, 5, 18));
                Employed v4 = employeeFactory.generateEmployed("Ana", "Jonaitiene", 9235236, departament, 32345, new Date(2009, 6, 1));
                Employed v5 = employeeFactory.generateEmployed("Mana", "Petraityte", 9222346, departament, 12365, new Date(2008, 5, 21));
                Employed v6 = employeeFactory.generateEmployed("Angele", "Pagalbiene", 9823546, departament, 20045, new Date(20010, 5, 25));
                employedEmployees.add(v1);
                employedEmployees.add(v2);
                employedEmployees.add(v3);
                employedEmployees.add(v4);
                employedEmployees.add(v5);
                employedEmployees.add(v6);
            }
            if (Organisation.KAUNAS_DEPARTAMENT_NAME.equals(departament.getDepartamentName())) {
                Employed k1 = employeeFactory.generateEmployed("Aaaa", "DDdddd", 9846522, departament, 12349, new Date(2007, 4, 18));
                Employed k2 = employeeFactory.generateEmployed("B", "JDDd", 5231522, departament, 14559, new Date(2011, 11, 11));
                Employed k3 = employeeFactory.generateEmployed("JASsss", "ASgasga", 5261222, departament, 22229, new Date(2004, 4, 17));
                Employed k4 = employeeFactory.generateEmployed("ABbb", "Jonaibbe", 9235222, departament, 32399, new Date(2008, 7, 13));
                Employed k5 = employeeFactory.generateEmployed("Manabb", "Petraitbbyte", 9222322, departament, 12399, new Date(2007, 6, 11));
                Employed k6 = employeeFactory.generateEmployed("Angebble", "Pagalbbbiene", 9823522, departament, 20049, new Date(2011, 4, 29));
                employedEmployees.add(k1);
                employedEmployees.add(k2);
                employedEmployees.add(k3);
                employedEmployees.add(k4);
                employedEmployees.add(k5);
                employedEmployees.add(k6);
            }
            if (Organisation.KLAIPEDA_DEPARTAMENT_NAME.equals(departament.getDepartamentName())) {
                Employed kL1 = employeeFactory.generateEmployed("Joaaanas", "Jonaiaaatis", 9246546, departament, 12345, new Date(2007, 3, 8));
                Employed kL2 = employeeFactory.generateEmployed("Petraaaas", "Jonaitis", 5631526, departament, 16556, new Date(2015, 12, 11));
                Employed kL3 = employeeFactory.generateEmployed("Joaaanas", "Petraaaaaitis", 5222216, departament, 23225, new Date(2007, 9, 18));
                Employed kL4 = employeeFactory.generateEmployed("Anaaaa", "Jonaitiene", 9225236, departament, 35345, new Date(2016, 9, 1));
                Employed kL5 = employeeFactory.generateEmployed("Manaaaaa", "Petraityaaaate", 2222346, departament, 19365, new Date(2011, 9, 21));
                Employed kL6 = employeeFactory.generateEmployed("Angeaaaale", "Pagaaaaaalbiene", 2223546, departament, 21045, new Date(2017, 9, 25));
                employedEmployees.add(kL1);
                employedEmployees.add(kL2);
                employedEmployees.add(kL3);
                employedEmployees.add(kL4);
                employedEmployees.add(kL5);
                employedEmployees.add(kL6);
            }
            if (Organisation.BIRZAI_DEPARTAMENT_NAME.equals(departament.getDepartamentName())) {
                Employed b1 = employeeFactory.generateEmployed("Jolllnas", "Jolllnaiaaatis", 9242346, departament, 17745, new Date(2007, 3, 8));
                Employed b2 = employeeFactory.generateEmployed("Petllraaaas", "Jonaitis", 5625426, departament, 17756, new Date(2005, 12, 1));
                Employed b3 = employeeFactory.generateEmployed("Joalaanas", "Petlllaaaitis", 5227816, departament, 23777, new Date(2017, 9, 28));
                Employed b4 = employeeFactory.generateEmployed("Anallaaa", "Jollltiene", 9212336, departament, 77145, new Date(2017, 11, 1));
                Employed b5 = employeeFactory.generateEmployed("Mlllanaaaaa", "Pelllaaaate", 2555546, departament, 17765, new Date(2017, 10, 11));
                Employed b6 = employeeFactory.generateEmployed("Anlllgeaaaale", "Pagalllllaalbiene", 5523546, departament, 27775, new Date(2017, 9, 25));
                employedEmployees.add(b1);
                employedEmployees.add(b2);
                employedEmployees.add(b3);
                employedEmployees.add(b4);
                employedEmployees.add(b5);
                employedEmployees.add(b6);
            }
            if (Organisation.PANEVEZYS_DEPARTAMENT_NAME.equals(departament.getDepartamentName())) {
                Employed p1 = employeeFactory.generateEmployed("Jolyyyllnas", "Jolllnaiyyyaaatis", 9111346, departament, 11745, new Date(2017, 3, 8));
                Employed p2 = employeeFactory.generateEmployed("Petllrayyyaaas", "Joyyynaitis", 5111126, departament, 11156, new Date(2017, 12, 1));
                Employed p3 = employeeFactory.generateEmployed("Joalaayyynas", "Petyyylllaaaitis", 5211116, departament, 21177, new Date(2017, 5, 3));
                Employed p4 = employeeFactory.generateEmployed("Anallayyyaa", "Jollyyyltiene", 1211136, departament, 11145, new Date(2017, 4, 2));
                employedEmployees.add(p1);
                employedEmployees.add(p2);
                employedEmployees.add(p3);
                employedEmployees.add(p4);
            }

        }
        return employedEmployees;
    }

    private List<Intern> generateInternList() {
        List<Intern> internList = new ArrayList<>();
        Intern intern1 = employeeFactory.generateIntern("Internas", "Internovicius", 6543123, new Date(2018, 1, 5), new Date(2018, 4, 1));
        Intern intern2 = employeeFactory.generateIntern("Internaaaa", "Internaaaus", 7743123, new Date(2017, 11, 5), new Date(2018, 3, 10));
        Intern intern3 = employeeFactory.generateIntern("Inbbbnas", "Intebbbcius", 8883123, new Date(2017, 12, 2), new Date(2018, 4, 8));
        internList.add(intern1);
        internList.add(intern2);
        internList.add(intern3);
        return internList;
    }

    private List<Freelancer> generateFreelancerList() {
        List<Freelancer> freelancerList = new ArrayList<>();
        Freelancer freelancer1 = employeeFactory.generateFreelancer("Free", "Lanceris", 59595959, 10);
        Freelancer freelancer2 = employeeFactory.generateFreelancer("Freedas", "Laaeris", 22295959, 11);
        Freelancer freelancer3 = employeeFactory.generateFreelancer("Freebas", "Zooounceris", 11195959, 12);
        Freelancer freelancer4 = employeeFactory.generateFreelancer("Freegas", "Babameris", 53395959, 9);
        freelancerList.add(freelancer1);
        freelancerList.add(freelancer2);
        freelancerList.add(freelancer3);
        freelancerList.add(freelancer4);
        return freelancerList;

    }

    public List<Employee> generateAllEmployeesList() {
        List<Employee> employeeList = new ArrayList<>();
        List<Departament> dl = generateDepartamentList();
        List<Employed> dw = generateDepartamentWorkers(dl);
        List<Freelancer> fw = generateFreelancerList();
        List<Intern> il = generateInternList();
        employeeList.addAll(dw);
        employeeList.addAll(fw);
        employeeList.addAll(il);
        return employeeList;
    }
}
