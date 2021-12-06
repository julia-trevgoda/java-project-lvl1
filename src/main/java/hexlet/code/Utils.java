package hexlet.code;

import java.util.Random;

public class Utils {

    // The next 3 methods help to generated random data for the game.

    public static String[] getSignsArray() {
        return new String[]{"+", "*", "-"};
    }

    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(max);
        return randomNumber + min;
    }

    public static String getRandomSign() {
        int randomIndex = new Random().nextInt(getSignsArray().length);
        return getSignsArray()[randomIndex];
    }

}
