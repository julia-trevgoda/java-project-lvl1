package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int MAX_RANDOM_NUM = 9;
    private static final int MIN_RANDOM_NUM = 1;
    private static final int MAX_COUNT_QUESTIONS = 4;
    private static String[][] playGCD = new String[Engine.GAME_ARRAY_LENGTH][];

    static String getGameDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

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

    public static String[][] getPlayGCD() {

        playGCD[0] = new String[]{getGameDescription()};

        for (int i = 1; i < MAX_COUNT_QUESTIONS; i++) {

            int firstRandomNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            int secondRandomNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);

            String numbers = firstRandomNumber + " " + secondRandomNumber;
            int rightAnswer = getAnswer(firstRandomNumber, secondRandomNumber);

            playGCD[i] = new String[]{numbers, Integer.toString(rightAnswer)};
        }
        return playGCD;
    }
}
