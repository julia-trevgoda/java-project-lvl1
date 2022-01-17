package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {

    private static final String GAME_DESCRIPTION = "What is the result of the expression?";

    public static String[] getSignsArray() {
        return new String[]{"+", "*", "-"};
    }

    public static String getRandomSign() {
        int randomIndex = new Random().nextInt(getSignsArray().length);
        return getSignsArray()[randomIndex];
    }

    static int calculateAnswer(int num1, int num2, String sign) {
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

    public static void runCalc() {

        String[][] playCalc = new String[Engine.MAX_COUNT_TURNS][];

        for (int i = 0; i < Engine.MAX_COUNT_TURNS; i++) {

            int firstRandomNumber = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, Utils.MAX_RANDOM_NUM);
            int secondRandomNumber = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, Utils.MAX_RANDOM_NUM);
            String sign = getRandomSign();

            int rightAnswer = calculateAnswer(firstRandomNumber, secondRandomNumber, sign);
            String expression = firstRandomNumber + " " + sign + " " + secondRandomNumber;
            playCalc[i] = new String[]{expression, Integer.toString(rightAnswer)};
        }
        Engine.playGame(playCalc, GAME_DESCRIPTION);
    }
}
