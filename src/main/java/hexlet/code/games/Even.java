package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MAX_RANDOM_NUM = 99;
    private static final int MIN_RANDOM_NUM = 1;
    private static final int MAX_COUNT_QUESTIONS = 3;
    private static final String[][] PLAY_EVEN = new String[Engine.GAME_ARRAY_LENGTH][];
    private static final String GAME_DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static String getRightAnswer(int num) {
        return isEven(num) ? "yes" : "no";
    }

    public static void getPlayEven() {
        for (int i = 0; i < MAX_COUNT_QUESTIONS; i++) {

            int currentNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            String rightAnswer = getRightAnswer(currentNumber);
            PLAY_EVEN[i] = new String[]{Integer.toString(currentNumber), rightAnswer};
        }
        Engine.playGame(PLAY_EVEN, GAME_DESCRIPTION);
    }
}

