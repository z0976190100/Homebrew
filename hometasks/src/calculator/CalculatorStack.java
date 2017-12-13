package calculator;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class CalculatorStack {

    static List<BigDecimal> eStack = new LinkedList<>();
    static Iterator<BigDecimal> iterator = eStack.iterator();
    static int eStackCounter = 0;

}
