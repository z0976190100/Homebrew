package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinarySubtracting extends BinaryOperationAbs {


    public static BinarySubtracting getInstance() {
        return new BinarySubtracting();
    }

    private BinarySubtracting(){}

    BinarySubtracting(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    public void evaluateXY(BigDecimal x, BigDecimal y) {
        BigDecimal subtract = x.subtract(y);
        eStack.push(subtract);
    }
}
