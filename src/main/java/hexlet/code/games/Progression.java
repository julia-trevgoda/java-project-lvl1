package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {

    private static final int MAX_INDEX_MISSED_NUM = 8;
    private static final int MAX_START_NUM = 5;
    private static final int MAX_PROGRESSION_STEP = 4;
    private static final int PROGRESSION_LENGTH = 10;

    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";

    public static void runProgression() {

        String[][] playProgression = new String[Engine.MAX_COUNT_TURNS][];

        for (int i = 0; i < Engine.MAX_COUNT_TURNS; i++) {
            int indexOfMissedNum = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, MAX_INDEX_MISSED_NUM);
            int currentNum = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, MAX_START_NUM);
            int stepOfProgression = Utils.getRandomNumber(Utils.MIN_RANDOM_NUM, MAX_PROGRESSION_STEP);
            int missedNum = 0;

            StringBuilder progression = new StringBuilder();
            progression.append(currentNum + " ");

            for (int j = 1; j < PROGRESSION_LENGTH; j++) {
                currentNum += stepOfProgression;
                if (j == indexOfMissedNum) {
                    progression.append(".. ");
                    missedNum = currentNum;
                } else {
                    progression.append(currentNum + " ");
                }
            }
            playProgression[i] = new String[] {progression.toString().trim(), Integer.toString(missedNum)};
        }
        Engine.playGame(playProgression, GAME_DESCRIPTION);
    }
}
