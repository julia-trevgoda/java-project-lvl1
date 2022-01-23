package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static final int EXIT = 0;
    public static final int GREETINGS = 1;
    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;

    public static void main(String[] args) {
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

        switch (gameChoice) {
            case (GREETINGS):
                Cli.sayHello();
                break;
            case (EVEN_GAME):
                Even.runEven();
                break;
            case (CALC_GAME):
                Calc.runCalc();
                break;
            case (GCD_GAME):
                GCD.runGCD();
                break;
            case (PROGRESSION_GAME):
                Progression.runProgression();
                break;
            case (PRIME_GAME):
                Prime.runPrime();
                break;
            case (EXIT):
                return;
            default:
                System.out.println("Select the game");
        }
    }
}
