package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int MAX_RANDOM_NUM = 9;
    private static final int MIN_RANDOM_NUM = 1;
    private static final int MAX_COUNT_QUESTIONS = 3;
    private static final String[][] PLAY_GCD = new String[Engine.GAME_ARRAY_LENGTH][];
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

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

    public static void getPlayGCD() {
        for (int i = 0; i < MAX_COUNT_QUESTIONS; i++) {

            int firstRandomNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            int secondRandomNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);

            String numbers = firstRandomNumber + " " + secondRandomNumber;
            int rightAnswer = getAnswer(firstRandomNumber, secondRandomNumber);

            PLAY_GCD[i] = new String[]{numbers, Integer.toString(rightAnswer)};
        }
        Engine.playGame(PLAY_GCD, GAME_DESCRIPTION);
    }
}
