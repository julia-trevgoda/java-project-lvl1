package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    static int getAnswer(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        return num1 + num2;
    }

    public static boolean playGCD() {

        int firstRandomNumber = Engine.getRandomNumber();
        int secondRandomNumber = Engine.getRandomNumber();

        System.out.println("Question: " + firstRandomNumber + " " + secondRandomNumber);

        int rightAnswer = getAnswer(firstRandomNumber, secondRandomNumber);

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
