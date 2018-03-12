package lt.nevytas.big_organisation.entity.employee;

import lt.nevytas.big_organisation.entity.organisation.departament.Departament;

import java.util.Date;

import static com.sun.xml.internal.ws.util.VersionUtil.compare;

public class Employed extends Employee implements Comparable<Employed> {

    private Departament departament;
    private float salary;
    private Date startedWorking;


    public Employed(String employeeName, String employeeSurname, long personalIdNumber, Departament departament, float salary, Date startedWorking) {
        super(employeeName, employeeSurname, personalIdNumber);
        this.departament = departament;
        this.salary = salary;
        this.startedWorking = startedWorking;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getStartedWorking() {
        return startedWorking;
    }

    public void setStartedWorking(Date startedWorking) {
        this.startedWorking = startedWorking;
    }

    @Override
    public int compareTo(Employed o) {
        String surname1 = this.getEmployeeSurname();
        String surname2 = o.getEmployeeSurname();
        return surname1.compareTo(surname2);
    }
}
