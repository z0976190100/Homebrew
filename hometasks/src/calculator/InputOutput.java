package calculator;

import java.math.BigDecimal;
import java.text.Format;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class InputOutput {

    static String locale = "ua";

    static String getUserInput() {

        String nextLine = "";

        try {
            Scanner sc = new Scanner(System.in);
            nextLine = sc.next("(\\+?|\\-?)(0\\.)?((\\,?)(\\d){1,3})*\\.?\\d+");
            if (nextLine == "") getUserInput();

            if (nextLine.contains(",")) {
                nextLine = nextLine.replaceAll("\\,*", "");
                locale = "us";
            }

        } catch (InputMismatchException e) {
            nextLine = "you wrong, repeat input.";
            getUserInput();

        } finally {
            return nextLine;
        }
    }

    static String getUserInputOperator() {

        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();
        return nextLine;
    }

    static void userOutput(BigDecimal output) {
        if (locale == "us") {
            userOutputLocale(output);
            return;
        }
        System.out.println("=" + output.toString());
    }

    static void userOutputLocale(BigDecimal output) {

        Locale locale = new Locale("en", "US");
        Format format = NumberFormat.getCurrencyInstance(locale);
        String formattedAmount = format.format(output);
        System.out.println("=" + formattedAmount);
    }

/*private void parseUserInput (String uInput){
    DecimalFormat df = new DecimalFormat();
    df.setParseBigDecimal(true);
   BigDecimal parsed = new BigDecimal(uInput);
    ///CalculatorController.dispatchOperator(uInput);
}*/


}
