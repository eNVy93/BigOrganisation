package lt.nevytas.big_organisation.factory;

import lt.nevytas.big_organisation.entity.employee.Employed;
import lt.nevytas.big_organisation.entity.employee.Freelancer;
import lt.nevytas.big_organisation.entity.employee.Intern;
import lt.nevytas.big_organisation.entity.organisation.departament.Departament;

import java.util.Date;

public class EmployeeFactory {

    public Employed generateEmployed(String name, String surname, long id, Departament departament, float salary, Date startedWorking){
        return new Employed(name,surname,id,departament,salary,startedWorking);
    }

    public Intern generateIntern(String name, String surname, long id, Date startedWorking, Date worksTill){
        return new Intern(name,surname,id,startedWorking,worksTill);
    }
    public Freelancer generateFreelancer(String name, String surname, long id, float hourlyRate){
        return new Freelancer(name,surname,id,hourlyRate);
    }


}
