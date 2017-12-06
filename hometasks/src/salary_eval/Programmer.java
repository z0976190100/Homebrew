package salary_eval;

public class Programmer extends Employee {

    Programmer(double sr){
        super(sr);
    }

    @Override
    public double getPeriodSalary(int hours) {
      return getSalaryRate() * hours;
    }
}
