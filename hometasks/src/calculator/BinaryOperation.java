package calculator;

import java.math.BigDecimal;

public abstract class BinaryOperation {


    private BigDecimal operandX;
    private BigDecimal operandY;

   abstract BigDecimal evaluateXY(BigDecimal x, BigDecimal y);

    public BigDecimal getOperandX() {
        return operandX;
    }

    public void setOperandX(String operandX) {
        this.operandX = new BigDecimal(operandX);
    }

    public BigDecimal getOperandY() {
        return operandY;
    }

    public void setOperandY(BigDecimal operandY) {
        this.operandY = operandY;
    }
}
