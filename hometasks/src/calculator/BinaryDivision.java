package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinaryDivision extends BinaryOperation {

    BinaryDivision(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    @Override
    BigDecimal evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.divide(y));
        return null;
    }
}
