package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinaryAdding implements BinaryOperation {

    BinaryAdding(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    public BigDecimal evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.add(y));
        return null;
    }
}
