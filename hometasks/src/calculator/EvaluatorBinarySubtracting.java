package calculator;

import java.math.BigDecimal;

public class EvaluatorBinarySubtracting extends BinaryOperation {


    public BigDecimal evaluateXY(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }
}
