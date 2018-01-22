package regex_training;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {




            while (true){

                System.out.println("Enter your RegExp: ");
                Scanner sc = new Scanner(System.in);
                Pattern pattern = Pattern.compile(sc.nextLine());

                System.out.println("Enter string you want to you know what:");
                Matcher matcher = null;

                try {
                    matcher = pattern.matcher(sc.next("(\\+?|\\-?)(0\\.)?((\\,?)(\\d){1,3})*\\.?\\d+"));
                } catch (InputMismatchException e) {
                    System.out.println("repeat input.");
                    matcher = pattern.matcher("u");
                }

                boolean hit = false;

                while (matcher.find()){
                    System.out.printf("I found the text " + "\"%s\" starting at index %d and ending at index %d.%n",
                            matcher.group(),
                            matcher.start(),
                            matcher.end());
                    hit = true;
                }
                if(!hit){
                    System.out.println("No match found.");
                }
        }
    }

}
