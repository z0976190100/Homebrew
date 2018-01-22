package calculator;



import java.math.BigDecimal;
import java.math.RoundingMode;

import static calculator.CalculatorStack.eStack;

public class BinaryDivision extends BinaryOperationAbs {


    public static BinaryDivision getInstance() {
        return new BinaryDivision();
    }

    private BinaryDivision() {
    }

    BinaryDivision(BigDecimal x, BigDecimal y) {
        evaluateXY(x, y);
    }

    @Override
    public void evaluateXY(BigDecimal x, BigDecimal y) {
        eStack.push(x.divide(y, 3, RoundingMode.HALF_DOWN));
    }

}
