package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;

    private static String userName = null;

    public static String getUserName() {
        return userName;
    }

    public static void main(String[] args) {
//        while (true) {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int gameChoice = scanner.nextInt();

        String currentChoice = "Your choice: " + gameChoice;
        System.out.println(currentChoice);
        System.out.println();


        if (gameChoice == 1) {
            userName = Cli.sayHello();
        } else if (gameChoice == 0) {
            System.exit(0);
//            } else if (userName == null && gameChoice > 1) {
//                userName = Cli.sayHello();
//                Engine.playGame(gameChoice);
        } else {
            userName = Cli.sayHello();

            switch (gameChoice) {
                case (EVEN_GAME):
                    Even.getPlayEven();
                    break;
                case (CALC_GAME):
                    Calc.getPlayCalc();
                    break;
                case (GCD_GAME):
                    GCD.getPlayGCD();
                    break;
                case (PROGRESSION_GAME):
                    Progression.getPlayProgression();
                    break;
                case (PRIME_GAME):
                    Prime.getPlayPrime();
                    break;
                default:
                    System.out.println("Select the game");
            }

        }
    }
//    }
}
