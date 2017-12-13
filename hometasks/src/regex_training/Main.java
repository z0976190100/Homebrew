package regex_training;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

       /* Console console = System.console();

        if(console == null){
            System.err.println("Console not exist");
            System.exit(1);*/

        Scanner sc = new Scanner(System.in);

            while (true){

                System.out.println("%nEnter your RegExp: ");

                Pattern pattern =
                        Pattern.compile(sc.nextLine());

                System.out.println("Enter string you want to you know what:");
                Matcher matcher =
                        pattern.matcher(sc.nextLine());

                boolean hit = false;

                while (matcher.find()){
                    System.out.printf("I found the text " + "\"%s\" starting at index %d and ending at index %d.%n",
                            matcher.group(),
                            matcher.start(),
                            matcher.end());
                    hit = true;
                }
                if(!hit){
                    System.out.printf("No match found.%n");
                }
        }
    }

}
