package lt.nevytas.big_organisation.entity.employee;

public class Freelancer extends Employee {

    private float hourlyRate;

    public Freelancer(String employeeName, String employeeSurname, long personalIdNumber, float hourlyRate) {
        super(employeeName, employeeSurname, personalIdNumber);
        this.hourlyRate = hourlyRate;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
