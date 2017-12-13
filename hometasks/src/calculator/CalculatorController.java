package calculator;

import static calculator.CalculatorStack.eStack;
import static calculator.CalculatorStack.eStackCounter;

public class CalculatorController {

    void stackTop() {
        if (eStackCounter == 0) {
            return;
        }
        dispatchOperator("out");
    }

    static void dispatchOperandX(String par) {

    }

    static void dispatchOperator(String par) {
        // cases with regexps
        switch (par) {
            case "+":
                // binary operations call
                // call operandY waiting state
                break;
            case "-":
                //call operandY waiting state
                break;
            case "/":
                // call binary division meth
                break;
            case "*":
                // call binary divi
                break;

            // call operandY waiting state
            case "d":
                //clear last input;
                break;
            case "c":
                // clear eStack, output zero, operandY wait state
                break;
            case "=":
                // result output, clear eStack, put result on top, any input wait state
                break;
            case "out":
                //
                break;

        }
    }
}
