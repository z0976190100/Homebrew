package salary_eval;

import static salary_eval.Calendarr.thisMonthWorkingHoursQuantity;

public class Manager extends Employee{

    Manager(double sr){
        super(sr);
    }

    @Override
    public double getPeriodSalary(int hours) {
        switch (hours){
            case 100500:
                return this.getSalaryRate();
            default:
                return (this.getSalaryRate() / (thisMonthWorkingHoursQuantity))* hours;
        }
    }
}
