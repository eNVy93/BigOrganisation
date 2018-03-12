package lt.nevytas.big_organisation.entity.employee;

public abstract class Employee {

    private String employeeName;
    private String employeeSurname;
    private long personalIdNumber;

    public Employee(String employeeName, String employeeSurname, long personalIdNumber) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.personalIdNumber = personalIdNumber;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public long getPersonalIdNumber() {
        return personalIdNumber;
    }

    public void setPersonalIdNumber(long personalIdNumber) {
        this.personalIdNumber = personalIdNumber;
    }

    @Override
    public String toString() {
        return "Employee surname : " + this.getEmployeeSurname();
    }
}
