package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_RANDOM_NUM = 0;
    private static final int MAX_RANDOM_NUM = 19;
    private static final int MAX_COUNT_QUESTIONS = 4;
    private static String[][] playCalc = new String[Engine.GAME_ARRAY_LENGTH][];

    static String getGameDescription() {
        return "What is the result of the expression?";
    }

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

    public static String[][] getPlayCalc() {

        playCalc[0] = new String[]{getGameDescription()};

        for (int i = 1; i < MAX_COUNT_QUESTIONS; i++) {

            int firstRandomNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            int secondRandomNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            String sign = Utils.getRandomSign();

            int rightAnswer = getAnswer(firstRandomNumber, secondRandomNumber, sign);
            String expression = firstRandomNumber + " " + sign + " " + secondRandomNumber;
            playCalc[i] = new String[]{expression, Integer.toString(rightAnswer)};
        }
        return playCalc;
    }
}
