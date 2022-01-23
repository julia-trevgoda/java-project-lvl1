package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final String[] SIGNS_ARRAY = {"+", "*", "-"};

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
            int randomIndex = Utils.getRandomIndex(SIGNS_ARRAY.length);
            String sign = SIGNS_ARRAY[randomIndex];

            int rightAnswer = calculateAnswer(firstRandomNumber, secondRandomNumber, sign);
            String expression = firstRandomNumber + " " + sign + " " + secondRandomNumber;
            playCalc[i] = new String[]{expression, Integer.toString(rightAnswer)};
        }
        Engine.playGame(playCalc, GAME_DESCRIPTION);
    }
}
