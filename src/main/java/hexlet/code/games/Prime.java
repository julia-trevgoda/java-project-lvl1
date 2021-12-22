package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {

    private static final int MAX_RANDOM_NUM = 19;
    private static final int MIN_RANDOM_NUM = 1;
    private static final int MAX_COUNT_QUESTIONS = 3;
    private static final String[][] PLAY_PRIME = new String[Engine.GAME_ARRAY_LENGTH][];
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    static boolean isPrime(int num) {
        int divisors = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors++;
            }
        }
        return divisors == 2;
    }

    static String getRightAnswer(int num) {
        return isPrime(num) ? "yes" : "no";
    }

    public static void getPlayPrime() {
        for (int i = 0; i < MAX_COUNT_QUESTIONS; i++) {

            int currentNumber = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_RANDOM_NUM);
            String rightAnswer = getRightAnswer(currentNumber);
            PLAY_PRIME[i] = new String[]{Integer.toString(currentNumber), rightAnswer};
        }
        Engine.playGame(PLAY_PRIME, GAME_DESCRIPTION);
    }
}

