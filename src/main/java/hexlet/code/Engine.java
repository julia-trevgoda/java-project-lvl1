package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int GAME_ARRAY_LENGTH = 3;
    private static final int MAX_COUNT_TURNS = 3;

    public static void playGame(String[][] currentGame, String gameDescription) {
        int lastTurn = 0;
        boolean currentResult;

        System.out.println(gameDescription);

        for (int turn = 0; turn < MAX_COUNT_TURNS; turn++) {

            String question = "Question: " + currentGame[turn][0];
            System.out.println(question);

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            String rightAnswer = currentGame[turn][1];

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
        } else {
            System.out.println("Let's try again, " + App.getUserName() + "!");
        }
        System.out.println();
    }
}
