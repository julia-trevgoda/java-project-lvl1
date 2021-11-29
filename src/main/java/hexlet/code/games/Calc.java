package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {


    static int getAnswer(int num1, int num2, String sign) {
        switch (sign) {
            case ("+"): return num1 + num2;
            case ("-"): return num1 - num2;
            case ("*"): return num1 * num2;
            default: return 0;
        }
    }

    public static boolean playCalc() {

        int firstRandomNumber = Engine.getRandomNumber();
        int secondRandomNumber = Engine.getRandomNumber();
        String sign = Engine.getRandomSign();

        System.out.println("Question: " + firstRandomNumber + " " + sign + " " + secondRandomNumber);

        int rightAnswer = getAnswer(firstRandomNumber, secondRandomNumber, sign);

        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.next());
        System.out.println("Your answer: " + answer);

        if (answer == rightAnswer) {
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
