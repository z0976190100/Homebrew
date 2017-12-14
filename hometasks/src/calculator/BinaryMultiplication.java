package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinaryMultiplication implements BinaryOperation {

    BinaryMultiplication(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    @Override
   public BigDecimal evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.multiply(y));
        return null;
    }
}
