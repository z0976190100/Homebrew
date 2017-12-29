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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salaryRate, salaryRate) != 0) return false;
        return hoursPerPeriod == employee.hoursPerPeriod;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(salaryRate);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + hoursPerPeriod;
        return result;
    }
}
