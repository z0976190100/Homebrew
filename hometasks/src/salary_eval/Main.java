package salary_eval;

import static salary_eval.Calendarr.thisMonthWorkingHoursQuantity;

public class Main {

    public static void main(String[] args) {
        Bookie bookie = new Bookie();
        Employee pr = new Programmer(100500.00);
        Employee mg = new Manager(0.6);
        thisMonthWorkingHoursQuantity = 160;

        System.out.println(bookie.takeYourMoneyPlease(pr, 160));
        System.out.println(bookie.takeYourMoneyPlease(mg, 100));


    }

}
