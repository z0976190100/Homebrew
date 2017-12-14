package calculator;

import java.math.BigDecimal;
import java.util.Scanner;

import static calculator.CalculatorStack.eStack;
import static calculator.CalculatorStack.eStackCounter;

public class Main {

    public static void main(String[] args) {

        BigDecimal x = null;
        BigDecimal y = null;
        String oper = "";

        CalculatorController calc = new CalculatorController();
        calc.startCalc();

       /* while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            try{
                int iiint = Integer.parseInt(input);
                System.out.println("your int is " + iiint);
            }catch(Exception e){
                System.out.println("wrong input");
            }
        }*/

      /* while (true) {

          if(eStack.get(0) == null){
              eStack.add(io.getUserInput());

              //cases - if decimal then add to e stack, if operand- evaluate and add result
              //output eStack.get(next)
          }
          eStack.add(eStackCounter, io.getUserInput());
          if(eStack.get(eStackCounter) == null){}
            //*Evaluator ev = new EvaluatorBinary() ;
           // ev.evaluateBinary(x, oper, y);
        }*/
    }
}
