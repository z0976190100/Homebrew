package calculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static calculator.BinaryOps.ADDING;
import static calculator.CalculatorStack.eStack;

class CalculatorController {

    // registration of binary ops
    static Map<String, BinaryOps> binaryOperationMap = new HashMap<>();

    static {
        binaryOperationMap.put("+", ADDING);
    }

    static void startCalc() {
        eStack = new LinkedList<>();
        System.out.println("0");
        DecimalFormat df = new DecimalFormat();
        df.setParseBigDecimal(true);
        getOperandX();
    }

    static void getOperandX() {
        String par = InputOutput.getUserInput();

        try {
            BigDecimal opX = new BigDecimal(par);
            eStack.push(opX);
            dispatchOperator();
        } catch (Exception e) {
            System.out.println("wrong input, NaN : ");
            getOperandX();
        }
    }

    static void getOperandY() {
        String par = InputOutput.getUserInput();
        try {
            BigDecimal opY = new BigDecimal(par);
            eStack.push(opY);
            return;
        } catch (Exception e) {
            System.out.println("wrong input, NaN: ");
            getOperandY();
        }
    }

    static void dispatchOperator() {
        String par = InputOutput.getUserInput();
// if unary

        // if binary
        if (binaryOperationMap.containsKey(par)) {
           binaryOperationMap.get(par).getBiOp().alterEvaluate();

            dispatchOperator();
        }


        switch (par) {
           /* case "+":
                // binary operations call

                new BinaryAdding(eStack.pop(),binaryCase());
                InputOutput.userOutput(eStack.getLast());
                dispatchOperator();
                break;*/
            case "-":
                new BinarySubtracting(eStack.pop(), binaryCase());
                InputOutput.userOutput(eStack.getLast());
                dispatchOperator();
                break;
            case "/":
                new BinaryDivision(eStack.pop(), binaryCase());
                InputOutput.userOutput(eStack.getLast());
                dispatchOperator();
                break;
            case "*":
                new BinaryMultiplication(eStack.pop(), binaryCase());
                InputOutput.userOutput(eStack.getLast());
                dispatchOperator();
                break;
            case "d":
                //clear last input;
                break;
            case "c":
                startCalc();
                break;
            case "=":
                // result output, clear eStack, put result on top, any input wait state
                break;
            case "out":
                System.exit(0);
                break;
            default:
                System.out.println("wrong input, do again.");
                dispatchOperator();
        }
    }

    static BigDecimal binaryCase() {
        getOperandY();
        return eStack.pop();

    }

}
