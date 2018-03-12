package lt.nevytas.big_organisation.entity.employee;

import java.util.Date;

public class Intern extends Employee {

    private Date startedWorking;
    private Date worksTill;

    public Intern(String employeeName, String employeeSurname, long personalIdNumber, Date startedWorking, Date worksTill) {
        super(employeeName, employeeSurname, personalIdNumber);
        this.startedWorking = startedWorking;
        this.worksTill = worksTill;
    }

    public Date getStartedWorking() {
        return startedWorking;
    }

    public void setStartedWorking(Date startedWorking) {
        this.startedWorking = startedWorking;
    }

    public Date getWorksTill() {
        return worksTill;
    }

    public void setWorksTill(Date worksTill) {
        this.worksTill = worksTill;
    }
}
