package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Calc {

    public static final int MAX_RANDOM = 20;
    private static String[] signsArray = {"+", "*", "-"};

    public static String[] getSignsArray() {
        return signsArray;
    }

    static int getRandomNumber() {
        int max = MAX_RANDOM;
        int min = 1;
        int range = max - min + 1;

        int randomNumber = (int) (random() * range) + min;

        return randomNumber;
    }

    static String getRandomSign(String[] charArray) {
        int randomIndex = new Random().nextInt(charArray.length);
        return charArray[randomIndex];
    }

    static int getAnswer(int num1, int num2, String sign) {
        switch (sign) {
            case ("+"): return num1 + num2;
            case ("-"): return num1 - num2;
            case ("*"): return num1 * num2;
            default: return 0;
        }
    }

    public static boolean playCalc() {

        int firstRandomNumber = getRandomNumber();
        int secondRandomNumber = getRandomNumber();
        String sign = getRandomSign(getSignsArray());

        System.out.println("Question: " + firstRandomNumber + " " + sign + " " + secondRandomNumber);

        int rightAnswer = getAnswer(firstRandomNumber, secondRandomNumber, sign);

        Scanner scanner = new Scanner(System.in);
        int answer = Integer.parseInt(scanner.next());
        System.out.println("Your answer: " + answer);

        if (answer == rightAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
            return false;
        }
    }
}
