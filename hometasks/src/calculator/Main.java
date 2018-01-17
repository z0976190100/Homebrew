package calculator;

public class Main {

    public static void main(String[] args) {



        /*CalculatorController calc = new CalculatorController();*/
        CalculatorController.startCalc();


    }
}

// terms for regexp:
// - only digits, dot, minus, plus and commas allowed
// - minus or plus, or dot only nor or once in a row
// - minus or plus only on start of the row
// - no commas repeating one by one
// - no dots repeating one by one
// - no commas on start of row
// - no commas at the end of row
// - only one dot for row
// - no dot and comma one after one
// - three digits between commas excluding first comma
// - not more then three digits before first comma