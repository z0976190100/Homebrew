package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinaryOperationAbs implements BinaryOperation {

    @Override
    public void evaluateXY(BigDecimal x, BigDecimal y) {

    }

    void binaryGetOperandY() {
        String par = InputOutput.getUserInput();
        try {
            BigDecimal opY = new BigDecimal(par);
            eStack.push(opY);
        } catch (Exception e) {
            System.out.println("wrong input, NaN: ");
            binaryGetOperandY();
        }
    }

    BigDecimal binaryCaseB() {
        binaryGetOperandY();
        return eStack.pop();
    }

    public void alterEvaluate() {
        evaluateXY(eStack.pop(), binaryCaseB());
        InputOutput.userOutput(eStack.getLast());
    }}
