package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    static int findGCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        return num1 + num2;
    }

    public static void runGCD() {

        String[][] playGCD = new String[Engine.MAX_COUNT_TURNS][];

        for (int i = 0; i < Engine.MAX_COUNT_TURNS; i++) {

            int firstRandomNumber = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, Utils.MAX_RANDOM_NUM);
            int secondRandomNumber = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, Utils.MAX_RANDOM_NUM);

            String numbers = firstRandomNumber + " " + secondRandomNumber;
            int rightAnswer = findGCD(firstRandomNumber, secondRandomNumber);

            playGCD[i] = new String[]{numbers, Integer.toString(rightAnswer)};
        }
        Engine.playGame(playGCD, GAME_DESCRIPTION);
    }
}
