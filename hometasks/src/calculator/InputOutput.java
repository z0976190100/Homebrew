package calculator;

import java.math.BigDecimal;
import java.util.Scanner;

class InputOutput {

static String getUserInput (){
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
}


static void userOutput(BigDecimal output){
    System.out.println("=" + output.toString());
}

/*private void parseUserInput (String uInput){
    DecimalFormat df = new DecimalFormat();
    df.setParseBigDecimal(true);
   BigDecimal parsed = new BigDecimal(uInput);
    ///CalculatorController.dispatchOperator(uInput);
}*/


}
