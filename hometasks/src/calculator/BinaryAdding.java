package calculator;

import java.math.BigDecimal;

import static calculator.CalculatorStack.eStack;

public class BinaryAdding extends BinaryOperationImpl implements BinaryOperation {


    static BinaryOperation getInstance() {
        return new BinaryAdding();
    }

    private BinaryAdding() {
        super();
    }

    BinaryAdding(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    public void evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.add(y));
    }

}

