package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {

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

    public static void runPrime() {

        String[][] playPrime = new String[Engine.MAX_COUNT_TURNS][];

        for (int i = 0; i < Engine.MAX_COUNT_TURNS; i++) {

            int currentNumber = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, Utils.MAX_RANDOM_NUM);
            String rightAnswer = isPrime(currentNumber) ? "yes" : "no";
            playPrime[i] = new String[]{Integer.toString(currentNumber), rightAnswer};
        }
        Engine.playGame(playPrime, GAME_DESCRIPTION);
    }
}

