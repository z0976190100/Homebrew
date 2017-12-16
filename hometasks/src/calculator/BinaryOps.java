
package calculator;

import java.math.BigDecimal;

public enum BinaryOps {
    ADDING(BinaryAdding.getInstance()), SUBSTRACTING(BinarySubtracting.getInstance()), DIVISION(BinaryDivision.getInstance()), MULTIPLICATION(BinaryMultiplication.getInstance());

    BinaryOps(BinaryOperation op){
        this.op = op;
    }

    BinaryOperation op;

    BinaryOperation getBiOp(){
        return this.op;
    }
}

