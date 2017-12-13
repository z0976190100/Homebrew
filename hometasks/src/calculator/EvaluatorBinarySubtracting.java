package calculator;

import java.math.BigDecimal;

public class EvaluatorBinarySubtracting implements EvaluatorBinary {

    @Override
    public BigDecimal evaluateBinary(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }
}
