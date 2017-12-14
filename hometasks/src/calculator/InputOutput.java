package calculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InputOutput {

static String getUserInput (){
    Scanner sc = new Scanner(System.in);
    String userInput = sc.nextLine();
    //parseUserInput(userInput);
    return userInput;
}


static void userOutput(BigDecimal output){
    System.out.println("=" + output.toString());
}
// cases with regexps
private void parseUserInput (String uInput){
    DecimalFormat df = new DecimalFormat();
    df.setParseBigDecimal(true);
   BigDecimal parsed = new BigDecimal(uInput);
    ///CalculatorController.dispatchOperator(uInput);
}


}
