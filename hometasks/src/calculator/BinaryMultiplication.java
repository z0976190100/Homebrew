package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinaryMultiplication extends BinaryOperationAbs {


    public static BinaryMultiplication getInstance() {
        return new BinaryMultiplication();
    }

    private BinaryMultiplication() {
    }

    BinaryMultiplication(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    @Override
   public void evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.multiply(y));
    }

}
