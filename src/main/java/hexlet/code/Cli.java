package hexlet.code;

import java.util.Scanner;

public class Cli {
    static void sayHello() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
    }
}
