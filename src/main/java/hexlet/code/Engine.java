package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    // The next 3 methods help to generated random data for the game.

    public static String[] getSignsArray() {
        return new String[]{"+", "*", "-"};
    }

    public static int getRandomNumber(int maxNumLengthPlusOne) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(maxNumLengthPlusOne);
        return randomNumber + 1;
    }

    public static String getRandomSign() {
        int randomIndex = new Random().nextInt(getSignsArray().length);
        return getSignsArray()[randomIndex];
    }

    // The game starts here.

    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;

    public static final int GAME_ARRAY_LENGTH = 4;

    private static final int MAX_COUNT_TURNS = 3;
    private static String[][] currentGame;

    static void playGame(int gameChoice) {

        int selectedGame = gameChoice;

        switch (selectedGame) {
            case (EVEN_GAME):
                currentGame = Even.getPlayEven();
                System.out.println(currentGame[0][0]);
                break;
            case (CALC_GAME):
                currentGame = Calc.getPlayCalc();
                System.out.println(currentGame[0][0]);
                break;
            case (GCD_GAME):
                currentGame = GCD.getPlayGCD();
                System.out.println(currentGame[0][0]);
                break;
            case (PROGRESSION_GAME):
                currentGame = Progression.getPlayProgression();
                System.out.println(currentGame[0][0]);
                break;
            default:
                System.out.println("Select the game");
        }

        int lastTurn = 0;
        int maxCountTurns = MAX_COUNT_TURNS;

        boolean currentResult = false;

        for (int turn = 0; turn < maxCountTurns; turn++) {

            String question = "Question: " + currentGame[turn + 1][0];
            System.out.println(question);

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            String rightAnswer = currentGame[turn + 1][1];

            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                System.out.println();
                currentResult = true;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println();
                currentResult = false;
            }

            if (currentResult) {
                lastTurn = turn + 1;
            } else {
                break;
            }
        }
        if (lastTurn == MAX_COUNT_TURNS) {
            System.out.println("Congratulations, " + App.getUserName() + "!");
            System.out.println();
        } else {
            System.out.println("Let's try again, " + App.getUserName() + "!");
            System.out.println();
        }
    }
}
