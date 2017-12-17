
package calculator;

import java.math.BigDecimal;

public enum BinaryOps {
    ADDING(BinaryAdding.getInstance()),
    SUBSTRACTING(BinarySubtracting.getInstance()),
    DIVISION(BinaryDivision.getInstance()),
    MULTIPLICATION(BinaryMultiplication.getInstance());

    BinaryOps(BinaryOperationAbs op){
        this.op = op;
    }

    BinaryOperationAbs op;

    BinaryOperationAbs getBiOp(){
        return this.op;
    }
}

