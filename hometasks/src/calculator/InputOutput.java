package calculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InputOutput {

BigDecimal getUserInput (){
    Scanner sc = new Scanner(System.in);
    String userInput = sc.nextLine();
    parseUserInput(userInput);
    return null;
}

void userInputRecognize(String ui){
    switch (ui){

        case "+":

    }

}

// cases with regexps
private void parseUserInput (String uInput){
    DecimalFormat df = new DecimalFormat();
    df.setParseBigDecimal(true);
   BigDecimal parsed = new BigDecimal(uInput);
    CalculatorController.dispatchOperator(uInput);
}


}
