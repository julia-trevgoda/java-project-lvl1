package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int MIN_RANDOM_NUM = 1;
    public static final int MAX_RANDOM_NUM = 19;

    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(max);
        return randomNumber + min;
    }

    public static int getRandomIndex(int max) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(max);
        return randomNumber;
    }

}
