package calculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.LinkedList;

import static calculator.CalculatorStack.eStack;

class CalculatorController {

    void startCalc(){
        eStack = new LinkedList<>();
        System.out.println("0");
        DecimalFormat df = new DecimalFormat();
        df.setParseBigDecimal(true);
        dispatchOperandX();
    }

   private void dispatchOperandX() {
        String par = InputOutput.getUserInput();

        try{
            BigDecimal opX = new BigDecimal(par);
            eStack.push(opX);
            dispatchOperator();
        }catch(Exception e){
            System.out.println("wrong input, try snova: ");
            dispatchOperandX();
        }
    }

      void dispatchOperandY() {
        String par = InputOutput.getUserInput();
        try{
            BigDecimal opY = new BigDecimal(par);
            eStack.push(opY);
            return;
        }catch(Exception e){
            System.out.println("wrong input, NaN: ");
            dispatchOperandY();
        }
    }

   private void dispatchOperator() {
        String par = InputOutput.getUserInput();

        switch (par) {
            case "+":
                // binary operations call

                new BinaryAdding(eStack.pop(),binaryCase());
                InputOutput.userOutput(eStack.getLast());
                dispatchOperator();
                break;
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

    BigDecimal binaryCase(){
        dispatchOperandY();
       return eStack.pop();

    }

}
