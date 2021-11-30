package hexlet.code.games;

import hexlet.code.Engine;


public class Prime {

    private static final int MAX_RANDOM_NUM = 19;
    private static final int MAX_COUNT_QUESTIONS = 4;
    private static String[][] playPrime = new String[Engine.GAME_ARRAY_LENGTH][];

    static String getGameDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

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

    public static String[][] getPlayPrime() {

        playPrime[0] = new String[]{getGameDescription()};

        for (int i = 1; i < MAX_COUNT_QUESTIONS; i++) {

            int currentNumber = Engine.getRandomNumber(MAX_RANDOM_NUM);
            String rightAnswer = getRightAnswer(currentNumber);
            playPrime[i] = new String[]{Integer.toString(currentNumber), rightAnswer};
        }
        return playPrime;
    }
}

