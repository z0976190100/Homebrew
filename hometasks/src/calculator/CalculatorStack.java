package calculator;

import java.math.BigDecimal;
import java.util.*;

abstract class CalculatorStack {

    static Deque<BigDecimal> eStack = new LinkedList<>();
    static Iterator<BigDecimal> iterator = eStack.iterator();

}
