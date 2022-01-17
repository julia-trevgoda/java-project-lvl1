package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String GAME_DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void runEven() {

        String[][] playEven = new String[Engine.MAX_COUNT_TURNS][];

        for (int i = 0; i < Engine.MAX_COUNT_TURNS; i++) {

            int currentNumber = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, Utils.MAX_RANDOM_NUM);
            String rightAnswer = isEven(currentNumber) ? "yes" : "no";
            playEven[i] = new String[]{Integer.toString(currentNumber), rightAnswer};
        }
        Engine.playGame(playEven, GAME_DESCRIPTION);
    }
}

