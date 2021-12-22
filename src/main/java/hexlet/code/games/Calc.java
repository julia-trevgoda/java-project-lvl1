package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_RANDOM_NUM = 0;
    private static final int MAX_RANDOM_NUM = 19;
    private static final int MAX_COUNT_QUESTIONS = 3;
    private static final String[][] PLAY_CALC = new String[Engine.GAME_ARRAY_LENGTH][];
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";

    static int getAnswer(int num1, int num2, String sign) {
        switch (sign) {
            case ("+"):
                return num1 + num2;
            case ("-"):
                return num1 - num2;
            case ("*"):
                return num1 * num2;
            default:
                return 0;
        }
    }

    public static void getPlayCalc() {
        for (int i = 0; i < MAX_COUNT_QUESTIONS; i++) {

            int firstRandomNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            int secondRandomNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            String sign = Utils.getRandomSign();

            int rightAnswer = getAnswer(firstRandomNumber, secondRandomNumber, sign);
            String expression = firstRandomNumber + " " + sign + " " + secondRandomNumber;
            PLAY_CALC[i] = new String[]{expression, Integer.toString(rightAnswer)};
        }
        Engine.playGame(PLAY_CALC, GAME_DESCRIPTION);
    }
}
