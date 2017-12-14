package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinaryMultiplication extends BinaryOperation {

    BinaryMultiplication(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }
    @Override
    BigDecimal evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.multiply(y));
        return null;
    }
}
