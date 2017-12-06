package salary_eval;

public abstract class Employee {

    private double salaryRate;
    private int hoursPerPeriod;

    Employee(){}

    Employee(double sr){
        this.salaryRate = sr;
    }

    public abstract double getPeriodSalary(int hours);

    double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public int getHoursPerPeriod() {
        return hoursPerPeriod;
    }

    public void setHoursForPeriod(int hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
    }
}
