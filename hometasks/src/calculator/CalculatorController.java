package calculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static calculator.CalculatorStack.eStack;
import static calculator.CalculatorStack.eStackCounter;

public class CalculatorController {

    void startCalc(){
        eStackCounter = 0;

        dispatchOperandX();
    }

    void stackTop() {
        if (eStackCounter == 0) {
            return;
        }
        dispatchOperator();
    }

   private void dispatchOperandX() {
        String par = InputOutput.getUserInput();

        try{
            int test = Integer.parseInt(par);
            DecimalFormat df = new DecimalFormat();
            df.setParseBigDecimal(true);
            BigDecimal opX = new BigDecimal(par);
            eStack.add(opX);
           eStackCounter = eStack.size()-1;
            dispatchOperator();
        }catch(Exception e){
            System.out.println("wrong input, try snova: ");
            dispatchOperandX();
        }
    }

      void dispatchOperandY() {
        String par = InputOutput.getUserInput();

        try{
            int test = Integer.parseInt(par);
            BigDecimal opY = new BigDecimal(par);
            eStack.add(opY);
           eStackCounter = eStack.size()-1;
            return;
        }catch(Exception e){
            System.out.println("wrong input, try snova: ");
            dispatchOperandY();
        }
    }

   private void dispatchOperator() {
        String par = InputOutput.getUserInput();

        switch (par) {
            case "+":
                // binary operations call
                // call operandY waiting state
                dispatchOperandY();
                new EvaluatorBinaryAdding(eStack.get(eStackCounter-1), eStack.get(eStackCounter));
                InputOutput.userOutput(eStack.get(eStackCounter));
                dispatchOperator();
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
default:
    System.out.println("wrong input, do again.");
    dispatchOperator();
        }
    }
}
