package hexlet.code;

import java.util.Scanner;

public class App {

    private static String userName = null;

    public static String getUserName() {
        return userName;
    }

    public static void main(String[] args) {
        while (true) {
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
            } else if (userName == null && gameChoice > 1) {
                userName = Cli.sayHello();
                Engine.playGame(gameChoice);
            } else {
                userName = Cli.sayHello();
                Engine.playGame(gameChoice);
            }
        }
    }
}
