package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int MAX_COUNT_TURNS = 3;

    public static void playGame(String[][] currentGame, String gameDescription) {

        Scanner nameInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Brain Games! May I have your name?");
        String userName = nameInput.next();
        System.out.println(gameDescription);

        for (int turn = 0; turn < MAX_COUNT_TURNS; turn++) {

            String question = "Question: " + currentGame[turn][0];
            System.out.println(question);

            Scanner answerInput = new Scanner(System.in);
            String answer = answerInput.nextLine();
            System.out.println("Your answer: " + answer);

            String rightAnswer = currentGame[turn][1];

            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                System.out.println();
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                System.out.println();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.out.println();
    }
}
