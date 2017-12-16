package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinarySubtracting implements BinaryOperation {


    public static BinaryOperation getInstance() {
        return new BinarySubtracting();
    }
 private BinarySubtracting(){};

    BinarySubtracting(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    public void evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.subtract(y));
    }

    @Override
    public void alterEvaluate() {

    }
}
