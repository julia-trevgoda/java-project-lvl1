package hexlet.code.games;

import hexlet.code.Engine;


public class Even {

    private static final int MAX_RANDOM_NUM = 99;
    private static final int MAX_COUNT_QUESTIONS = 4;
    private static String[][] playEven = new String[Engine.GAME_ARRAY_LENGTH][];

    static String getGameDescription() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static String getRightAnswer(int num) {
        return isEven(num) ? "yes" : "no";
    }

    public static String[][] getPlayEven() {

        playEven[0] = new String[]{getGameDescription()};

        for (int i = 1; i < MAX_COUNT_QUESTIONS; i++) {

            int currentNumber = Engine.getRandomNumber(MAX_RANDOM_NUM);
            String rightAnswer = getRightAnswer(currentNumber);
            playEven[i] = new String[]{Integer.toString(currentNumber), rightAnswer};
        }
        return playEven;
    }
}

