package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;


public class Even {

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static String getRightAnswer(int num) {
        return isEven(num) ? "yes" : "no";
    }

    public static boolean playEven() {

        int currentNumber = Engine.getRandomNumber();
        String rightAnswer = getRightAnswer(currentNumber);
        System.out.println("Question: " + currentNumber);

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Your answer: " + answer);


        if (answer.equals(rightAnswer)) {
            System.out.println("Correct!");
            System.out.println();
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
            System.out.println();
            return false;
        }
    }
}

