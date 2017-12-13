package calculator;

import java.math.BigDecimal;

public class EvaluatorBinaryAdding extends BinaryOperation implements EvaluatorBinary {

    @Override
    public BigDecimal evaluateBinary(BigDecimal x, BigDecimal y) {

        return x.add(y);
    }
}
