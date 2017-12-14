package calculator;

import java.math.BigDecimal;

public interface EvaluatorBinary extends Evaluator {

    @Override
    public  BigDecimal evaluateBinary(BigDecimal x, BigDecimal y);
}
