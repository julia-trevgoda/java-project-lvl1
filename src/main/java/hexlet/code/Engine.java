package hexlet.code;

import java.util.Random;

import static hexlet.code.games.Calc.playCalc;
import static hexlet.code.games.Even.playEven;
import static hexlet.code.games.GCD.playGCD;
import static java.lang.Math.random;

public class Engine {

    private static final int MAX_COUNT_TURNS = 3;

    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;

    public static final int MAX_RANDOM = 10;
    private static String[] signsArray = {"+", "*", "-"};

    public static String[] getSignsArray() {
        return signsArray;
    }

    public static int getRandomNumber() {
        int max = MAX_RANDOM;
        int min = 1;
        int range = max - min + 1;

        int randomNumber = (int) (random() * range) + min;

        return randomNumber;
    }

    public static String getRandomSign() {
        int randomIndex = new Random().nextInt(getSignsArray().length);
        return getSignsArray()[randomIndex];
    }

    static void playGame(int gameChoice) {

        int currentGame = gameChoice;
        switch (currentGame) {
            case (EVEN_GAME):
                System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
                break;
            case (CALC_GAME):
                System.out.println("What is the result of the expression?");
                break;
            case (GCD_GAME):
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            default:
                System.out.println("Select the game");
        }

        int turn = 0;
        int maxCountTurns = MAX_COUNT_TURNS;

        boolean currentResult = false;

        while (turn < maxCountTurns) {

            switch (currentGame) {
                case (EVEN_GAME):
                    currentResult = playEven();
                    break;
                case (CALC_GAME):
                    currentResult = playCalc();
                    break;
                case (GCD_GAME):
                    currentResult = playGCD();
                    break;
                default:
                    System.out.println("Select the game");
            }
            if (currentResult) {
                turn++;
            } else {
                break;
            }
        }
        if (turn == MAX_COUNT_TURNS) {
            System.out.println("Congratulations, " + App.getUserName() + "!");
            System.out.println();
        } else {
            System.out.println("Let's try again, " + App.getUserName() + "!");
            System.out.println();
        }
    }
}
