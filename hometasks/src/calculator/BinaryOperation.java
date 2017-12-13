package calculator;

import java.math.BigDecimal;

public abstract class BinaryOperation {

    BigDecimal operandX;
    BigDecimal operandY;

    //abstract BigDecimal evaluateXY(BigDecimal x, BigDecimal y);

    public BigDecimal getOperandX() {
        return operandX;
    }

    public void setOperandX(BigDecimal operandX) {
        this.operandX = operandX;
    }

    public BigDecimal getOperandY() {
        return operandY;
    }

    public void setOperandY(BigDecimal operandY) {
        this.operandY = operandY;
    }
}
