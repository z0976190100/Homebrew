package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinarySubtracting implements BinaryOperation {


    BinarySubtracting(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    public BigDecimal evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.subtract(y));
        return null;
    }

}
