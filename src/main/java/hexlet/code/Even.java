package hexlet.code;

import java.util.Scanner;

import static java.lang.Math.random;

public class Even {

    public static final int MAX_COUNT_TURNS = 3;
    public static final int MAX_RANDOM = 10;

    static int getRandomNumber() {

        int max = MAX_RANDOM;
        int min = 1;

        int range = max - min + 1;

        int randomNumber = (int) (random() * range) + min;

        return randomNumber;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static String getRightAnswer(int num) {
        return isEven(num) ? "yes" : "no";
    }

    static void playEven(String userName) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        int turn = 0;
        int maxCountTurns = MAX_COUNT_TURNS;


        while (turn < maxCountTurns) {

            int currentNumber = getRandomNumber();
            String rightAnswer = getRightAnswer(currentNumber);
            System.out.println("Question: " + currentNumber);

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);

            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                turn++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                break;
            }
        }
        if (turn == maxCountTurns) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}

