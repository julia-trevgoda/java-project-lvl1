package hexlet.code;

import java.util.Scanner;

public class App {

    private static String userName = null;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter the game number and press Enter."
                    + "\n1 - Greet"
                    + "\n2 - Even"
                    + "\n0 - Exit");

            Scanner scanner = new Scanner(System.in);
            int gameChoice = scanner.nextInt();

            String currentChoice = "Your choice: " + gameChoice;
            System.out.println(currentChoice);

            switch (gameChoice) {
                case (1):
                    userName = Cli.sayHello();
                    break;
                case (2):
                    if (userName == null) {
                        userName = Cli.sayHello();
                    }
                    Even.playEven(userName);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
