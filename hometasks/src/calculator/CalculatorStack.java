package calculator;

import java.math.BigDecimal;
import java.util.*;

public abstract class CalculatorStack {

    static Deque<BigDecimal> eStack = new LinkedList<>();
    static Iterator<BigDecimal> iterator = eStack.iterator();
    static int eStackCounter = 0;

}
