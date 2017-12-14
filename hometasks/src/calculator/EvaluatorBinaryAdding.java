package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStackCounter;
import static calculator.CalculatorStack.eStack;

public class EvaluatorBinaryAdding extends BinaryOperation {

    EvaluatorBinaryAdding(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    public BigDecimal evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.add(x.add(y));
        eStackCounter = eStack.size()-1;
        return null;
    }
}
